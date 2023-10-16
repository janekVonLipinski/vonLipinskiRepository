import java.util.Scanner;

public class Multiplikationsmatrix {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scanner.nextInt();
        int count = 1;
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j < 9; j++) {
                if (count % number == 0 || count == number ||
                        isQuersumme(count, number)||containsNumber(count, number)) {
                    System.out.print("* ");
                    count++;
                } else {
                    System.out.print(count + " ");
                    count++;
                }
            }
            System.out.println();
        }
    }

    public static boolean isQuersumme(int number, int controlNumber) {

        int quersumme = 0;
        while (number != 0) {
            quersumme += number % 10;
            number /= 10;
        }
        return quersumme == controlNumber;
    }

    public static boolean containsNumber(int number, int controlNumber) {

        while (number != 0) {
            if (number % 10 == controlNumber) {
                return true;
            }
            number /= 10;
        }
        return false;
    }
}
