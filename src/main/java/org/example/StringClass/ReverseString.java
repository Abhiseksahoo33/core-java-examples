package org.example.StringClass;

class ReverseString {
    public static void main(String[] args)
    {
        String s = "Abhisek sahoo";
        
        char[] arr = s.toCharArray();
        int rev =arr.length;

        for (int i = rev-1; i >= 0; i--)
            System.out.print(arr[i]);//oohas kesihbA
    }
}