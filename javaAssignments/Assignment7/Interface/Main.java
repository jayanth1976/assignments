package javaAssignments.Assignment7.Interface;

public class Main {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        Invoke invoke = new Invoke();
        invoke.methodsOfFirstInterface(myClass);
        invoke.methodsOfSecondInterface(myClass);
        invoke.methodsOfThirdInterface(myClass);
    }
}
