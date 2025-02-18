/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.adse2401.sess04_threads;

/**
 *java program to demonstrate creating threads from a class that extends the
 * java.lang.Thread class and one that implements the java.lang.Runnable
 * interface
 * @author USER
 */
public class ThreadsDemo
{

    
    public static void main(String[] args)
    {
        //demonstrate thread execution by crating and starting multiple
        //ExtendThread objects/instances
        for(int n=1; n<5; n++)
        {
            ExtendThread thread= new ExtendThread(n);
            Thread t =new Thread(new ImplementsRunnable(n));
            thread.start();
            t.start();
        }
    }
    
}
