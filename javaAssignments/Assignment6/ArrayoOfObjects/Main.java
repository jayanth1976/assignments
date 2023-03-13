package javaAssignments.Assignment6.ArrayoOfObjects;

public class Main {
    public static void main(String[] args) {
        ArrayOfObjects[] arrOjb = new ArrayOfObjects[5];
        for(int i=0;i < 5;++i){
            arrOjb[i] = new ArrayOfObjects("hi");
        }
    }
}
