package main.java.simple;

/**
 * @Description: 最长公共前缀.
 * @Author: feiming.zhang@go-ling.com.
 */
public class LongestCommonPrefix {

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"ascb", "casc"}));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String sameStr = strs[0];
        for (String string : strs) {
            while (!string.startsWith(sameStr)) {
                sameStr = sameStr.substring(0, sameStr.length() - 1);
            }
        }
        return sameStr;
    }

}
