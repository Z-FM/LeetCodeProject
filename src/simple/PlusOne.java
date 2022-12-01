package simple;

import java.util.Arrays;
import java.util.List;

/**
 * @Description: .
 * @Author: feiming.zhang@going-link.com.
 */
public class PlusOne {

    public static void main(String[] args) {
        System.out.println(Integer.valueOf("9876543210"));
//
//        int[] digits = new int[]{9,8,7,6,5,4,3,2,1,0};
//        int[] ints = plusOne(digits);
//        System.out.println(ints.length);
//        for (int i = 0; i < ints.length; i++) {
//            System.out.println(ints[i]);
//        }
    }

    public static int[] plusOne(int[] digits) {
        StringBuilder inputStr = new StringBuilder();
        for (int digit : digits) {
            inputStr.append(digit);
        }
        Integer integer = Integer.valueOf(inputStr.toString());
        integer++;
        String str = String.valueOf(integer);
        int[] result = new int[str.length()];// 新建一个数组用来保存num每一位的数字
        for (int i = 0; i < str.length(); i++) {
            // 遍历str将每一位数字添加如intArray
            Character ch = str.charAt(i);
            result[i] = Integer.parseInt(ch.toString());
        }
        return result;
        //最低位+1小于十，直接+1返回
//        if (digits[digits.length - 1] + 1 < 10) {
//            digits[digits.length - 1] = digits[digits.length - 1] + 1;
//            return digits;
//        }
//        //处理最后一位
//        digits[digits.length - 1] = digits[digits.length - 1] - 9;
//        //从倒数第二位开始循环
//        for (int i = digits.length - 2; i >= 0; i--) {
//            if (digits[i] + 1 >= 10) {
//                digits[i] = digits[i] - 9;
//            } else {
//                digits[i] = digits[i] + 1;
//                return digits;
//            }
//        }
//        int[] newDigits = new int[digits.length + 1];
//        newDigits[0] = 1;
//        for (int i = 0; i < digits.length; i++) {
//            newDigits[i + 1] = digits[i];
//        }
//        return newDigits;
    }


}
