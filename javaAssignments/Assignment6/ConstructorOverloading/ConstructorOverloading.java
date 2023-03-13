package javaAssignments.Assignment6.ConstructorOverloading;

public class ConstructorOverloading {

    public ConstructorOverloading(String str){
        this();
        System.out.println("parameterized constructor");
        System.out.println(str);
    }

    public ConstructorOverloading() {
        System.out.println("Default constructor");
    }
}
