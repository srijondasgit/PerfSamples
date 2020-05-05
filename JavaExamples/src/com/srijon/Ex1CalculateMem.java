package com.srijon;

import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex1CalculateMem extends Ex1aExtendThis { //implements Ex1aImplThat{

    //public List li;
    void addChar( Integer i){
        this.li.add(i);

    }

   /* public void doSomething(int i){
        this.li.add(i);
    }*/


    public static void main(String[] args) throws InterruptedException {



        RuntimeMXBean bean = ManagementFactory.getRuntimeMXBean();

        String jvmName = bean.getName();
        System.out.println("Name = " + jvmName);

        long pid = Long.valueOf(jvmName.split("@")[0]);
        System.out.println("PID  = " + pid);

        System.out.println("Please monitor from jConsole");



        Ex1CalculateMem ex1 = new Ex1CalculateMem();

        ex1.li = new ArrayList<Integer>();

        for (int i = 0; i < 10000000; i++) {
            //4 bytes per reference variable, actual
            //List li = new ArrayList<Integer>();
            //li = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
//            for ( int j = 0; j < 100; j++){
            //ex1.li.add(i);
            ex1.addChar(i);
            //ex1.doSomething(i);
//            }
//            Thread.sleep(   5000);
        }

        System.out.println("done populating : " + ex1.li.size());
        Thread.sleep(500000);

    }


}




