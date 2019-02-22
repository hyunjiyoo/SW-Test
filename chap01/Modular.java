package chap01;

import java.util.Scanner;

// 10430
public class Modular {
    public static void main(String[] args) {
        int A = 2;
        int B = 2;
        int C = 2;

        Scanner scanner = new Scanner(System.in);

        if (2 <= A && A <= 10000) {
            if (2 <= B && B <= 10000) {
                if (2 <= C && C <= 10000) {
                    A = scanner.nextInt();
                    B = scanner.nextInt();
                    C = scanner.nextInt();

                    System.out.println((A+B)%C);
                    System.out.println((A%C + B%C)%C);
                    System.out.println((A*B)%C);
                    System.out.println((A%C * B%C)%C);
                }
            }
        }
    }
}
