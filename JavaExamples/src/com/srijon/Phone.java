package com.srijon;

import java.util.Random;
import java.util.Scanner;

public class Phone {

    public static void main(String[] args) {

        Random rand = new Random();


        System.out.println("Enter number of USA phone numbers needed");
        Scanner scan = new Scanner(System.in);
        String us = scan.nextLine();

        System.out.println("Enter number of UK phone numbers needed");
        String uk = scan.nextLine();

        System.out.println("Enter number of India phone numbers needed");
        String in = scan.nextLine();


        System.out.println("printing numebr of us: "+us+", number of uk: "+uk+", number of India : "+in);


        System.out.println("numbers of US are ");
        for (int i = 0; i<Integer.valueOf(us); i++){

            //+1-xxx-xxx-xxxx
            int first = rand.nextInt(900) + 100;
            int second = rand.nextInt(900) + 100;
            int third = rand.nextInt(9000) + 1000;
            System.out.println("+1-"+first+"-"+second+"-"+third);

        }

        System.out.println("numbers of Uk are ");
        for (int i = 0; i<Integer.valueOf(uk); i++){

            int first = rand.nextInt(90) + 10;
            int second = rand.nextInt(9000) + 1000;
            int third = rand.nextInt(9000) + 1000;
            System.out.println("+44-"+first+"-"+second+"-"+third);

        }


        System.out.println("numbers of India are ");
        for (int i = 0; i<Integer.valueOf(in); i++){

            //+1-xxx-xxx-xxxx
            int first = rand.nextInt(9000) + 1000;
            int second = rand.nextInt(9000) + 1000;
            int third = rand.nextInt(90) + 10;
            System.out.println("+91-"+first+"-"+second+"-"+third);

        }


    }
}
