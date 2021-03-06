package com.srijon;

import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.util.ArrayList;
import java.util.List;

// Main focus it to measure the time taken
// Primitives reside on the stack when part of method body or main
// Reference variables and wrapper classes reside in heap
public class Ex2CompPriRef {

public static void main(String[] args) throws InterruptedException{

    // Measure time taken for operations on Integer
    long startTime = System.nanoTime();

        Integer j = 1;

        for ( int i = 0 ; i < 5000000 ; i ++) {

            j = j + 1;

        }

    long endTime   = System.nanoTime();
    long totalTime = endTime - startTime;
    System.out.println("Time taken by Integer : " + totalTime);

    // Measure time taken for operations on int
    startTime = System.nanoTime();

        int k = 1;

        for ( int i = 0 ; i < 5000000 ; i ++) {

            k = k + 1;

        }

    endTime   = System.nanoTime();
    totalTime = endTime - startTime;
    System.out.println("Time taken by int : " + totalTime);


}




}