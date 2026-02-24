package test;

public class assignq10 {
     public static void main(String[] args) {
        for(int i = 1; i <= 5; i += 2) {

            for(int s = 5; s > i; s-= 2) {
                System.out.print(" ");
            }

            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        // lower part
        for(int i = 3; i >= 1; i -= 2) {

            for(int s = 5; s > i; s -= 2) {
                System.out.print(" ");
            }

            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}