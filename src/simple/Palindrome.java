package simple;

/**
 * @Description: 回文数.
 * @Author: feiming.zhang@go-ling.com.
 */
public class Palindrome {

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        String palindrome = String.valueOf(x);
        char[] chars = palindrome.toCharArray();
        for (int i = 0; i <= chars.length / 2; i++) {

            if (chars[i] != chars[chars.length - i - 1]) {
                return false;
            }
        }
        return true;
    }

}
