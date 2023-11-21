package methoden;

import java.util.Scanner;

public class PCHaendler {

    public static void main(String[] args) {

        Scanner tastatur = new Scanner(System.in);

        // Eingabe
        System.out.print("Was moechten Sie bestellen: ");
        String artikel = liesString(tastatur);

        System.out.print("Geben Sie die Anzahl ein: ");
        int anzahl = liesInt(tastatur);

        System.out.print("Geben Sie den Nettopreis ein: ");
        double nettopreis = liesDouble(tastatur);

        System.out.print("Geben Sie den Mehrwertsteuersatz in Prozent ein: ");
        double mwst = liesDouble(tastatur);

        // Verarbeitung
        double nettogesamtpreis = berechneNettoPreis(anzahl, nettopreis);
        double bruttogesamtpreis = berechneBruttoPreis(nettogesamtpreis, mwst);

        // Ausgabe
        rechnungAusgeben(artikel, anzahl, nettogesamtpreis, bruttogesamtpreis, mwst);

        tastatur.close();
    }

    public static String liesString(Scanner scanner) {
        return scanner.next();
    }

    public static int liesInt(Scanner scanner) {
        return scanner.nextInt();
    }

    public static double liesDouble(Scanner scanner) {
        return scanner.nextDouble();
    }

    public static double berechneNettoPreis(int anzahl, double nettopreis) {
        return anzahl * nettopreis;
    }

    public static double berechneBruttoPreis(double nettoPreis, double mwst) {
        return nettoPreis * (1 + mwst / 100);
    }

    public static double berechneNettoPreis(double nettoPreis) {
        return berechneBruttoPreis(nettoPreis, 0.19);
    }

    public static void rechnungAusgeben(String artikel, int anzahl,
                                        double nettoPreis, double bruttoPreis, double mwst) {
        System.out.println("Rechnung");
        System.out.printf("Netto:  %-20s %6d %10.2f %n", artikel, anzahl, nettoPreis);
        System.out.printf("Brutto: %-20s %6d %10.2f (%.1f%s)%n", artikel, anzahl, bruttoPreis, mwst, "%");
    }
}
