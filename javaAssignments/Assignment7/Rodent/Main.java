package javaAssignments.Assignment7.Rodent;

public class Main {
    public static void main(String[] args) {
        Rodent[] rodent = new Rodent[3];
        rodent[0] = new Mouse();
        rodent[1] = new Gerbil();
        rodent[2] = new Hamster();
        for (int index = 0; index < 3; index += 1) {
            rodent[index].land();
            rodent[index].vehicle();
        }
    }
}
