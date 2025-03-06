package com.revature;

//To create a custom thread, we can extend the Thread class or implement Runnable
//They accomplish pretty much the same thing - giving us the run() method to override

public class CustomThread implements Runnable {

    //the run() method defines what a thread does when it is started
    @Override
    public void run() {

        //we'll just run through a simple for loop and print a message
        //this will help us watch some threads race

        String name = Thread.currentThread().getName();
        System.out.println(name + " is starting!");

        for (int i = 0; i < 10; i++){
            System.out.println(name + " is on iteration " + (i + 1));
        }
        
        //TODO: maybe make the threads sleep

    }
}
