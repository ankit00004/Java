import java.util.Scanner;

class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        int add, sub, mul, div, mod;
        System.out.print("Enter 1st number:");
        a = sc.nextInt();
        System.out.print("Enter 2nd number:");
        b = sc.nextInt();

        add = a + b;
        sub = a - b;
        mul = a * b;
        div = a / b;
        mod = a % b;

        System.out.println(
                "Select for operation:\n1.Addition\n2.Substraction\n3.Multiplication\n4.Division\n5.Remainder");
        c = sc.nextInt();
        switch (c) {
            case 1:
                System.out.println(add);
                break;
            case 2:
                System.out.println(sub);
                break;
            case 3:
                System.out.println(mul);
                break;
            case 4:
                System.out.println(div);
                break;
            case 5:
                System.out.println(mod);
                break;
            default:
                System.out.println("Inalid");
        }

    }
}