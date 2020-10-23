# Activity 05 (inheritance ) #
## (1)Code example of inheritance. Reuse static/non-static method(s) & static/non-static variable(s).
```java
package org.example;

class A     //parent class / superclass inherited by B
{
   public int x=10;
   public static int y=20;
   public void m1()
   {
      System.out.println("parent class method ");
   }
   public static void m2()
   {
      System.out.println("parent class static method");
   }

}
class B extends A  // child class / subclass
{
   public int a = 15;
   public static int b = 25;

   public void m3() {
      System.out.println("child class method ");
   }

   public static void m4() {
      System.out.println("child class static method");
   }


   public static void main(String[] args) {
      A var = new B();
      B var1 = new B();
      var.m1();
      var.m2();
      var1.m3();
      var1.m4();// reference type of var is A
     var1.m1();
     var1.m2();
      System.out.println("parent   y : "+A.y);
     // System.out.println("parent  x  : "+A.x); // x is not static it can't access by a static method main
      System.out.println("parent   x , y: "+var.x+" "+var.y);
      System.out.println("child a ,b : "+var1.a+" "+var1.b);

   }
}
```
#### output
* parent class method
* parent class static method
* child class method
* child class static method
* parent class method
* parent class static method
* parent   y : 20
* parent   x , y: 10 20
* child a ,b : 15 25

## (2)Code example of instance of operator using classes as BaseParent->Parent->Child
```java
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
```
## (3)Code example of super constructor
```java
package org.example.activity05;

class Person
{
    Person()
    {
        System.out.println("Person(parent ) class Constructor");
    }
}

/* subclass Student extending the Person class */
class Student extends Person
{
    Student()
    {

        super(); // invoke  parent class constructor

        System.out.println("Student (child) class Constructor");
    }
}


class SuperConstructor
{
    public static void main(String[] args)
    {
        Student var = new Student(); // called the student constructor
    }
}

```
#### output

* Person(parent ) class Constructor
* Student (child) class Constructor


## (3)Does multiple object created in inheritance hierarchy.

* no, There will be one and only one object will be created 
#### example 
```java
package org.example.activity05;


public class A {
    public static A super_var;

    public A() {
        super_var = this;
        System.out.println("Constrcutor of A invoked");
    }
}



class B extends A {
    public static A sub_var;

    public B() {
        sub_var = this;
        System.out.println("Constructor of B invoked");
    }

    public void checkmultiobject() {
        if (sub_var == A.super_var)
            System.out.println("There is only one object is created");
        else
            System.out.println("There are more than one object created");
    }

    public static void main(String Args[]) {
        B x = new B();
        x.checkmultiobject();
    }
}

/*output
* Constrcutor of A invoked
Constructor of B invoked
There is only one object is created
* */
```
## (4)Does super constructor invocation creates one more object.
* When inheriting from another class, super() has to be called first in the constructor.
* If not, the compiler will insert that call.
* This is why super constructor is also invoked when a Sub object is created.

This doesn't create two objects, only one Sub object.
## (5)Code example of method hiding.

```java
package org.example.activity05;
class Code
{
    public static void main(String[] args) {
        Upperclass parvar=new Upperclass();
        parvar.m1(); //parent class STATIC  method
       
        Upperclass chivar = new Subclass();
        chivar.m1(); //parent class STATIC  method
       

    }
}
class Upperclass{
    static void  m1()
    {
        System.out.println("parent class STATIC  method ");
    }
   


}
class Subclass extends  Upperclass
{
    static void m1()  // method hidding
    {
        System.out.println("child class  static method ");
    }
   
}
```
## (6)Code example of variable hiding.
```java
package org.example.activity05;

public class VariableHidding {
    public static void main(String[] args) {
        Variable var=new Variable();
        var.method();
    }

}
class Variable{
     int i=10;
     void method()
    {
        int i=20;  // variable hidding , hides the instance variable
        System.out.println("instance variable: "+this.i); //10
        System.out.println("local variable: "+i);  //20

    }
}

```
## (7)Does static methods overridden
* No, we cannot override static methods because method overriding is based on dynamic binding at runtime and the static methods are bonded using static binding at compile time
*  So, we cannot override static methods.

* The calling of method depends upon the type of object that calls the static method. It means:

* If we call a static method by using the parent class object, the original static method will be called from the parent class.
* If we call a static method by using the child class object, the static method of the child class will be called
## (8)Does private methods overriden.
* No, we cannot override private in Java.

* Private methods in Java are not visible to any other class which limits their scope to the class in which they are 
## (9)By default any class extends which class.
* Any Java class implicitly extends java.lang.Object
## (10)List down the public/protected (inherited) methods present in java.lag.Object class.
*  private static native void registerNatives();
*  public native int hashCode();
* public boolean equals(Object obj) {
        return (this == obj);
    }
* protected native Object clone()
* public String toString()
* public final native void notify();
*  public final native void notifyAll();
*  public final native void wait(long timeout) throws InterruptedException;

## (11)Find the output:
```java
class A
{
  public int i = 10;
  public int j = 20;
}
class B extends A
{
   public int i = 100;
   public int sumValue(int x)
   {
      return x + this.i + this.j +  super.i + super.j;
   }
}

class Test
{
  public static void main(String[] args)
  {
    A a = new B();
    int result = a.sumValue(a.i);
    System.out.println(result);
  }

}
```
#### output 
* 160  // we need a fix  int result = (B(a)).sumValue(a.i);
*160= ( 10+100+20+10+20)
## (12)Fix the code with all the approaches you know.
```java
class A
{
  private int i;
  public A(int i)
  {
     this.i = i;
  }
}

class B extends A
{
   public B()
   {
   
   }
}
```
#### fix 
```java
class A
{
  private int i;
  public A(int i)
  {
     this.i = i;  
     //  System.out.println(i); // 20
  }
}

class B extends A
{
   public B()
   {
   super(20);  // any value 
   }
}
class Test
{
    public static void main(String[] args) {
        B varb=new B();
       
    }

}
```
