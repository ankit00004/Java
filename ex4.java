import java.util.Scanner;

class Number {
    /*
     * public static void prime(int a) {
     * 
     * boolean isPrime = true;
     * for (int i = 2; i <= a / 2; i++) {
     * if (a % i == 0) {
     * isPrime = false;
     * break;
     * }
     * }
     * 
     * if (isPrime) {
     * if (a == 1) {
     * System.out.println("This is neither prime number");
     * 
     * } else {
     * System.out.println("This is a prime number");
     * }
     * }
     * return;
     * }
     */

    /*
     * public static void even(int a) {
     * if (a % 2 == 0)
     * 
     * {
     * System.out.println("Even number");
     * 
     * } else {
     * System.out.println("Odd number");
     * }
     * return;
     * }
     */

    /*
     * public static void table(int a) {
     * 
     * for (int i = 1; i <= 10; i++) {
     * int mul = a * i;
     * // System.out.println(a + "*" + i + "=" + a * i);
     * System.out.println(mul);
     * }
     * 
     * }
     */

    /*
     * public static void average(int a, int b, int c) {
     * int avg = (a + b + c) / 3;
     * System.out.println("Average of three number is: " + avg);
     * }
     */

    /*
     * public static void sumOfOdd(int a) {
     * int sum = 0;
     * for (int i = 0; i <= a; i++) {
     * if ((i % 2) == 1) {
     * sum += i;
     * }
     * }
     * System.out.println("Sum of all odd number 0 to " + a + " = " + sum);
     * 
     * }
     */

    /*
     * public static void greaterNumber(int a, int b) {
     * if (a > b) {
     * System.out.println("1st number is greater than 2nd");
     * } else if (a < b) {
     * System.out.println("2nd number is greater than 1st");
     * } else {
     * System.out.println("Both are equal");
     * }
     * 
     * }
     */

    /*
     * public static void circumference(int a) {
     * double pi = 3.14, circum;
     * circum = 2 * pi * a;
     * System.out.println("Circumference of a circle is = " + circum);
     * 
     * }
     */

    /*
     * public static void voteEligiblity(int a) {
     * if (a > 18) {
     * System.out.println("You are eligible for vote");
     * } else {
     * System.out.println("You are not eligible for vote");
     * }
     * }
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Enter your age:");
        a = sc.nextInt();

        /*
         * do {
         * System.out.println(a);
         * } while (true);
         */

        /*
         * System.out.println("Enter 2nd number:");
         * b = sc.nextInt();
         * 
         * System.out.println("Enter 3rd number:");
         * c = sc.nextInt();
         */
        // prime(a);
        // even(a);
        // table(a);
        // average(a, b, c);
        // sumOfOdd(a);
        // greaterNumber(a, b);
        // circumference(a);
        // voteEligiblity(a);

    }
}