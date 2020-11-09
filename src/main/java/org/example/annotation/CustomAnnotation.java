package org.example.annotation;


//creating custom Annotation

import java.lang.annotation.*;

// annotation having no value is called marker annotation
// have one value -> single valued annotation
//  have more than one value -> multi valued annotation

// metaAnnoattion
@Inherited  // if a child class inherited the parent class
@Documented  // to add documentation
@Target(ElementType.TYPE) // Type used for class    // may be Field,consructor etc.
@Retention(RetentionPolicy.RUNTIME)   // may be sourse


@interface Smartphone  // defines we are creating our cutome annotation

{
    String os() default "android";
    int version() default  01;

}


@Smartphone(os = "android",version = 10)     // using our custom annotation
class MicromaxSeries                         // by specifying annotation -> this is a smart phone
{
    String model;
    int ram;
// constructor to assign values
    public MicromaxSeries(String model, int ram) {
        this.model = model;
        this.ram = ram;
    }
}
public class CustomAnnotation {

    public static void main(String[] args) {
     MicromaxSeries obj = new MicromaxSeries("canvas", 2);
        /*System.out.println(obj.model);  canvas   ,
        but we don't want to print value of micromax
         we want to know is a smartphone or not or which version of android
         we want to know annotation value for this class (@Smartphone(os = "android",version = 10))
      */
        Class c =obj.getClass();  // reflection API to fetch the value of the annotation
        Annotation anno= c.getAnnotation(Smartphone.class);  // we may have multiple annotation in a sinhle class  so we should provide which one
        Smartphone Sobj=(Smartphone) anno;//  type cast to Smartphone
        System.out.println("os= "+Sobj.os());
        System.out.println("version ="+Sobj.version());
    }

}


/*  output

 os= android
version 10

* */