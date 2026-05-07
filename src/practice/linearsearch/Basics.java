package practice.linearsearch;

public class Basics {
    static int linearSearch(int[] arr, int target){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {9, 5, 2, 10, 6};
        int target = 50;
        if(linearSearch(arr, target) >= 0){
            System.out.println("Found");
        }else{
            System.out.println("Not Found");
        }
    }
}
