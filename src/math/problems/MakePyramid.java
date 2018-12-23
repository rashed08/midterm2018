package math.problems;

public class MakePyramid {
    public static void main(String[] args) {

        //   Implement a large Pyramid of stars in the screen with java.
        //
        //                    *
        //                   * *
        //                  * * *
        //                 * * * *
        //                * * * * *
        //               * * * * * *

        //Start Here

        int n = 6;
        printTriagle(n);
    }


    public static void printTriagle(int n) {

        int a = 2 * n - 2;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < a; j++) {

                System.out.print(" ");
            }

            a = a - 1;

            for (int j = 0; j <= i; j++) {

                System.out.print("* ");
            }


            System.out.println();
        }
    }
}
