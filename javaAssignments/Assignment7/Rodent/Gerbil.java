package javaAssignments.Assignment7.Rodent;

class Gerbil extends Rodent{
    Gerbil(){
        System.out.println("Gerbil constructor");
    }
    @Override
    public void land(){
        System.out.println("Gerbil built house in the land");
    }
    @Override
    public void vehicle(){
        System.out.println("Gerbil Has cycle");
    }

}
