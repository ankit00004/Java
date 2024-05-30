import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // solid rectangle
        /*
         * int n = 4;
         * int m = 5;
         * //outer loop
         * for (int i = 1; i <= n; i++) {
         * //inner loop
         * for (int j = 1; j <= m; j++) {
         * System.out.print("*");
         * }
         * System.out.println();
         * }
         */

        // hollow rectangle
        /*
         * int n = 4;
         * int m = 5;
         * // outer loop
         * for (int i = 1; i <= n; i++) {
         * // inner loop
         * for (int j = 1; j <= m; j++) {
         * if (i == 1 || j == 1 || i == n || j == m) {
         * System.out.print("*");
         * } else {
         * System.out.print(" ");
         * }
         * 
         * }
         * System.out.println();
         * }
         */

        // half pyramid
        /*
         * int n = 4;
         * // outer loop
         * for (int i = 0; i <= n; i++) {
         * // inner loop
         * for (int j = 1; j <= i; j++) {
         * System.out.print("*");
         * }
         * System.out.println();
         * 
         * }
         * int n = 4;
         * // outer loop
         * for (int i = n; i >= 1; i--) {
         * // inner loop
         * for (int j = 1; j <= i; j++) {
         * System.out.print("*");
         * }
         * System.out.println();
         * 
         * }
         */

        /*
         * int n = 4;
         * // outer loop
         * for (int i = 1; i <= n; i++) {
         * // inner loop for space
         * for (int j = 1; j <= n - i; j++) {
         * System.out.print(" ");
         * }
         * // inner loop for star
         * for (int j = 1; j <= i; j++) {
         * System.out.print("*");
         * }
         * System.out.println();
         * }
         */

        /*
         * int n = 5;
         * //outer loop
         * for (int i = 1; i <= n; i++) {
         * //inner loop
         * for (int j = 1; j <= i; j++) {
         * System.out.print(j + " ");
         * }
         * System.out.println();
         * 
         * }
         */

        /*
         * int n = 5;
         * //outer loop
         * for (int i = n; i >= 1; i--) {
         * //inner loop
         * for (int j = 1; j <= i; j++) {
         * System.out.print(j + " ");
         * }
         * System.out.println();
         * }
         */

        // floyd's Triangle
        /*
         * int n = 5;
         * int number = 1;
         * //outer loop
         * for (int i = 1; i <= n; i++) {
         * //inner loop
         * for (int j = 1; j <= i; j++) {
         * System.out.print(number + " ");
         * number++;
         * }
         * System.out.println();
         * }
         */

        /*
         * int n = 5;
         * // outer loop
         * for (int i = 1; i <= n; i++) {
         * // inner loop
         * for (int j = 1; j <= i; j++) {
         * int sum = i + j;
         * if (sum % 2 == 0) {
         * System.out.print("1" + " ");
         * } else {
         * System.out.print("0" + " ");
         * }
         * 
         * }
         * System.out.println();
         * }
         */

        /*
         * int n = 5;
         * // outer loop
         * for (int i = 1; i <= n; i++) {
         * // inner loop for space
         * for (int j = 1; j <= n - i; j++) {
         * System.out.print(" ");
         * }
         * for (int j = 1; j <= n; j++) {
         * System.out.print("*");
         * }
         * System.out.println();
         * 
         * }
         */

        /*
         * int n = 5;
         * // outer loop
         * for (int i = 1; i <= n; i++) {
         * // inner loop for space
         * for (int j = 1; j <= n - i; j++) {
         * System.out.print(" ");
         * }
         * // inner loop for number
         * for (int j = 1; j <= i; j++) {
         * System.out.print(i + " ");
         * }
         * System.out.println();
         * 
         * }
         */

        /*
         * int n = 5;
         * // outer loop
         * for (int i = 1; i <= n; i++) {
         * // inner loop for space
         * for (int j = 1; j <= n - i; j++) {
         * System.out.print(" ");
         * }
         * // first part
         * for (int j = i; j >= 1; j--) {
         * System.out.print(j);
         * }
         * // second part
         * for (int j = 2; j <= i; j++) {
         * System.out.print(j);
         * }
         * System.out.println();
         * }
         */

        // -------------------------------------------------------------------------------------------------
        /*
         * int n = 4;
         * // First part
         * // outer loop
         * for (int i = 1; i <= 4; i++) {
         * // inner loop
         * for (int j = 1; j <= i; j++) {
         * System.out.print("*");
         * }
         * for (int j = 1; j <= 2 * (n - i); j++) {
         * System.out.print(" ");
         * }
         * for (int j = 1; j <= i; j++) {
         * System.out.print("*");
         * }
         * System.out.println();
         * }
         * // Second part
         * // outer loop
         * for (int i = n; i >= 1; i--) {
         * // inner loop
         * for (int j = 1; j <= i; j++) {
         * System.out.print("*");
         * }
         * for (int j = 1; j <= 2 * (n - i); j++) {
         * System.out.print(" ");
         * }
         * for (int j = 1; j <= i; j++) {
         * System.out.print("*");
         * }
         * System.out.println();
         * 
         * }
         */

        /*
         * int n = 4;
         * // upper half
         * // outer loop
         * for (int i = 1; i <= n; i++) {
         * // inner loop
         * for (int j = 1; j <= n - i; j++) {
         * System.out.print(" ");
         * }
         * for (int j = 1; j <= 2 * i - 1; j++) {
         * System.out.print("*");
         * }
         * System.out.println();
         * 
         * }
         * // lower half
         * // outer loop
         * for (int i = n; i >= 1; i--) {
         * // inner loop
         * for (int j = 1; j <= n - i; j++) {
         * System.out.print(" ");
         * }
         * for (int j = 1; j <= 2 * i - 1; j++) {
         * System.out.print("*");
         * }
         * System.out.println();
         * 
         * }
         */

    }

}
