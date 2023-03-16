package javaAssignments.Assignment7.Rodent;

public class Hamster extends Rodent{
    Hamster(){
        System.out.println("Hamster constructor");
    }
    @Override
    public void land(){
        System.out.println("hamster built apartment in the land");
    }
    @Override
    public void vehicle(){
        System.out.println("Hamster has bike");
    }
}
