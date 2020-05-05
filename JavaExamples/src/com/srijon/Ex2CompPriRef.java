package com.srijon;

import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.util.ArrayList;
import java.util.List;

public class Ex2CompPriRef {

public static void main(String[] args) throws InterruptedException{

    RuntimeMXBean bean = ManagementFactory.getRuntimeMXBean();

    String jvmName = bean.getName();
    System.out.println("Name = " + jvmName);

    long pid = Long.valueOf(jvmName.split("@")[0]);
    System.out.println("PID  = " + pid);

    System.out.println("Please monitor from jConsole");

    for ( int i = 0 ; i < 500 ; i ++) {
        List li = new ArrayList<String>(100);
        //li = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
        Thread.sleep(3000);
    }

}




}