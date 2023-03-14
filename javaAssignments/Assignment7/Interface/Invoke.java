package javaAssignments.Assignment7.Interface;

public class Invoke {
    void methodsOfFirstInterface(FirstInterface first) {
        first.m1FromFirstInterface();
        first.m2FromFirstInterface();
    }
    void methodsOfSecondInterface(SecondInterface second) {
        second.m1FromSecondInterface();
        second.m2FromSecondInterface();
    }
    void methodsOfThirdInterface(ThirdInterface third){
        third.m1FromThirdInterface();
        third.m2FromThirdInterface();
    }
    void compositeMethod(CompositeInterface combined){
        combined.methodFromCompositeInterface();
    }
}
