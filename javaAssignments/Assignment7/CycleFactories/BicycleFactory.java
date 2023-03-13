package javaAssignments.Assignment7.CycleFactories;

public class BicycleFactory implements CycleFactory {
    @Override
    public Cycle createCycle() {
        return new Bicycle();
    }
}