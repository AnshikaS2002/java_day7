package logicalProgrammingProblems;

public class ReverseNumber {

    int reverseNum(int num) {
        int reverse = 0;
        while (num != 0) {
            reverse = (num % 10) + reverse * 10;
            num = num / 10;
        }
        return reverse;
    }

    public static void main(String[] args) {
        ReverseNumber rn = new ReverseNumber();
        System.out.println(rn.reverseNum(12345));
    }
}
