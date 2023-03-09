package javaAssignments.Assignment3;

import java.util.ArrayList;
import java.util.Collections;

public class Median {
    double getMedian(ArrayList<Double> tripTimes){
        Collections.sort(tripTimes);
        System.out.println("Trip times : " + tripTimes);
        int mid = tripTimes.size()/2;
        if(tripTimes.size() % 2 == 0 ){
            double ans = tripTimes.get(mid) + tripTimes.get(mid-1);
            return ans/2;
        }
        else return tripTimes.get(mid-1);
    }
}
