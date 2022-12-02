package main.java.simple;

/**
 * @Description: .
 * @Author: feiming.zhang@go-ling.com.
 */
public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 1};
        int i = removeDuplicates(nums);
        System.out.println(i);
        for (int i1 = 0; i1 < nums.length; i1++) {
            System.out.println(nums[i1]);
        }
    }

    public static int removeDuplicates(int[] nums) {
        if (nums == null) {
            return 0;
        }
        if (nums.length == 0 || nums.length == 1) {
            return nums.length;
        }
        //遍历
//        int temp = 0;
//        int nextIndex = 0;
//        for (int i = 0; i < nums.length; i++) {
//            //相等替换
//            if (nextIndex <= nums.length - 1 && nums[i] == nums[nextIndex]) {
//                //取值后移
//                nextIndex++;
//                i--;
//            } else {
//                if (nextIndex < nums.length) {
//                    temp = nums[nextIndex];
//                    nums[i + 1] = nums[nextIndex];
//                    temp = i + 2;
//                }
//            }
//        }
//        if (temp == 0) {
//            return temp + 1;
//        }
//        return temp;

        // 用双指针，贼快，只是时间复杂度和空间复杂度有点拉跨
        // 定义左指针和右指针
        // 左指针为0
        // 右指针为1
        int left = 0;
        int right = 1;
        // 遍历数组中的每个数
        // 如果当前数等于left指针指向的数，继续移动右指针
        // 否则改变left指针后面的数
        // 让left指针走一步
        // right指针继续往前走
        while(right<nums.length){
            if(nums[right] == nums[left]){
                right++;
            }else{
                nums[left+1] = nums[right];
                left++;
                right++;
            }
        }
        // 最后返回left指针加一即为新数组的长度
        return left+1;
    }

}
