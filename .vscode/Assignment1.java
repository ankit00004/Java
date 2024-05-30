import java.util.Scanner;

class INC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c, d;
        System.out.println("Enter four number:");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        if (a == b && b == c && c == d) {
            System.out.println("All number are equal");
        } else {
            System.out.println("Not Equal");
        }

    }
}