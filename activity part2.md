# Activity 2 6-10-2020 ( core-java-session ) #
### (1) Example with code to show state and behaviour of an object where behaviour depends upon the state of object?   ###
~~~java
package org.example.ThisOperator.Example2This;
public class ThisExampleName {
   String first_name;
    String last_name;
    String middle_name;

    ThisExampleName(String first_name, String last_name)
    {
        this.first_name=first_name;
        this.last_name=last_name;
        System.out.println("first name"+first_name);// object state
        System.out.println("last name"+last_name); //object state
        System.out.println("first (this) name"+this.first_name); // will print the recent object passed
        System.out.println("last(this) name"+this.last_name);
        this.addmiddlename("kumar"); //object behaviour

    }

   public void  printfullname()  // object behaviour 
    {
        System.out.println(first_name+" "+last_name);
    }
    public String fullname() object behaviour 
    {
      return  first_name+" "+middle_name+" "+last_name;
    }

public void addmiddlename(String middle_name)
{
 this.middle_name=middle_name;
    System.out.println("fullname od student : "+fullname());
}
}



package org.example.ThisOperator.Example2This;

public class ThisExample2Main {
    public static void main(String[] args) {
      ThisExampleName var3=new ThisExampleName("abhisek","sahoo");
       var3.printfullname();


       ThisExampleName var4=new ThisExampleName("prasad","sahoo");
       var4.printfullname();
    }
~~~
**output**
* first name abhisek
* last name sahoo
* first (this) nameabhisek
* last(this) namesahoo
* fullname of student : abhisek kumar sahoo
* abhisek sahoo

* first nameprasad
* last namesahoo
* first (this) nameprasad
* last(this) namesahoo
* fullname of student : prasad kumar sahoo
* prasad sahoo

##### note #####
 _i have uploaded it before_ 

### (2) What is the definition of hashcode as per java 8 document?  ###

* the hashCode method defined by class does return distinct integers for distinct  objects. 
* This is typically implemented by converting the internal address of the object into an integer,
* but this implementation technique is not required by the Java&trade; programming language.


### (3)   What is the fully qualified name of Object class in java ? ### 
* fullyqualified name of the object in java is the name of the object with its class name package name 
* example  - 

__org.example.ThisOperator.Example2This.ThisExampleName@232204a1__


### (4)Object class is in which package ? ###
* object class is in java.lang package 

## Find the output? Always write the explanation for the output. why you are getting that output? ##
### (5)Find the output? ###
~~~java
public class Test
{
  public static void main(String[] args)
  {
    Object obj1 = new Object();
    Object obj2 = new Object();
    System.out.println(obj1.hashCode() == obj2.hashCode());
    System.out.println(obj1.getClass());
    System.out.println(obj1 == obj2);
  }
}
~~~
#### output ####

* false    // ___hashcode is generated unique . different object have differnt hashcode___
* class java.lang.Object   // ___object is the class of java.lang package____ 
* false // ___objects are unique .no to  objects are same___ 

### (6)Find the output? ###
~~~java
public class Test {
    int x;
    public Test(int x){
        this.x = x;
    }
    public static void main(String[] args) {
        Test t = new Test(10);
        System.out.println(t.x);
    }
}
~~~
#### output ####
* 10 // ___when we created the object the constructor automatocally called and the parameter  10 is assigned to x___

 ### (7)Why below code will not compile? What is the fix we have to do so that the code will compile ###
 ~~~java
 public class Test {
    int x;
    public Test(int x){
        this.x = x;
    }
    public static void main(String[] args) {
        Test t = new Test();
        System.out.println(t.x);
    }
~~~
#### fixing problem #### 

* the object creation step [     Test t = new Test();  ] have no parameter to pass , it can pass only to  a default constructor 
   but the program contains parameterized constructor so that the compiler will not generate default constructor 
   so we can either remove the parameter int x from  
* public Test(int x){
        this.x = x;
    } // ___output will be 0___ (default value for int )

    or we can add parameter to the object creation step 
* Test t = new Test(45);  // ___output 45___

### (8)Will below code will compile? ###
~~~java

public class Test {
    int x;
    public Test(int x){
        this.x = x;
    }
    public Test()   // executes
    { 

    }
    public static void main(String[] args) {
        Test t = new Test();
        System.out.println(t.x);
    }
}
~~~

* will compile the default constructor will be called as no parameter is passed
#### output ####
*  0


###   (9)Find the output? ### 
~~~java
public class Test {
    int x;
    String y;
    public static void main(String[] args) {
        Test t = new Test();
        System.out.println(t.x);
        System.out.println(t.y);
    }
}
~~~
#### output ####
* 0 // ___as x is not initialized and default calue for int is 0___
* null// ___as y is not initialized and default calue for String is null___

### (10)What is the default value of int , String variables ? ###

#### default value of ####   
* int =0 
* String =null

 ### (11)Find the output? ###
~~~java
 public class Test {
    int x;
    String y;

    public Test(int x, String y) {
        this.x = x;
        this.y = y;
        Test tVar = this;
        System.out.println(tVar.hashCode() == this.hashCode());
    }

