package com.srijon;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import javafx.util.Pair;
import java.lang.reflect.Method;
import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;



public class HelloWorld implements Cloneable{


    public static void main(String[] args) throws InterruptedException, CloneNotSupportedException, ClassNotFoundException, InstantiationException, IllegalAccessException {

        int found = 0;

        System.out.println("Starting test: ");
 //       Scanner sc = new Scanner(System.in);
//        String a = sc.nextLine();
        //String b = sc.nextLine();
        String substr = "";

        RuntimeMXBean bean = ManagementFactory.getRuntimeMXBean();

        String jvmName = bean.getName();
        System.out.println("Name = " + jvmName);

        long pid = Long.valueOf(jvmName.split("@")[0]);
        System.out.println("PID  = " + pid);

//        //Ways to create objects in Java
//        HelloWorld hw = new HelloWorld();
//
//        HelloWorld hw1 = (HelloWorld) Class.forName("com.srijon.HelloWorld").newInstance();
//
//        HelloWorld hw2 = (HelloWorld)hw.clone();
//
//        Class clazz1 = Class.forName("java.lang.Integer");
//        Package packageOfClazz1 = clazz1.getPackage();
//        String packageNameOfClazz1 = packageOfClazz1.getName();
//
////        System.out.println("The result : " + packageNameOfClazz1);
//
////        List<String> packagesSamePrefix = Packages.fetchPackagesByPrefix("java.util");
//
//        Pair pair = new Pair(1, 1);
//        Class<?> clazz = pair.getClass();
//
//        System.out.println("Name: " + clazz.getName());
//        System.out.println("Simple name: " + clazz.getSimpleName());
//        System.out.println("Canonical name: " + clazz.getCanonicalName());
//
//        System.out.println("\nGet the Pair class modifiers:");
//        int modifiers = clazz.getModifiers();
//        System.out.println("Is public? " + Modifier.isPublic(modifiers));
//        System.out.println("Is final? " + Modifier.isFinal(modifiers));
//        System.out.println("Is abstract? " + Modifier.isAbstract(modifiers));
//
//
//        System.out.println("\nGet the Pair class methods:");
//        Method[] methods = clazz.getMethods();
//        //List<String> methodsName = getMethodNames(methods);
//        System.out.println("Methods: " + Arrays.toString(methods));
        //System.out.println("Methods names: " + methodsName);

//        while (true) {
//            Integer arr [] ;
//            List li = new ArrayList<Integer>(100);
//            //arr = new Integer[700];
//            li = new ArrayList<Integer>(Arrays.asList(1,2,3));
//        }

        long beforeUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
        System.out.println("Memory before : " + beforeUsedMem );
        Thread.sleep(30000);
        //long beforeUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();

        for ( int i = 0 ; i < 500 ; i ++) {
            List li = new ArrayList<Integer>(100);
            //li = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
            Thread.sleep(3000);
        }


        System.out.println("Done execution wait for 30 sec");

        Thread.sleep(30000);






    }

}
