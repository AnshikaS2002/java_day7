package logicalProgrammingProblems;

public class PerfectNumber {

    boolean isPerfectNum(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0)
                sum += i;
        }
        return (sum == num);
    }

    public static void main(String[] args) {
        System.out.println("welcome");
        PerfectNumber pn = new PerfectNumber();
        if (pn.isPerfectNum(30))
            System.out.println("yes, it is a perfect number");
        else
            System.out.println("Not a perfect number");
    }
}
