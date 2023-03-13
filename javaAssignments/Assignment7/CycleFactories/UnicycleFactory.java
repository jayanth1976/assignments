package javaAssignments.Assignment7.CycleFactories;

public class UnicycleFactory implements CycleFactory {
    @Override
    public Cycle createCycle() {
        return new Unicycle();
    }
}
