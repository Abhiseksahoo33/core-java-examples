package org.example.ThisOperator;

public class ThisKeywordExample {
   String laptop_model;
   int price;
   String harddisk;
   String ram;
   String processortype;
  public ThisKeywordExample(String laptop_model,int price,String harddisk,String ram,String processortype)
  {
 this.laptop_model=laptop_model;
 this.price=price;
 this.harddisk=harddisk;
 this.ram=ram;
 this.processortype=processortype;
 specification();
 this.specification(); // using this it calls the method with the recent object
  }
  public void specification()
  {
      System.out.println("model of laptop : "+laptop_model);
      System.out.println("price : "+price);
      System.out.println("RAM : "+ram);
      System.out.println("ROM : "+harddisk);
      System.out.println("processor type  : "+processortype);
  }
}


