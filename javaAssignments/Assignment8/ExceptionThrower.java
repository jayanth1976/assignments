package javaAssignments.Assignment8;

public class ExceptionThrower {
    public static void throwExceptions() throws Exception1, Exception2, Exception3 {
        int randomNumber = (int) (Math.random() * 4);
//        int randomNumber = 4;

        if (randomNumber == 0) {
            throw new Exception1("Exception 1");
        } else if (randomNumber == 1) {
            throw new Exception2("Exception 2");
        } else if(randomNumber == 3){
            throw new Exception3("Exception 3");
        }
        else {
            throw new NullPointerException("Null pointer exception");
        }
    }
}
