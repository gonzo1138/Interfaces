package com.company;

public class MyOtherReference implements MyInterface, MyOtherInterface {

    // from MyInterface
    @Override
    public void myMethod() {

    }

    @Override
    public String myStringMethod(int number) {
        return null;
    }

    @Override
    public String myDefaultMethod(String text) {
        return null;
    }

    // from MyOtherInterface
    @Override
    public void myOtherMethod() {

    }
}
