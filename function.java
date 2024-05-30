import java.util.Scanner;

class Function {
    /*
     * public static int calculation(int a, int b) {
     * int sum = a + b;
     * // System.out.println(sum);
     * return sum;
     * }
     * 
     * public static void main(String[] args) {
     * Scanner sc = new Scanner(System.in);
     * // int a = sc.nextInt();
     * // int b = sc.nextInt();
     * 
     * int sum = calculation(5, 6);
     * System.out.println(sum);
     * 
     * }
     */

    // factorial of a number
    public static void factorial(int n) {
        if (n < 0) {
            System.out.println("Invalid");
            return;
        }
        int factorial = 1;
        for (int i = n; i >= 1; i--) {
            factorial = factorial * i;

        }
        System.out.println(factorial);
        return;

    }

    public static void main(String[] ags) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        factorial(n);

    }
}