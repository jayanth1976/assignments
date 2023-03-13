package javaAssignments.Assignment7.Rodent;

abstract class Rodent {
    Rodent(){
        System.out.println("Rodent constructor");
    }
    abstract public void land();
    abstract public void vehicle();
}
