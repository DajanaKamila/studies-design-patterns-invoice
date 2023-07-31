package druk;

public class ChristmasTree {

        public static void printTree() {
            for(int i=1; i<=4; i++) {
                for(int k=1; k<=5-i+1; k++) {
                    System.out.print(" ");
                }
                for(int j=1; j<=2*i-1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            for(int i=1; i<=4; i++) {
                for(int k=1; k<=4-i+1; k++) {
                    System.out.print(" ");
                }
                for(int j=1; j<=2*i+1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            for(int i=1; i<=4; i++) {
                for(int k=1; k<=3-i+1; k++) {
                    System.out.print(" ");
                }
                for(int j=1; j<=2*i+3; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            for(int i=1; i<=2; i++) {
                for(int k=1; k<=5; k++) {
                    System.out.print(" ");
                }
                for(int j=1; j<=1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.print("  *******");
        }
}
