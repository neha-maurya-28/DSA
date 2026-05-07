package practice.linearsearch;

import java.util.Arrays;

public class SearchIn2DArray {
    static boolean search(int[][] arr, int target){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(arr[i][j] == target){
                    return true;
                }
            }
        }
        return false;
    }
    static int[] searchIndex(int[][] arr, int target){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(arr[i][j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[] {-1, -1};
    }
    public static void main(String[] args) {
        int[][] arr = {
                {5, 12, 3},
                {8, 6, 11, 28},
                {7}
        };
        int target = 6;

        System.out.println("Index of target: " + Arrays.toString(searchIndex(arr, target)));

//        if(search(arr, target)){
//            System.out.println("Found");
//        }else{
//            System.out.println("Not Found");
//        }
    }
}
