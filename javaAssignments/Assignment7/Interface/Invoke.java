package javaAssignments.Assignment7.Interface;

public class Invoke {
    void invoke1(FirstInterface first) {
        first.m1FromFirstInterface();
        first.m2FromFirstInterface();
    }
    void invoke2(SecondInterface second) {
        second.m1FromSecondInterface();
        second.m2FromSecondInterface();
    }
    void invoke3(ThirdInterface third){
        third.m1FromThirdInterface();
        third.m2FromThirdInterface();
    }
    void invoke4(CompositeInterface combined){
        combined.methodFromCompositeInterface();
    }
}
