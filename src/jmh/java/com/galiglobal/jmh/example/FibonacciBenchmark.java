package com.galiglobal.jmh.example;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Warmup;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import static com.galiglobal.jmh.example.Fibonacci.fibonacci1;
import static com.galiglobal.jmh.example.Fibonacci.fibonacci2;
import static com.galiglobal.jmh.example.Fibonacci.fibonacci3;

public class FibonacciBenchmark {


    @Benchmark
    @Warmup(iterations = 1)
    @Measurement(iterations = 1)
    public long benchmarkFibonacci1() {
        return fibonacci1(7);
    }

    @Benchmark
    @Warmup(iterations = 1)
    @Measurement(iterations = 1)
    public long benchmarkFibonacci2() {
        return fibonacci2(7);
    }

    @Benchmark
    @Warmup(iterations = 1)
    @Measurement(iterations = 1)
    public long benchmarkFibonacci3() {
        return fibonacci3(7);
    }

    public static void main(String[] args) throws RunnerException {
        Options opt = new OptionsBuilder()
                .include(".*" + FibonacciBenchmark.class.getSimpleName() + ".*")
                .forks(1)
                .build();

        new Runner(opt).run();
    }
}
