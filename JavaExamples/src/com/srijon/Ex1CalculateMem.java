package com.srijon;

import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


// Calculates the memory usage of an array

public class Ex1CalculateMem extends Ex1aExtendThis implements Ex1aImplThat{


    void addDeclAbstr( Integer i){
        this.li.add(i);

    }

    public void addDeclInterface(int i){
        this.li.add(i);
    }


    public static void main(String[] args) throws InterruptedException {



        RuntimeMXBean bean = ManagementFactory.getRuntimeMXBean();

        String jvmName = bean.getName();
        System.out.println("Name = " + jvmName);

        long pid = Long.valueOf(jvmName.split("@")[0]);
        System.out.println("PID  = " + pid);

        System.out.println("Please monitor from jConsole");



        Ex1CalculateMem ex1 = new Ex1CalculateMem();

        ex1.li = new ArrayList<Integer>();

        for (int i = 0; i < 5000000; i++) {
            ex1.addDeclAbstr(i);
            ex1.addDeclInterface(i);
        }

        System.out.println("done populating : " + ex1.li.size());
        Thread.sleep(500000);

    }


}




