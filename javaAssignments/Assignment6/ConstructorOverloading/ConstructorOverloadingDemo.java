package javaAssignments.Assignment6.ConstructorOverloading;

public class ConstructorOverloadingDemo {

    public ConstructorOverloadingDemo(String str){
        this();
        System.out.println("parameterized constructor");
        System.out.println(str);
    }

    public ConstructorOverloadingDemo() {
        System.out.println("Default constructor");
    }
}
