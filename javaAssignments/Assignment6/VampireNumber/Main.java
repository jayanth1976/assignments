package javaAssignments.Assignment6.VampireNumber;

public class Main {
    public static void main(String[] args) {
        VampireNumber vNum = new VampireNumber();
        int cnt=0;
        long number=10;
        while(cnt < 100){
            if(vNum.isVampireNum(number)){
                System.out.println(number);
                cnt++;
            }
            number++;
        }

    }
}
