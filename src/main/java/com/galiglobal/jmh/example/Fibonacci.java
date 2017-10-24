package com.galiglobal.jmh.example;

public class Fibonacci {

    public static long fibonacci1(int n) {
        if (n <= 1) return n;
        else return fibonacci1(n - 1) + fibonacci1(n - 2);
    }

    public static long fibonacci2(int n) {
        long[] f = new long[(int) (n + 1)];
        f[0] = 0;
        f[1] = 1;
        for (int i = 2; i <= n; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }
        return f[(int) n];
    }

    public static long fibonacci3(int n) {
        if (n <= 1) {
            return n;
        }
        long x = 0, y = 1;
        long ans = 0;
        for (int i = 2; i <= n; i++) {
            ans = x + y;
            x = y;
            y = ans;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println("Fibonacci1 seventh value: " + fibonacci1(7));
        System.out.println("Fibonacci2 seventh value: " + fibonacci2(7));
        System.out.println("Fibonacci3 seventh value: " + fibonacci3(7));
    }
}
