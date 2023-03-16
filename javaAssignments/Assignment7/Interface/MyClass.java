package javaAssignments.Assignment7.Interface;

public class MyClass extends ConcreteClass implements CompositeInterface {

    @Override
    public void methodFromCompositeInterface() {
        System.out.println("Composite method");
    }

    @Override
    public void m1FromFirstInterface() {
        System.out.println("m1 from first interface");
    }

    @Override
    public void m2FromFirstInterface() {
        System.out.println("m2 from first interface");
    }

    @Override
    public void m1FromSecondInterface() {
        System.out.println("m1 from second interface");
    }

    @Override
    public void m2FromSecondInterface() {
        System.out.println("m2 from second interface");
    }

    @Override
    public void m1FromThirdInterface() {
        System.out.println("m1 from third interface");
    }

    @Override
    public void m2FromThirdInterface() {
        System.out.println("m2 from third interface");
    }
}