    public static void main(String[] args) {
        Test t = new Test(10,"john");
        System.out.println(t.x);
        System.out.println(t.y);
    }
}
~~~
#### output ####
* true // ___the tVar is object of Test class  assigned with the recent object so the hashcode is same for both.___
* 10  // ___10 is pased___
* john // ___john i passed to Test constructor___

### (12)Find the output? ###
~~~java
public class Test {
    int x;
    String y;

    public Test(int x, String y) {
        this.x = x; //x=10
        this.y = y; //y= john
        m1(this); // calling to m1() with the recent objects x and y 
    }

    public static void main(String[] args) {
        Test t = new Test(10,"john");
        System.out.println(t.x);
        System.out.println(t.y);
    }

    public void m1(Test t1) // both x and y are modified 
    {
        t1.x = 100; // now x=100
        t1.y = "Doe"; // y=Doe
    }
}
~~~
#### output #### 
* 100
* Doe


### (13)Find the output? ###
~~~java
public class Test {
    int x;
    String y;

    public Test(int x, String y) {
        this.x = x;
        this.y = y;
        this.m1(this);
    }

    public static void main(String[] args) {
        Test t = new Test(10,"john");
        System.out.println(t.x == 10);
        System.out.println(t.y == "john");
    }

    public void m1(Test t1)
    {
        t1.x = 100;
        t1.y = "Doe";
    }
}
~~~
#### output ####
* false  // ___x=100 , so t.x==10 false___ 
* false // ___y=Doe___


### (14)Find the output?  ###
~~~java
public class Test {
    int x;
    String y;

    public Test(int x, String y) {
        x = x;
        y = y;
        this.m1(this);
    }

    public static void main(String[] args) {
        Test t = new Test(10,"john");
        System.out.println(t.x);
        System.out.println(t.y);
    }

    public void m1(Test t1)
    {
        t1.x = 100;
        t1.y = "Doe";
    }
}
~~~
#### output ####
* 100
* Doe

### (15)Find the output? ###
~~~java
public class Test {
    int x;
    String y;

    public Test(int x, String y) {
        x = x;
        y = y;
    }

    public static void main(String[] args) {
        Test t = new Test(10,"john");
        System.out.println(t.x);
        System.out.println(t.y);
    }

    public void m1(Test t1)
    {
        t1.x = 100;    // it is not called so it will not execute 
        t1.y = "Doe";
    }
}
~~~
#### output ####  

* 0 // ___here x=x so the value that is paased is assigned to itself not to the recent object( this.x=x will be x=10)___
* null // ___here y=y so the value that is paased is assigned to itself not to the recent object ( this.y=y will be y=john)___


### (16)Find the output? ###
~~~java
public class Test {
    int x;
    String y;

    public Test(int x, String y) {
        x = x;
        y = y;
    }

    public static void main(String[] args) {
        Test t = new Test(10,"john");
        Test t1 = t;
        System.out.println(t1 == t);
        t1.x = 300;
        t1.y = "alex";
        System.out.println(t.x);
        System.out.println(t.y);
    }
}
~~~
#### output ####
* true// ___t ia assigned to t1___
* 300 // ___both t1 and t are same___ 
* alex

### (17)Identify State & Behaviour. Find where the state is used. Does behavour depends on the state? ###
~~~java
public class Calculator
{
   private int i;
   private int j;

   public Calculator(int i, int j)
   {
     this.i = i; // object state 
     this.j = j;// object state 
   }

   public int sum()
   {                // object behaviour 
     return i + j; // object beheviour depends upon state 
   }
~~~
### (18)Find the output? ###
~~~java

   public class Test
{
  static int x;// static variable x
  int y;
  static{
    x = 10; // static method
  }

  static{      // static method
    x = x + 20; //30
  }

  {
    y = 100;
  }

  {
    y = y + 20; //120
  }

  public static void main(String[] args)  // static method also
  {
    Test t = null;
    t.x = t.x + 40; //70
    x = x + 50   //120

    t = new Test();
    t.y = t.y + 200; //320

    Test t1 = new Test();
    System.out.println(t.x)  //120
    System.out.println(t1.x) //120
    System.out.println(Test.x) //120 

    System.out.println(t.y)  //320
    System.out.println(t1.y) //120

   System.out.println(t.getX()); //120
   System.out.println(t1.getX()); //120
   System.out.println(Test.getX());//120   

   System.out.println(t.getSum());//440
   System.out.println(t1.getSum());//240

  }

  public static int getX()
  {
    return x;
  }

  public int getSum()
  {
    return  x + y;
  }
}
~~~
#### output ####

* 120
* 120
* 120
* 320
* 120
* 120
* 120
* 120
* 440
* 240


### (19) null pointer exception program ### 
~~~java

package org.example.activity2;
public class Test {
   int x;
   Test()
   {
       x=10;
       System.out.println(x);
   }
   void m()
   {
       x=12;
   }

    public static void main(String[] args) {
      Test var=null;
      var.x=100;  //java.lang.NullPointerException
var.m();     //java.lang.NullPointerException1

    }
}
~~~
#### output ####
* java.lang.NullPointerException
* java.lang.NullPointerException
