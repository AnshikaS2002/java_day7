package logicalProgrammingProblems;

import java.util.HashSet;
import java.util.Random;

public class CouponNumber {

    int distinctCount(int n) {
        int count = 0;
        HashSet<Integer> map = new HashSet<Integer>();
        Random random = new Random();
        int size = 0;
        while (size != n) {
            int curNum = random.nextInt(n + 1);
            System.out.println(curNum);
            map.add(curNum);
            size = map.size();
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        CouponNumber cn = new CouponNumber();
        System.out.println("count is" + cn.distinctCount(10));
    }
}
