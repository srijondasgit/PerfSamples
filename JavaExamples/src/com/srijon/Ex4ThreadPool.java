package com.srijon;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Ex4ThreadPool {
    public static void main(String[] args) {
        //creating a pool of 5 threads
        ExecutorService executor = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 5; i++) {
            Runnable worker = new Ex4MultithreadW("" + i);
            executor.execute(worker);//calling execute method of ExecutorService
        }
        executor.shutdown();
        while (!executor.isTerminated()) {   }

        System.out.println("Finished all threads");
    }
}