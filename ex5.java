import java.util.Scanner;

class mmm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, positive = 0, negative = 0, zero = 0;
        char choice = 'Y';

        do {
            System.out.println("Enter a number: ");
            number = sc.nextInt();
            if (number > 0) {
                positive++;
            } else if (number < 0) {
                negative++;
            } else {
                zero++;
            }

            System.out.println("Do you want to Continue(y/n)? ");
            choice = sc.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');

        System.out.println("Postive number: " + positive);
        System.out.println("Negative number: " + negative);
        System.out.println("Zero number: " + zero);

    }
}
