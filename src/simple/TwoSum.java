package simple;

/**
 * @Description: .
 * @Author: feiming.zhang@go-ling.com.
 */
public class TwoSum {
    public static void main(String[] args) {
        int[] nums = new int[3];
        nums[0] = 3;
        nums[1] = 2;
        nums[2] = 4;
        int[] ints = twoSum(nums, 6);
        System.out.println(ints[0]);
        System.out.println(ints[1]);
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] results = new int[2];
        for(int i = 0; i < nums.length-1 ; i++){
            int firstNum = nums[i];
            for(int j = i+1; j < nums.length ; j++){
                int secondNum = nums[j];
                if((firstNum + secondNum) == target){
                    results[0] = i;
                    results[1] = j;
                    return results;
                }
            }
        }
        return results;
    }
}
