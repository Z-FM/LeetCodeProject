package main.java.simple;

/**
 * @Description: 给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
 * 不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
 * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素.
 * @Author: feiming.zhang@go-ling.com.
 */
public class RemoveElement {

    public static void main(String[] args) {
        int[] nums = new int[]{0,1,2,2,3,0,4,2};
        int i = removeElement(nums, 2);
        System.out.println(i);
        for (int num : nums) {
            System.out.print(num + ",");
        }
    }

    public static int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        //开头可能为0，左右指针都从0开始
        int right = 0;
        int left = 0;
        while (right < nums.length) {
            //右指针不等于制定值，进行赋值，并移动两个指针
            if (nums[right] != val) {
                nums[left] = nums[right];
                left++;
                right++;
            } else {
                //右指针等于制定值，只移动右指针
                right++;
            }
        }

        return left;
    }

}
