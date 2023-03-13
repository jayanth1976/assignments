package javaAssignments.Assignment6.VampireNumber;

public class VampireNumber {
    boolean isVampireNum(long number){
        //1260 -> 21*60
        String numAsStr = Long.toString(number);
        Sort sort = new Sort();
        if(numAsStr.length()%2!=0) return false;
        int halfLen = numAsStr.length()/2;
        for(long i = (long) Math.pow(10, halfLen - 1); i <= (long) Math.sqrt(number); i++){
            if (number % i == 0) {
                long x = i;
                long y = number / i;
                String xAsString = Long.toString(x);
                String yAsString = Long.toString(y);

                //if both x and y contains trailing zeros then continue with next number
                if (xAsString.endsWith("0") && yAsString.endsWith("0")) continue;

                //check if x and y contain all the letters present in number


                if(sort.sortString(numAsStr).equals(sort.sortString(xAsString+yAsString))) return true;
            }
        }
        return false;
    }

}
