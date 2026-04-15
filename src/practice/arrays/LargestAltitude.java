package practice.arrays;

import java.util.Arrays;

public class LargestAltitude {
    public static int largestAltitude(int[] gain) {
        int highest = 0;
        int altitude = 0;
        for (int j : gain) {
            altitude += j;
            if (altitude > highest) {
                highest = altitude;
            }
        }
        return highest;
    }
    public static void main(String[] args) {
        int[] gain = {-4,-3,-2,-1,4,3,2};
        System.out.println( largestAltitude(gain));
    }
}
