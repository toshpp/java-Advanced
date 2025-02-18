package com.comadse2401sess05_multithreading_and_concurrency;

/**
 * Java program to demonstrate various methods of the java.lang.Thread class.
 */

class MyThread extends Thread {
    public MyThread(String name) {
        super(name); // Set the thread's name using the superclass constructor
    }

    @Override
    public void run() {
        System.out.println(getName() + " is running");

        // Demonstrate the sleep method
        System.out.println(getName() + " is sleeping for 20 seconds");
        try {
            Thread.sleep(20000); // Sleep for 20 seconds
        } catch (InterruptedException ie) {
            // Print error message if the thread is interrupted 
            System.err.println(this.getName() + " was interrupted");
            System.err.println("Error: " + ie.getLocalizedMessage());
            Thread.currentThread().interrupt();
        }

        // Print completion message
        System.out.println(this.getName() + " has finished executing");
    }
}

public class ThreadMethodsDemo {
    public static void main(String[] args) {
        // 1. Demonstrate setName() and getName()
        MyThread thread1 = new MyThread("Thread"); // Set name using a constructor
        System.out.println("Name of thread1 is: " + thread1.getName()); // Get the thread's name
        thread1.setName("Renamed Thread-1"); // Set name using setter/mutator
        System.out.println("Name of thread1 after renaming: " + thread1.getName()); // Get thread name after renaming

        // 2. Demonstrate setPriority() and getPriority()
        thread1.setPriority(Thread.MAX_PRIORITY); // Set thread priority to maximum (10)
        System.out.println("Priority of thread1 is: " + thread1.getPriority()); // Get thread priority
        
        // 3. Demonstrate isAlive()
        System.out.println("Is thread1 alive? " + thread1.isAlive());
        
        // 4. Demonstrate start()
        thread1.start(); // Start the thread
        
        // 4.1 demonstrate id Daemon() to find out if the thread is daemon thread
        System.out.println("Thread1 is a daemon thread?:" + thread1.isDaemon());
        
        System.out.println("thread1 is alive?:"+ thread1.isAlive());
        
        // 5. Demonstrate join
        try {
            System.out.println("Waiting for thread1 to complete..");
            thread1.join(); // Main thread waits for thread1 to complete
            System.out.println("Thread has completed");
        } catch (InterruptedException ie) {
            System.err.println("Main thread has interrupted while waiting");
        }

        // 6. Demonstrate isAlive()
        System.out.println("Is thread1 alive after completion? " + thread1.isAlive());
        
        // 7. Demonstrate Thread.currentThread()
        System.out.println("Current thread is: " + Thread.currentThread().getName());
        
        // 8. Demonstrate activeCount()
        System.out.println("Active thread count: " + Thread.activeCount());
    }
}
