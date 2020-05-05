package com.srijon;

public class SecondLargest {


    public static void main(String[] args) {


        int[] given = {-1,-20,-10,-5,-2};

        int max = 0;
        int maxless = 0;
        int maxlessPos = -1;
        int maxPos = -1;



        for(int i = 0; i < given.length; i++ ){

            if(given[i]>max){
                maxless = max;
                max = given[i];
                maxlessPos =  maxPos;
                maxPos = i;
                System.out.println("Max: " +max+ "Maxless : "+maxless);

            }
            else if(given[i]>maxless && given[i]<max){
                maxless = given[i];
                maxlessPos = i;

            }

        }

//this for loop
        for(int j =0 ; j < given.length; j++){

            //System.out.println("Current given"+given[j]);
            if(given[j]==maxless){
                System.out.println("the position of the second largest is : " +j);
            }
        }



    }





}
