package com.adse2401.sess04_threads;

import java.security.SecureRandom;

/**
 * Demonstrate creating new threads by implementing the java.lang.Runnable
 * interface and overriding the run method. Each thread sleeps for a random
 * duration and performs a simulated task.
 * 
 * Author: USER
 */
public class ImplementsRunnable implements Runnable {

    // Secure random interface to generate random sleep duration for each thread
    private static final SecureRandom SLEEP_TIME_GENERATOR = new SecureRandom();
    private final int sleepDuration;
    private final String threadName;

    /**
     * Constructor to initialize the thread with a unique name and sleep
     * duration.
     * 
     * @param threadNum Unique number for naming the thread.
     */
    public ImplementsRunnable(int threadNum) {
        this.threadName = "Thread-" + threadNum;
        this.sleepDuration = SLEEP_TIME_GENERATOR.nextInt(1500);
    }

    @Override
    public void run() {
        try {
            for (int n = 6; n < 10; n++) { // Loop to count properly from 6 to 9
                System.out.println("Output from " + threadName);
                System.out.println("Current value of n is: " + n);

                // Put the thread to sleep for a random duration
                Thread.sleep(sleepDuration);
                System.out.println(threadName + " has slept for " + sleepDuration + " milliseconds");
            }
        } catch (InterruptedException ie) {
            System.err.println(threadName + " was interrupted!");
            System.err.println("Error: " + ie.getLocalizedMessage());
            Thread.currentThread().interrupt(); // Restore interrupted status
        }

        // Print completion message after the loop completes
        System.out.println(threadName + " has finished executing");
    }
}
