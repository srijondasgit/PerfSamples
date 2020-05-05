package com.srijon;

public class Parent {

    public static void foo() {
        System.out.println("static method in parent");
    }

    public void bar(){
        System.out.println("public method in parent");
    }

}

class Child extends Parent {
    public static void foo() {
        System.out.println("static method in child");
    }

    public void bar(){
        System.out.println("public method in child");
    }


    public static void main(String[] args) {
        Parent par = new Child();
        par.foo();
        par.bar();

        Child chi = new Child();
        chi.foo();
        chi.bar();
    }
}
