package com.company;

public class Main {

    public static void main(String[] args) {

        MyReference reference1 = new MyReference();
        MyOtherInterface reference2 = new MyOtherReference();


        MyInterface[] myinterfacearray = new MyInterface[10];
        myinterfacearray[0] = reference1;


        MyOtherInterface[] myotherinterfacearray = new MyOtherInterface[10];
        myotherinterfacearray[0] = reference1;
        myotherinterfacearray[1] = reference2;

        //...
    }
}
