package com.comadse2401sess05_multithreading_and_concurrency;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

/**
 * Java program to split a task among a number of threads if it is computationally
 * intensive.
 * @author USER
 */

class ArraySumTask extends RecursiveTask<Long> {
    private static final int THRESHOLD = 1000; // threshold for splitting tasks
    private final int[] array;
    private final int start;
    private final int end;

    // Constructor to initialize a task
    public ArraySumTask(int[] array, int start, int end) {
        this.array = array;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Long compute() {
        int length = end - start;
        if (length < THRESHOLD) {
            // Base case: when the task is small enough (< 1000), compute directly
            long sum = 0L;
            for (int n = start; n < end; n++) {
                sum += array[n];
            }
            return sum;
        } else {
            // Recursive case: split the task
            int middle = start + length / 2;
            ArraySumTask leftTask = new ArraySumTask(array, start, middle);
            ArraySumTask rightTask = new ArraySumTask(array, middle, end);

            // Fork the subtasks for parallel execution
            leftTask.fork();
            rightTask.fork();

            // Wait and combine the results of the subtasks
            long leftResult = leftTask.join();
            long rightResult = rightTask.join();

            // Return the result
            return leftResult + rightResult;
        }
    }
}

public class ForkJoinDemoJava {

    public static void main(String[] args) {
        // Declare and initialize an array of numbers
        int[] array = new int[1000];
        for (int n = 0; n < array.length; n++) {
            array[n] = n + 1;
        }

        // Create a ForkJoinPool
        ForkJoinPool forkJoinPool = new ForkJoinPool();

        // Create the main task for summing the array
        ArraySumTask mainTask = new ArraySumTask(array, 0, array.length);

        // Call/invoke the task and get the results
        long result = forkJoinPool.invoke(mainTask);

        // Display the result
        System.out.println("The sum of the numbers 1-" + array.length + " is " + result);
    }
}
