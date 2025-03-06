package com.revature;

public class ThreadLauncher {

    public static void main(String[] args) {

        //Instantiate two Threads from the CustomThread class
        CustomThread thread1 = new CustomThread();
        CustomThread thread2 = new CustomThread();

//        thread1.run();
//        thread2.run();

        //This^ doesn't look concurrent at all... we didn't actually create new threads
        //We just ran the run() method, but we need the start() method to create a new thread
            //This is why we see "main" in the output - they're running on the main method (the main THREAD)


        //Let's ACTUALLY make some new threads with the start() method
        Thread t1 = new Thread(thread1);
        t1.start();

        Thread t2 = new Thread(thread2);
        t2.start();

        Thread t3 = new Thread(thread1);
        //we can set priority, which doesn't affect completion time
        //it just affects the amount of privilege the thread has to the CPU. help us prevent concurrency issues
        //if this thread is competing with another thread for resources, it should get them
        t3.setPriority(Thread.MAX_PRIORITY);
        t3.start();

    }

}
