package org.example.ThisOperator.Example2This;

public class ThisExampleName {
   String first_name;
    String last_name;
    String middle_name;

    ThisExampleName(String first_name, String last_name)
    {
        this.first_name=first_name;
        this.last_name=last_name;
        System.out.println("first name"+first_name);
        System.out.println("last name"+last_name);
        System.out.println("first (this) name"+this.first_name); // will print the recent object passed
        System.out.println("last(this) name"+this.last_name);
        this.addmiddlename("kumar");

    }

   public void  printfullname()
    {
        System.out.println(first_name+" "+last_name);
    }
    public String fullname()
    {
      return  first_name+" "+middle_name+" "+last_name;
    }

public void addmiddlename(String middle_name)
{
 this.middle_name=middle_name;
    System.out.println("fullname od student : "+fullname());
}
}
