package chap01;

import java.util.Scanner;

public class Main2839 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int three = 0, five, N;
        N = scan.nextInt();
        five = N/5;
        N %= 5;
        while (five >= 0) {
            if (N % 3 == 0) {
                three = N/3;
                N %= 3;
                break;
            }
            five--;
            N += 5;
        }
        System.out.print((N == 0) ? (five+three) : -1);
    }
}