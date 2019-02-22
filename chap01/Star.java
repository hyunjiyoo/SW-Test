package chap01;

public class Star {
    public static void main(String[] args) {
        char star = '*';
        char blank = ' ';
        final int LOOP = 5;

        System.out.println("-----------------------------");
        for (int i = 0; i < LOOP; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(star);
            }
            System.out.println();
        }

        System.out.println("-----------------------------");
        for(int i = 0; i < LOOP; i++) {
            for (int j = LOOP; j > i; j--) {
                System.out.print(star);
            }
            System.out.println();
        }

        System.out.println("-----------------------------");
        for (int i = 0; i < LOOP; i++) {
            for (int j = LOOP -1; j > i; j--) {
                System.out.print(blank);
            }
            for (int k = 0; k < (2*i+1); k++){
                System.out.print(star);
            }
            System.out.println();
        }

        System.out.println("-----------------------------");
        for (int i = LOOP; i > 0; i--) {
            for (int j = LOOP; j > i; j--) {
                System.out.print(blank);
            }
            for (int k = 0; k < 2*i-1; k++) {
                System.out.print(star);
            }
            System.out.println();
        }

        System.out.println("-----------------------------");
        for (int i = 0; i < LOOP; i++) {
            if (i < LOOP/2) {
                for (int j = LOOP/2 ; j > i; j--) {
                    System.out.print(blank);
                }
                for (int k = 2*i+1; k > 0; k--) {
                    System.out.print(star);
                }
            } else {
                for (int j = LOOP-i-1; j < LOOP/2; j++) {
                    System.out.print(blank);
                }
                for (int k = 0; k < 2*(LOOP-i)-1; k++) {
                    System.out.print(star);
                }
            }
            System.out.println();
        }

        System.out.println("-----------------------------");
        for (int i = 0; i < LOOP; i++) {
            for (int j = 0; j < LOOP; j++) {
                if (i == LOOP/2) {
                    System.out.print(star);
                } else {
                    if (j == i || j == LOOP/2 || (i+j+1) == LOOP) {
                        System.out.print(star);
                    } else {
                        System.out.print(blank);
                    }
                }
            }
            System.out.println();
        }
    }
}
