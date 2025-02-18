package com.adse2401.sess04_threads;

import java.security.SecureRandom;

/**
 * JAVA class to demonstrate creating new threads by extending the java.lang.Thread class.
 * @author USER
 */
public class ExtendThread extends Thread {

    private static final SecureRandom SLEEP_TIME_GENERATOR = new SecureRandom();
    private final int sleepDuration;

    // Constructor to initialize a thread with a unique name and a sleep duration
    public ExtendThread(int threadNum) {
        // Set the name of the thread using the provided thread number
        this.setName("Thread-" + threadNum);
        // Set a random sleep duration 0 - 1.5 seconds (0-1500 ms)
        this.sleepDuration = SLEEP_TIME_GENERATOR.nextInt(1500);
    }

    @Override
    public void run() {
        try {
            // Loop that simulates work by counting down from 5 to 1
            for (int n = 5; n > 0; n--) {
                System.out.println("Output from " + this.getName());
                System.out.println("Current value of n is: " + n);

                // Put the thread to sleep for a random duration
                Thread.sleep(sleepDuration);
                System.out.println(this.getName() + " has slept for "
                        + sleepDuration + " milliseconds");
            }
        } catch (InterruptedException ie) {
            System.err.println(this.getName() + " was interrupted!");
            System.err.println("Error: " + ie.getLocalizedMessage());
            Thread.currentThread().interrupt(); // Restore interrupted status
        }

        // Print completion message after the loop completes
        System.out.println(this.getName() + " has finished executing");
    }

    public static void main(String[] args) {
        // Demonstrate thread execution by creating and starting multiple
        // ExtendThread objects/instances
        for (int n = 1; n < 5; n++) {
            ExtendThread thread = new ExtendThread(n);
            thread.start();
        }
    }
}
