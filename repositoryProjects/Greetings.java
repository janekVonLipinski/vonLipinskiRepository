package repositoryProjects;

import java.util.Date;

public class Greetings {

    public static void main(String[] args) {

        Date date = new Date();
        switch (date.getHours()) {
            case 22, 23, 0, 1, 2, 3, 4 -> System.out.println("Gute Nacht");
            case 5, 6, 7, 8, 9, 10 -> System.out.println("Guten Morgen");
            case 18, 19, 20, 21 -> System.out.println("Guten Abend");
            default -> System.out.println("Guten Tag");
        }
    }
}
