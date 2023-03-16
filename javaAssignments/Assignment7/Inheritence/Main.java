package javaAssignments.Assignment7.Inheritence;

public class Main {
    public static void main(String[] args) {
        Cycle[] vehicles = new Cycle[4];
        vehicles[0] = new Unicycle();
        vehicles[1] = new Bicycle();
        vehicles[2] = new Tricycle();

        /*
            vehicles[0].balance();
            vehicles[1].balance();
            vehicles[2].balance();
            throws error because balance method is not defined in Cycle class
        */
        Unicycle uniObj = new Unicycle();
        uniObj.balance();
        Bicycle biObj = new Bicycle();
        biObj.balance();
    }
}
