import java.util.Scanner;

public class ZinsesZins {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Gib ein \n" +
                "Startkapital \n" +
                "Zinssatz \n" +
                "Laufzeit");
        double kapital = scanner.nextDouble();
        double eingezahltesKapital = kapital;
        double zinsSatz = scanner.nextDouble() / 100;
        int laufzeit = scanner.nextInt();

        int laufjahre = 0;
        while (laufjahre != laufzeit) {
            kapital += kapital * zinsSatz ;
            laufjahre += 1;
        }
        System.out.printf("Eingezahltes Kapital: %.2f%n ", eingezahltesKapital);
        System.out.printf("Ausgezahltes Kapital: %.2f", kapital);
    }
}
