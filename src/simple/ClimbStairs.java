package simple;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description: 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢.
 * @Author: feiming.zhang@going-link.com.
 */
public class ClimbStairs {

//    public static Map<Integer, Integer> tempMap = new HashMap<>();

    public static void main(String[] args) {
//        System.out.println(climbStairs(3));
        BigDecimal shipQuantity = new BigDecimal(0);
        BigDecimal quantity = new BigDecimal(1);
//        System.out.println(quantity.compareTo(null));
        System.out.println(shipQuantity.compareTo(quantity) == -1);
    }

    /**
     * (f(n) = f(n-1)+f(n-2))
     * 10阶台阶可以从第九阶走一步或者第八阶走两部上->第三阶可以从第二阶走一步或第一阶走两步上.
     *
     * @param n 次数.
     * @return 结果.
     */
    public static int climbStairs(int n) {

        if (n == 0) {
            return 0;
        }
        if (n <= 2) {
            return n;
        }
        //递归，暂存。自顶而下
//        if (tempMap.containsKey(n)) {
//            return tempMap.get(n);
//        } else {
//            int tempN = climbStairs(n - 1) + climbStairs(n - 2);
//            tempMap.put(n, tempN);
//            return tempN;
//        }
        //动态规划，由底向上推
        int a = 1;
        int b = 2;
        int temp = 0;

        for (int i = 3; i <= n; i++) {
            temp = a + b;
            a = b;
            b = temp;
        }
        return temp;
    }

}
