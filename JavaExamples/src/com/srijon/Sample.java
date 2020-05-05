package com.srijon;


interface A
{
    void show( int i);

}

//class xyz implements A{
//
//    public void show(){
//        System.out.println("Hello");
//    }
//}

public class Sample {

    public static void main(String[] args) {

        A aobj;
//        aobj = new A(){ // anonymous inner class
//            public void show(){
//                System.out.println("hello");
//            }
//        };

       aobj = i ->   System.out.println("Hello" + i); // lambda expression




        aobj.show(6);

    }
}
