package javaAssignments.Assignment7.Interface;

public class Main {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        Invoke invoke = new Invoke();
        invoke.invoke1(myClass);
        invoke.invoke2(myClass);
        invoke.invoke3(myClass);
    }
}
