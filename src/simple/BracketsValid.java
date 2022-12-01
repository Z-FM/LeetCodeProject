package simple;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @Description: 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
 * 有效字符串需满足：
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。.
 * @Author: feiming.zhang@go-ling.com.
 */
public class BracketsValid {

    public static void main(String[] args) {
        System.out.println(isValid("(([]){})"));
    }

    public static boolean isValid(String s) {
//        // 不断替换符合规定的括号为空，最后不满足while条件时候，判断是否为空
//        while (s.contains("{}") || s.contains("[]") || s.contains("()")){
//            s = s.replace("{}", "");
//            s = s.replace("[]", "");
//            s = s.replace("()", "");
//        }
//        return s.isEmpty();
        Stack<Character>stack = new Stack<Character>();
        for(char c: s.toCharArray()){
            if(c=='(')stack.push(')');
            else if(c=='[')stack.push(']');
            else if(c=='{')stack.push('}');
            else if(stack.isEmpty()||c!=stack.pop())return false;
        }
        return stack.isEmpty();
    }

    /**
     * 对称.
     *
     * @param s s.
     * @return r.
     */
    public static boolean isSymmetric(String s) {
        Map<String, String> bracketMap = new HashMap<>();
        bracketMap.put(")", "(");
        bracketMap.put("}", "{");
        bracketMap.put("]", "[");

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length / 2; i++) {
            if (!String.valueOf(chars[i]).equals(bracketMap.get(String.valueOf(chars[chars.length - i - 1])))) {
                return false;
            }
        }
        return true;
    }

    /**
     * 非对称.
     *
     * @param s s.
     * @return r.
     */
    public static boolean nonSymmetric(String s) {
        Map<String, String> bracketMap = new HashMap<>();
        bracketMap.put(")", "(");
        bracketMap.put("}", "{");
        bracketMap.put("]", "[");

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length - 1; i++) {
            if (!String.valueOf(chars[i]).equals(bracketMap.get(String.valueOf(chars[i + 1])))) {
                return false;
            }
            i++;
        }
        return true;
    }

}
