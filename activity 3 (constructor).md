# Activity 3 (constructor) #
### (1) Write a simple example of a Product class where it uses this constructor with paremeterized constructor. 
~~~java
package org.example.activity_constructor;

public class Product {
int price;
    public Product(int price)// one -param constructor  
    {
        this.price=price; // value assigned to price using this keyword
        System.out.println("price of product : "+price);
    }

    public static void main(String[] args) {
        Product var=new Product(15);
    }
}
/*output
* price of product : 15
* */
~~~

### (2) Does toString() method present in java.lang.Object class? If yes what the implementaion for toString() method given by java.lang.Object class.
* yes , toString() method present in java.lang.Object class
*
   The {@code toString} method for class {@code Object}
     returns a string consisting of the name of the class of which the
     object is an instance, the at-sign character `{@code @}', and
     the unsigned hexadecimal representation of the hash code of the
     object. In other words, this method returns a string equal to the
     value of:
     
   
 * public String toString() 
  {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
### (3) Override toString() method in the class A (as given below) such that it will print the value of i, j, k.
```java

public class Test {
    public static void main(String[] args) {
        A a = new A(10, 20);
        a.setK(400);
        System.out.println(a);
    }
}

class A {
    private int i;
    private int j;
    private int k;

    public A(int i, int j) {
        this.i = i;
        this.j = j;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }
}
```
#### solution ####
```java
package org.example.activity_constructor;


public class Test {
    public static void main(String[] args) {
        A a = new A(10, 20);
        a.setK(400);
        System.out.println(a);
    
    }
}

class A {
    private int i;
    private int j;
    private int k;

    @Override
    public String toString() {
        return "A{" +
                "i=" + i +
                ", j=" + j +           // override tostring() to print i ,j k
                ", k=" + k +
                '}';
    }
    

    public A(int i, int j) {
        this.i = i;
        this.j = j;
    }



    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }

}

```
### Find the output with explanation.
```java

public class Test {
    public static void main(String[] args) {
        A a = new A();
    }
}

class A
{
    private int x =11;
    public A()
    {
        this(10);
        if(x % 2 == 0)
        {
            System.out.println("even");
        }
        else
        {
            System.out.println("odd");
        }
    }
    
    public A(int x)
    {
        this.x = x;
    }
}
```
#### output
* even  ___this(10)___  will invoke    this 
```java
public A(int x)
    {
        this.x = x;
    }
```
and x will be 10 

### (4) Will the below code compile?
```java
class A
{
    public A()
    {
        new A();
    }
}
```
* yes, it will  compile 
#### output 
* - Exception in thread "main" java.lang.StackOverflowError(also main () is not there)
* as the new A() will create a new constructor each time . 
* and as we didn't terminate the loop it will compile repeatedly and will fill the stack causing stack overflow exception

#### output will be ####
* Error: Could not find or load main class
### (5)Why the below code won't compile?
```java
class A
{
    public A()
    {
        this();
    }
}
```
* it won't compile because of  recursive constructor invocation (also main () is not there)
* the  code this() will call the recent constructor i.e. A() and this will execute this() thus the recursive loop will form 
  
### (6) Find the output with explanation?

```java
public class Test {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.hashValue == a.hashCode());
    }
}

class A
{
    public int i;
    public int hashValue;
    public A()
    {
        new A(10);
    }

    public A(int x)
    {
        this.i = x;
        this.hashValue = this.hashCode();
    }
}
```
#### output 
* false 
##### explanation
 
* inside the default constructor we have invoked the single paramiterized constructor using new , 
So  the code       this.i = x;
        this.hashValue = this.hashCode();  will refer to the newly created object not the "a" instance of default constructor and  value of hashvalue will be updated for the new object 
*  the a.hasValue gives  0(default for int) and a.hashCode() will produce the memory location of "a" object .
### (7) Find the output with explanation?

```java

public class Test {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.hashValue == a.hashCode());
    }
}

class A
{
    public int i;
    public int hashValue;
    public A()
    {
        this(10);
    }
    
    public A(int x)
    {
        this.i = x;
        this.hashValue = this.hashCode();
    }
}
```
#### output 
true // 
#### explanation 
* by invoking this(10) this will invoke the one param constructor and the value will be updated for "a" thus the a.hashValue == a.hashCode() will be same  
### (8) Access Modifiers & Packages. Find the compilation errors & why? Find the output also by fixing them.
```java
package com.pkg1;

class A
{
  private int i = 10;
  public int j = 100;
  int k = 50;
}

package com.pkg1;
class B
{
  public static void main(String[] args)
  {
    A a = new A();
	System.out.println(a.i);
	System.out.println(a.j);
	System.out.println(a.k); // why this is accessible?
  }
}

package com.pkg2;
class B
{
  public static void main(String[] args)
  {
    A a = new A();
	System.out.println(a.i);
	System.out.println(a.j);
	System.out.println(a.k); // why this is not accessible?
  }
}
```
#### explantion 
* we have not import A from pkg1 
* bydefault class A in pkg1 has default access specifier which can't access by outside package 
the variable i is private in class A so we can;t access it in class B of same package 
### (9) Why we use getters and setters for a class. Give an example

*getter and setter are two  methods that are used for retrieving and updating the value of a variable. 
*  a setter is a method that updates the value of a variable. 
* a getter is a method that reads the value of a variable.
* Getter and setter are also known as accessor and mutator in Java
#### example
```java
package org.example.activity_constructor;

public class GetterSetterMethod {
    private String color;


    public String getColor()   // Getter method
    {
        return color;
    }


    public void setColor(String c)// Setter method
    {
        this.color = c;
    }

    public static void main(String[] args) {
        GetterSetterMethod var=new GetterSetterMethod();
        var.setColor("red");
        System.out.println("color : "+ var.getColor());
    }
}
```
###  (10) Why it is good to have private fields with public getters & setters?
#### explanation 
* if we  want to prevent future public access from outside the class
* if we want to access this  we need to make it public 




