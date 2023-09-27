package repositoryProjects;

import java.util.Scanner;

public class Schaltjahr {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean schaltjahr = false;
        System.out.println("Enter a year");
        int year = scanner.nextInt();

        if ((year % 4 == 0)) {
            if ((year % 100 == 0)) {
                if (year % 400 == 0) {
                    schaltjahr = true;
                }
            } else {
                schaltjahr = true;
            }
        }
        System.out.println(schaltjahr);
    }
}
