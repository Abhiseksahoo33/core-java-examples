package org.example.ThisOperator.Example2This;

public class ThisExample2Main {
    public static void main(String[] args) {
        ThisExample2 var1=new ThisExample2(25);
        System.out.println("result single parameter  :"+var1.sum());
        ThisExample2 var2=new ThisExample2(25,45);
        System.out.println("result two parameter :"+var2.sum());
        System.out.println("hashcode of 1st object : "+var1.hashCode());
        System.out.println("hashcode of 2nd object : "+var2.hashCode());

        ThisExampleName var3=new ThisExampleName("abhisek","sahoo");
       var3.printfullname();
        System.out.println("hashcode of 3rd object : "+var3.hashCode());

       ThisExampleName var4=new ThisExampleName("prasad","sahoo");
       var4.printfullname();
    }
}
/*output
*
*
*result single parameter  :25
result two parameter :70
hashcode of 1st object : 1975012498
hashcode of 2nd object : 1808253012
first nameabhisek
last namesahoo
first nameabhisek
last namesahoo
fullname od student : abhisek kumar sahoo
abhisek sahoo
hashcode of 3rd object : 589431969
first nameprasad
last namesahoo
first nameprasad
last namesahoo
fullname od student : prasad kumar sahoo
prasad sahoo
* */