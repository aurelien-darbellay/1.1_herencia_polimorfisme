package newsroom;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;

abstract public class NewsRoom {
    static ArrayList<Redactor> redactors = new ArrayList<>();
    static final Scanner scanner = new Scanner(System.in);

    public static void createRedactor() {
        System.out.println("What is the name of the new redactor?");
        String name = scanner.nextLine();
        System.out.println("What is the DNI of the new redactor?");
        String dni = scanner.nextLine();
        Redactor newRedactor = new Redactor(dni, name);
        System.out.println("Great! We've hired " + name + "!");
        redactors.add(newRedactor);
    }

    public static void eliminateRedactor() {
        System.out.println("What is the DNI of the redactor you want to fire?");
        String dni = scanner.nextLine();
        boolean result = redactors.removeIf(redactor -> redactor.getDni().equals(dni));
        System.out.println(result ? "Redactor fired" : "redactor not found");

    }

    public static void showStaff() {
        for (Redactor redactor : redactors) {
            System.out.println(redactor.getName() + " " + redactor.getDni());
        }
    }

    public static void createNews() {
        System.out.println("What is the DNI of the redactor you want to work on this new piece of news?");
        String dni = scanner.nextLine();
        Optional<Redactor> redactor = redactors.stream().filter(item -> item.getDni().equals(dni)).findFirst();


    }

    public static void eliminateNews() {

    }

    public static void showNews() {

    }

    public static void updateNews() {

    }

    public static void getNewsPrice() {

    }

    public static void getNewsValue() {

    }

    public static ArrayList<Redactor> getRedactors() {
        return redactors;
    }
}
