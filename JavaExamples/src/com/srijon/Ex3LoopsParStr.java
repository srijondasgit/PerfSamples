package com.srijon;

import java.util.ArrayList;
import java.util.List;

// Parallel streams were supposed to help performance by using map reduce
// Foreach loops can outperform Parallel streams as fork joins could take time
public class Ex3LoopsParStr {
    static List < Integer > myList = new ArrayList < > ();
    public static void main(String[] args) {
        for (int i = 0; i < 5000000; i++)
            myList.add(i);
        int result = 0;
        long loopStartTime = System.currentTimeMillis();
        for (int i: myList) {
            if (i % 2 == 0)
                result += i;
        }
        long loopEndTime = System.currentTimeMillis();
        System.out.println(result);
        System.out.println("Loop total Time = " + (loopEndTime - loopStartTime));
        long streamStartTime = System.currentTimeMillis();
        System.out.println(myList.stream().filter(value -> value % 2 == 0).mapToInt(Integer::intValue).sum());
        long streamEndTime = System.currentTimeMillis();
        System.out.println("Stream total Time = " + (streamEndTime - streamStartTime));
        long parallelStreamStartTime = System.currentTimeMillis();
        System.out.println(myList.parallelStream().filter(value -> value % 2 == 0).mapToInt(Integer::intValue).sum());
        long parallelStreamEndTime = System.currentTimeMillis();
        System.out.println("Parallel Stream total Time = " + (parallelStreamEndTime - parallelStreamStartTime));
    }
}















//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Ex3LoopsParStr {
//
//
//    public static void main(String[] args) {
//        List arr1 = new ArrayList<String>();
//
//        for (int i = 0; i < 5000; i++) {
//            arr1.add(i);
//        }
//
//        long startTime1 = System.nanoTime();
//
//        arr1.forEach(
//                s -> {
//                    System.out.print(s);
//                });
//
//        long endTime1   = System.nanoTime();
//        long totalTime1 = endTime1 - startTime1;
//        System.out.println("\n\n Time taken by forEach without Parallel : " + totalTime1);
//
//
////        long startTime = System.nanoTime();
////
////        arr1.parallelStream()
////                .forEach(
////                        s -> {
////                            System.out.print(s);
////                        });
////
////        long endTime   = System.nanoTime();
////        long totalTime = endTime - startTime;
////        System.out.println("\n\nTime taken by forEach Parallel : " + totalTime);
//
//
//
//
//    }
//
//}
