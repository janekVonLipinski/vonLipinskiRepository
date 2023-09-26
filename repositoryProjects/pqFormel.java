package repositoryProjects;

import java.util.Scanner;

public class pqFormel {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers p, first then q");
        double p = scanner.nextDouble();
        double q = scanner.nextDouble();

        if (q > (p * p / 4)) {
            System.out.println("Es gibt keine Nullstelle");
        } else if ((p * p / 4 - q) == 0) {
            double x1 = - p / 2;
            System.out.println("Die Nullstelle bei x1 liegt bei x1 = " + x1);
        } else {
            double x1 = - p / 2 - Math.sqrt(p * p / 4 - q);
            double x2 = - p / 2 + Math.sqrt(p * p / 4 - q);
            System.out.println("Die Nullstellen liegen bei x1 = " + x1 + " und " + x2);
        }

    }
}
