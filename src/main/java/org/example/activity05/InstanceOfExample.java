package org.example.activity05;

public class InstanceOfExample {

    //  instanceof operator
    public static void main(String[] args) {

        // BaseParent -> Parent -> Child
        BaseParent objectRefVar = new Child();
      // objectRefVar = new Parent(); the it eill return false for
//        objectRefVar = new Object();



        System.out.println(objectRefVar instanceof BaseParent); // true
        // you can assign objectRefVar to another refVar of type BaseParent
        BaseParent bpRefVar = (BaseParent)objectRefVar;
        System.out.println(bpRefVar instanceof BaseParent); // true

        System.out.println(objectRefVar instanceof Parent); // true
        // you can assign objectRefVar to another refVar of type Parent
        Parent pRefVar = (Parent) objectRefVar;

        System.out.println(objectRefVar instanceof Child); // true
        // you can assign objectRefVar to another refVar of type Child
        // child = (child)parent : classcast exception
        Child cRefVar = (Child) objectRefVar;


    }

    private static class BaseParent
    {

    }
    private static class Parent extends BaseParent
    {

    }

    private static class Child extends Parent
    {

    }
}