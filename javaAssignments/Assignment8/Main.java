package javaAssignments.Assignment8;

public class Main {
    public static void main(String[] args) {
        try {
            ExceptionThrower.throwExceptions();
        } catch (Exception e) {
            System.out.println("Caught exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}
