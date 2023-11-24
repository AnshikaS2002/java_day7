package logicalProgrammingProblems;

import java.util.Scanner;

public class StopWatch {

    long startTime = 0;
    long endTime = 0;
    long elapsedTime = 0;

    void start() {
        this.startTime = System.currentTimeMillis();
    }

    void end() {
        this.endTime = System.currentTimeMillis();
    }

    long elapsedTime() {
        return (endTime - startTime);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StopWatch stopWatch = new StopWatch();
        int option = 0;
        while (true) {
            if (option != 1)
                System.out.println("Enter 1 to start");
            System.out.println("Enter 2 to end");
            System.out.println("Enter 3 to exit");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    stopWatch.start();
                    break;
                case 2:
                    stopWatch.end();
                    System.out.println("Elapsed time in sec is " + stopWatch.elapsedTime() / 1000);
                    break;
                case 3:
                    scanner.close();
                    return;
            }
        }
    }
}
