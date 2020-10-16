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