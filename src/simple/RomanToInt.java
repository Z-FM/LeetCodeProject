package simple;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Description: .
 * @Author: feiming.zhang@go-ling.com.
 */
public class RomanToInt {


    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
    }

    public static int romanToInt(String s) {
        if (null == s) {
            return 0;
        }

        Map<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
        char[] chars = s.toCharArray();
        int result = 0;
        for (int i = 0; i < chars.length; i++) {
            if(i+1<chars.length){
                if ("I".equals(String.valueOf(chars[i])) && "V".equals(String.valueOf(chars[i + 1]))) {
                    result += 4;
                    i++;
                    continue;
                }
                if ("I".equals(String.valueOf(chars[i])) && "X".equals(String.valueOf(chars[i + 1]))) {
                    result += 9;
                    i++;
                    continue;
                }
                if ("X".equals(String.valueOf(chars[i])) && "L".equals(String.valueOf(chars[i + 1]))) {
                    result += 40;
                    i++;
                    continue;
                }
                if ("X".equals(String.valueOf(chars[i])) && "C".equals(String.valueOf(chars[i + 1]))) {
                    result += 90;
                    i++;
                    continue;
                }
                if ("C".equals(String.valueOf(chars[i])) && "D".equals(String.valueOf(chars[i + 1]))) {
                    result += 400;
                    i++;
                    continue;
                }
                if ("C".equals(String.valueOf(chars[i])) && "M".equals(String.valueOf(chars[i + 1]))) {
                    result += 900;
                    i++;
                    continue;
                }
            }

            result += map.get(String.valueOf(chars[i]));
        }
        return result;
    }

}
