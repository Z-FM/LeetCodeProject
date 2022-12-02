package main.java.simple;

/**
 * @Description: 给你两个字符串 haystack 和 needle ，请你在 haystack 字符串中找出 needle 字符串出现的第一个位置（下标从 0 开始）。
 * 如果不存在，则返回  -1 .
 * @Author: feiming.zhang@go-ling.com.
 */
public class StrStr {

    public static void main(String[] args) {
        int i = strStr("abc", "c");
        System.out.println(i);
    }

    public static int strStr(String haystack, String needle) {
        if (haystack == null || haystack.length() == 0 || needle == null || needle.length() == 0) {
            return 0;
        }
        if (haystack.length() < needle.length() || (!haystack.equals(needle) && haystack.length() == needle.length())) {
            return -1;
        }
        if (haystack.equals(needle)) {
            return 0;
        }
        char[] sourceChar = haystack.toCharArray();
        char[] targetChar = needle.toCharArray();
        //记录本次外循环位置
        int index = 0;
        //记录外循环位置
        int outIndex = 0;
        //记录内循环位置
        int inIndex = 0;
        while (outIndex <= sourceChar.length - targetChar.length) {

            while (inIndex < targetChar.length) {
                //不相等，内循环从头开始，外循环位置加1。
                if (sourceChar[index] != targetChar[inIndex]) {
                    inIndex = 0;
                    outIndex++;
                    index = outIndex;
                    break;
                } else {
                    //相等内外指针向后移动
                    index++;
                    inIndex++;
                }
            }
            if (inIndex == targetChar.length) {
                return index - targetChar.length;
            }
        }
        return -1;
    }

}
