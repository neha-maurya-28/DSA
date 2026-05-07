package practice.linearsearch;

public class SearchInRange {
    static boolean searchInRange(int[] array, int starting_Index, int ending_Index, int target){
        if(starting_Index >= 0 && ending_Index < array.length){
            for(int i = starting_Index; i <= ending_Index; i++){
                if(array[i] == target){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {9, 7, 4, 10, 2, 6, 23, 28, 5};
        int start = 2;
        int end = 7;
        int target = 100;
        if(searchInRange(arr, start, end, target)){
            System.out.println("Found");
        }else{
            System.out.println("Not Found");
        }
    }
}
