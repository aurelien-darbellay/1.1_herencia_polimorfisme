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

    private static News createNews() {
        System.out.println("What is the title of the news you want to create");
        String title = scanner.nextLine();
        System.out.println("""
                What is the subject of the news you want to create?
                Soccer [S]
                Tennis [T]
                Basket [B]
                F1 [F]
                Moto [M]
                """);
        String topic = scanner.nextLine();
        return switch (topic) {
            case "S" -> News.createSoccerNews(title);
            case "T" -> News.createTennisNews(title);
            case "B" -> News.createBasketNews(title);
            case "F" -> News.createF1News(title);
            case "M" -> News.createMotoNews(title);
            default -> {
                System.out.println("Topic not found. We are creating a news about soccer by default");
                yield News.createSoccerNews(title);
            }
        };
    }

    private static Redactor getRedactorByDni(String dni) {
        Optional<Redactor> redactorOptional = redactors.stream().filter(item -> item.getDni().equals(dni)).findFirst();
        if (redactorOptional.isEmpty()) {
            throw new Error("Redactor not found");
        }
        return redactorOptional.get();
    }

    public static void assignNews() {
        System.out.println("What is the DNI of the redactor you want to work on this new piece of news?");
        String dni = scanner.nextLine();
        try {
            Redactor redactor = getRedactorByDni(dni);
            News pNews = createNews();
            redactor.addNews(pNews);
        } catch (Error e) {
            System.out.println(e.getMessage());
        }
    }

    public static void eliminateNews() {
        System.out.println("What is the title of the news you want to delete");
        String title = scanner.nextLine();
        boolean found = false;
        for (Redactor redactor : redactors) {
            ArrayList<News> news = redactor.getNews();
            boolean result = news.removeIf(pNews -> pNews.getTitle().equals(title));
            if (result) {
                found = true;
            }
        }
        if (!found) {
            System.out.println("News not found");
        }
    }

    public static void showNews() {
        System.out.println("What is the redactor whose workload you want to inspect? Give me their DNI.");
        String dni = scanner.nextLine();
        try {
            Redactor redactor = getRedactorByDni(dni);
            ArrayList<News> news = redactor.getNews();
            System.out.println(redactor.getName() + " is currently working on the following news:");
            for (News pNews : news) {
                System.out.println(pNews.getTitle());
            }
        } catch (Error e) {
            System.out.println(e.getMessage());
        }

    }

    private static News getNewsByTitle(String title) {
        for (Redactor redactor : redactors) {
            ArrayList<News> news = redactor.getNews();
            for (News aNews : news) {
                if (aNews.getTitle().equals(title)) {
                    return aNews;
                }
            }
        }
        throw new Error("News not found");
    }

    public static void getNewsPoints() {
        System.out.println("What is the title of the news you want to inspect");
        String title = scanner.nextLine();
        try {
            News pNews = getNewsByTitle(title);
            System.out.println(pNews.getPoints());
        } catch (Error e) {
            System.out.println(e.getMessage());
        }
    }

    public static void getNewsValue() {
        System.out.println("What is the title of the news you want to inspect");
        String title = scanner.nextLine();
        try {
            News pNews = getNewsByTitle(title);
            System.out.println(pNews.getValue());
        } catch (Error e) {
            System.out.println(e.getMessage());
        }
    }

    public static ArrayList<Redactor> getRedactors() {
        return redactors;
    }
}
