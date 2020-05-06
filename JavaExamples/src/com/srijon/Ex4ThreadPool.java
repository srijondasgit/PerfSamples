package com.srijon;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


// Do not use multi threading on servers which already use a lot of threads
// Be aware of hardware threads available to the hardware
// Is the thread I/O heavy or CPU intensive
// Does thread update any global variable or synchronized blocks
public class Ex4ThreadPool {
    public static void main(String[] args) {
        //creating a pool of 5 threads
        ExecutorService executor = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            Runnable worker = new Ex4MultithreadW("" + i);
            executor.execute(worker);//calling execute method of ExecutorService
        }
        executor.shutdown();
        while (!executor.isTerminated()) {   }

        System.out.println("Finished all threads");

    }
}