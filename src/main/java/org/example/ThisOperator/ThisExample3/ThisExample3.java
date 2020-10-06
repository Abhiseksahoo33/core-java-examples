package org.example.ThisOperator.ThisExample3;



    public class ThisExample3 {
     private   int i,j;
        {
            this.i=10;
            i=100;
            j=200;

            System.out.println(i);
            System.out.println(j);
            System.out.println("sum"+sum());
            System.out.println("sum"+this.sum()); // non static block
        }


        public ThisExample3(int x,int y)
        {
            j=y;
            i=x;
            System.out.println(hashCode());
            this.j=y;
            System.out.println(this.hashCode()); // same haashcode
        }


        public int  sum()
        {
            int z=i+j;
            return  z;
        }
    }

