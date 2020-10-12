package org.example.inheritancebehaviour;
// child class  which inherited the data member and method of parent
public class BehaviourChild  extends  BehaviourParent{
    int a =50;
    int b =100;
   protected  void m4()
    {
        System.out.println("child m4");
        m3();

    }
    // method hidding
    public static void m2()
    {
        System.out.println("child m2()");
    }
    public void m3()
    {
        System.out.println("child m3()");
        m1();
    }

}
