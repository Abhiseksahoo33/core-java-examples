package org.example.ThisOperator.ThisExample4;

public class Example4This {

    private int id;
    private String name;
    private int price;

    public Example4This(int price) {
        // discount
        this.price = (int) (price - (price*0.1));
        System.out.println(this.hashCode());
    }

    public Example4This(int id, String name, int price) {
        this(price);
       this.id=id;//this(id);this must be the first line
       this.name=name; //this(price); this must be the first line
        display(this);
        System.out.println(this.hashCode());
    }

    public void display()
    {
        System.out.println("serial no "+this.id);
        System.out.println("model name : "+this.name);
        System.out.println("after discout of  10% : "+this.price);
    }

    public void display(Example4This var5)
    {
        display();
    }
}
