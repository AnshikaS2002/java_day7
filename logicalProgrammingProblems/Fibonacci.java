package logicalProgrammingProblems;

import java.util.*;

public class Fibonacci {
    ArrayList<Integer> fib(int n) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(0);
        nums.add(1);
        for (int i = 2; i <= n; i++) {
            int val = nums.get(i - 1) + nums.get(i - 2);
            nums.add(val);
        }
        return nums;

    }

    public static void main(String[] args) {
        System.out.println("Enter the val");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Fibonacci fibonacci = new Fibonacci();
        ArrayList<Integer> nums = fibonacci.fib(n);
        for (int i = 0; i < nums.size(); i++) {
            System.out.println(nums.get(i));
        }
        scanner.close();
    }
}