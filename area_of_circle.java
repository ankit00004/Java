
/*Area of circle */
import java.util.Scanner;

class Maths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
         * int a = sc.nextInt();
         * int b = sc.nextInt();
         * int sum = a + b;
         * System.out.println(sum);
         */
        int r;
        double pi = 3.14, area;
        System.out.println("Radius of the circle:");
        r = sc.nextInt();
        area = pi * r * r;
        System.out.println("Area of circle");
        System.out.println(area);

    }

}
