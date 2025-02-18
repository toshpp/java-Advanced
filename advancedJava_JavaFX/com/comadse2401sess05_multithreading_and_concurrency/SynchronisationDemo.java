package com.comadse2401sess05_multithreading_and_concurrency;

/**
 * java program to demonstrate thread locking and sync
 *
 * @author USER
 */
class Counter
{

    private int count = 0;

    //synchronised method to increament the counter
    public synchronized void increament()
    {
        //count++; only one thread can access this methods at a time
    }

    //method to retrieve the counters current value
    public int getCount()
    {
        return count;
    }

}

public class SynchronisationDemo
{

    public static void main(String[] args)
    {
        // declare and instatitae a counter object/instance
        Counter counter = new Counter();

        //local codunters for each thread
        final int[] thread1Count =
        {
            0
        };
        final int[] thread2Count =
        {
            0
        };

        // create the first thread that will access the increament the increament() method concurrency
        Thread t1 = new Thread(() ->
        {
            for (int n = 0; n < 1000; n++)
            {
                counter.increament();
                thread1Count[0]++;
            }
            System.out.println("thread 1 local count:" + thread1Count[0]);
        });

        // create the second thread that will access the increament()method concurrency
        Thread t2 = new Thread(() ->
        {
            for (int n = 0; n < 1000; n++)
            {
                counter.increament();
                thread2Count[0]++;
            }
            System.out.println("thread 1 local count:" + thread1Count[0]);
        });

        //Start both threads
        t1.start();
        t2.start();

        //wait for both threads to finish
        try
        {
            t1.join();
            t2.join();
        } catch (InterruptedException ie)
        {
            System.err.println("the eror :" + ie.getLocalizedMessage() + "occured");
        }
        //print the final (expected to be 2000 if synchronisation works correctly)
        System.out.println("final counter value after sychronisation:"+ counter.getCount());

    }

}
