package repositoryProjects.FahrkartenAutomat;

import java.util.Scanner;

public class Main {

    /*
    */
    public static void main(String[] args) {

        Scanner tastatur = new Scanner(System.in);

        double zuZahlenderBetrag = 0;
        double eingezahlterGesamtbetrag;
        double eingeworfeneMuenze;
        double rueckgabebetrag;
        double nochZuZahlen;
        int anzahlTickets = 0;
        int gesamtAnzahlTickets = 0;

        // 1
        boolean running  = true;
        while (running) {
            if (zuZahlenderBetrag != 0) {
                System.out.println("akutell zu zu zahlender Betrag" + zuZahlenderBetrag);
            }
            System.out.println("Was für eine Fahrkarte willst du ? \n" +
                    "Kurzstrecke AB [2,00 Euro] (1) +\n" +
                    "Tageskarte AB [3,00 Euro] (2) \n" +
                    "Berlin-Brandenburg-Ticket [10,00 Euro] (3) \n" +
                    "Standard (jede andere Zahl) [4,00 Euro]");
            int ticketkind = tastatur.nextInt();
            System.out.println("Wie viele Tickets willst du?");
            anzahlTickets = tastatur.nextInt();

            if (gesamtAnzahlTickets + anzahlTickets < 0 || gesamtAnzahlTickets + anzahlTickets > 10) {
                System.out.println("Keep it simple stupid + \n" +
                        "Tickets wurden auf ursprünglichen Wert zurükgesetzt");
                continue;
            } else {
                gesamtAnzahlTickets += anzahlTickets;
            }

            switch(ticketkind) {
                case 1 -> zuZahlenderBetrag += 2 * anzahlTickets;
                case 2 -> zuZahlenderBetrag += 3 * anzahlTickets;
                case 3 -> zuZahlenderBetrag += 10 * anzahlTickets;
                default -> zuZahlenderBetrag += 0;
            }
            System.out.println("Willst du noch mehr Fahrscheine+\n" +
                    " Nein (1) - Ja (2)");
            int quit = tastatur.nextInt();
            if (quit == 1) {
                running = false;
            }
        }
        if (!(anzahlTickets <= 10 && anzahlTickets > 0)) {
            anzahlTickets = 1;
            System.out.println("Ungültige Eingabe, Tickets = 1");
        }

        // 2
        eingezahlterGesamtbetrag = 0.0;
        nochZuZahlen = 0.0;
        while (eingezahlterGesamtbetrag < zuZahlenderBetrag) {
        nochZuZahlen = zuZahlenderBetrag - eingezahlterGesamtbetrag;
        System.out.printf("Noch zu zahlen: %.2f ", nochZuZahlen);
        System.out.print("Eingabe (mind. 5 Cent, höchstens 2 Euro): ");
        eingeworfeneMuenze = tastatur.nextDouble();
        switch (Double.toString(eingeworfeneMuenze)) {
            case "0.05", "0.1", "0.2", "0.5", "1.0", "2.0", "5.0", "10.0", "20.0" -> {}
            default -> eingeworfeneMuenze = 0;
        }
        eingezahlterGesamtbetrag = eingezahlterGesamtbetrag + eingeworfeneMuenze;
        }

        // 3
        System.out.println("\nFahrschein wird ausgegeben");
        System.out.printf("Sie haben %s Fahrscheine gekauft. \n", gesamtAnzahlTickets);
        for (int i = 0; i < 8; i++) {
        System.out.print("=");
        try {
        Thread.sleep(200);
        }
        catch (InterruptedException e) {
        e.printStackTrace();
        }
        }
        System.out.println("\n\n");

        // 4
        rueckgabebetrag = eingezahlterGesamtbetrag - zuZahlenderBetrag;
        if (rueckgabebetrag > 0.0) {
        System.out.printf("Der Rückgabebetrag in Höhe von %.2f Euro \n", rueckgabebetrag);
        System.out.println("wird in folgenden Münzen ausgezahlt:");

        while (rueckgabebetrag >= 2.0) { // 2-Euro-Münzen
        System.out.println("2 Euro");
        rueckgabebetrag = rueckgabebetrag - 2.0;
        }
        while (rueckgabebetrag >= 1.0) { // 1-Euro-Münzen
        System.out.println("1 Euro");
        rueckgabebetrag = rueckgabebetrag - 1.0;
        }
        while (rueckgabebetrag >= 0.5) { // 50-Cent-Münzen
        System.out.println("50 Cent");
        rueckgabebetrag = rueckgabebetrag - 0.5;
        }
        while (rueckgabebetrag >= 0.2) { // 20-Cent-Münzen
        System.out.println("20 Cent");
        rueckgabebetrag = rueckgabebetrag - 0.2;
        }
        while (rueckgabebetrag >= 0.1) { // 10-Cent-Münzen
        System.out.println("10 Cent");
        rueckgabebetrag = rueckgabebetrag - 0.1;
        }
        while (rueckgabebetrag >= 0.05) { // 5-Cent-Münzen
        System.out.println("5 Cent");
        rueckgabebetrag = rueckgabebetrag - 0.05;
        }

        }

        System.out.println("\nVergessen Sie nicht, den Fahrschein\n" + "vor Fahrtantritt entwerten zu lassen!\n"
        + "Wir wünschen Ihnen eine gute Fahrt.");

        tastatur.close();
    }
}