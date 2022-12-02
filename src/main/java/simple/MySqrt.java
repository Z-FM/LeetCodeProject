package main.java.simple;

/**
 * @Description: 给你一个非负整数 x ，计算并返回 x 的 算术平方根 。
 * 由于返回类型是整数，结果只保留 整数部分 ，小数部分将被 舍去.
 * @Author: feiming.zhang@going-link.com.
 */
public class MySqrt {

    public static void main(String[] args) {
        System.out.println(1 / 2);
        System.out.println(mySqrt(1));
    }

    public static int mySqrt(int x) {
        if (x == 1 || x == 0) {
            return x;
        }
        for (int i = x / 2; i > 0; i--) {
            if (i * i <= x) {
                return i;
            }
        }
        return 0;
    }

}
