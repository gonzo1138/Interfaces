package com.company;

public interface MyInterface {

    public void myMethod();
    public String myStringMethod(int number);

    default String myDefaultMethod(){
        return "default methods can, but don't have to be implemented";
    }

    default String myDefaultMethod(String text){
        return "they can also be overloaded\n" + text;
    }
}
