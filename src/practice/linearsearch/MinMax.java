package practice.linearsearch;

public class MinMax {
    static int minimum(int[] arr){
        int min = arr[0];
        for(int n : arr){
            if(n < min){
                min = n;
            }
        }
        return min;
    }
    static int maximum(int[] arr){
        int max = arr[0];
        for(int n : arr){
            if(n > max){
                max = n;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {9, 7, 4, 10, 2, 6, 23, 28, 5};
        System.out.println("Minimum number: " + minimum(arr));
        System.out.println("Maximum number: " + maximum(arr));
    }
}
