package practice.arrays;

public class NumbersWithEvenNumberOfDigits {
    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int digits = 0;
            while(nums[i] > 0){
                digits++;
                nums[i] /= 10;
            }
            if(digits % 2 == 0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {555,901,482,1771};
        System.out.println(findNumbers(nums));
    }
}
