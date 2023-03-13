package javaAssignments.Assignment7.Rodent;

public class Mouse extends Rodent {
    Mouse(){
        System.out.println("Mouse constructor");
    }
    @Override
    public void land(){
        System.out.println("Mouse built shop in the land");
    }
    @Override
    public void vehicle(){
        System.out.println("Mouse has car");
    }
}
