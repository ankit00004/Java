import java.util.Scanner;

class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter number:");
        n = sc.nextInt();
        boolean isPrime = true;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            if (n == 1)
                System.out.println("This is neither prime or not composite");

            else
                System.out.println("This is a prime number");

        }
    }
}