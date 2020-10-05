package org.example.ThisOperator.Example2This;

public class ThisExample2 {
    int i,j;

    public ThisExample2(int x)
    {
        i=x;
    }

    public ThisExample2(int x,int y)
    {
        j=y;
        i=x;
    }


    public int  sum()
    {
        int z=i+j;
        return  z;
    }
}
