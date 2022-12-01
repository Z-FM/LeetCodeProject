package simple;

import java.util.*;

/**
 * @Description: .
 * @Author: feiming.zhang@go-ling.com.
 */
public class TwoListNodeSum {

    public static void main(String[] args) {

    }

    public List<Integer> addTwoNumbers(LinkedList<Integer> l1, LinkedList<Integer> l2) {
        List<Integer> result = new LinkedList<Integer>();
        if (l1.size() == 0) {
            return l2;
        }
//        if (l2.size() == 0) {
//            return l1;
//        }
        boolean needIndexAdd = false;
        for (int i = 0; i < l1.size(); i++) {
            if (i >= l2.size() && i > 0) {

                return result;
            }

            Integer first = l1.get(i);
            Integer secound = l2.get(i);

            if (first + secound + (needIndexAdd ? 1 : 0) < 10) {
                result.add(first + secound);
                needIndexAdd = false;
            } else {
                result.add(first + secound + (needIndexAdd ? 1 : 0));
                needIndexAdd = true;
            }
        }
        return result;
    }
}
