package javaAssignments.Assignment7.CycleFactories;

class TricycleFactory implements CycleFactory {
    @Override
    public Cycle createCycle() {
        return new Tricycle();
    }
}