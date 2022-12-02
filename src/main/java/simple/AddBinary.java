package main.java.simple;

/**
 * @Description: 给你两个二进制字符串，返回它们的和（用二进制表示）.
 * @Author: feiming.zhang@going-link.com.
 */
public class AddBinary {

    public static void main(String[] args) {
        System.out.println(addBinary("100", "110010"));
    }

    public static String addBinary(String a, String b) {

        char[] achars = a.toCharArray();
        char[] bchars = b.toCharArray();
        int lengthMax = Math.max(achars.length, bchars.length);
        if (achars.length != lengthMax) {
            char[] charTmp = new char[lengthMax];
            for (int i = charTmp.length - 1; i >= 0; i--) {
                if (lengthMax <= achars.length + i) {
                    charTmp[i] = achars[i - (lengthMax - achars.length)];
                } else {
                    charTmp[i] = '0';
                }
            }
            achars = charTmp;
        }
        if (bchars.length != lengthMax) {
            char[] charTmp = new char[lengthMax];
            for (int i = charTmp.length - 1; i >= 0; i--) {
                if (lengthMax <= bchars.length + i) {
                    charTmp[i] = bchars[i - (lengthMax - bchars.length)];
                } else {
                    charTmp[i] = '0';
                }
            }
            bchars = charTmp;
        }
        int[] ints = new int[lengthMax];

        for (int i = ints.length - 1; i >= 0; i--) {
            ints[i] = ints[i] + Integer.parseInt(String.valueOf(achars[i]));
            ints[i] = ints[i] + Integer.parseInt(String.valueOf(bchars[i]));
        }

        StringBuilder result = new StringBuilder();
        boolean needEnterOne = false;

        for (int i = ints.length - 1; i >= 0; i--) {
            //需要进位
            if (ints[i] + (needEnterOne ? 1 : 0) > 1) {
                if (ints[i] + (needEnterOne ? 1 : 0) > 2) {
                    ints[i] = 1;
                } else {
                    ints[i] = 0;
                }
                needEnterOne = true;
            } else {
                //如果需要进位，说明原来为0
                if (needEnterOne) {
                    ints[i] = 1;
                }
                needEnterOne = false;
            }
            result.insert(0, ints[i]);
        }

        if (!needEnterOne) {
            return result.toString();
        }
        //最终要进位，新建数组长度加1
        return 1 + result.toString();
    }

}
