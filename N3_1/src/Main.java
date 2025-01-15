import newsroom.NewsRoom;
import newsroom.Redactor;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String choice = "";
        while (!choice.equals("X")) {
            final Scanner scanner = new Scanner(System.in);
            ArrayList<Redactor> redactors = NewsRoom.getRedactors();
            final String menu = """
                    What do you want to do?
                    Introduce a new redactor: [NR]
                    Eliminate a redactor: [ER]
                    Show staff:[SS]
                    Introduce a piece of news into a redactor workload: [NN]
                    Eliminate a piece of news: [EN]
                    Show what news a redactor is working on: [SR]
                    Update news: [UN]
                    Calculate points of a piece of news: [PN]
                    Calculate value of a piece of : [VN]
                    Exit: [X]
                    """;
            System.out.print(menu);
            choice = scanner.nextLine();
            switch (choice) {
                case "NR":
                    NewsRoom.createRedactor();
                    break;
                case "ER":
                    NewsRoom.eliminateRedactor();
                    break;
                case "SS":
                    NewsRoom.showStaff();
                    break;
                case "NN":
                    break;
                case "EN":
                    break;
                case "SR":
                    break;
                case "UN":
                    break;
                case "PN":
                    break;
                case "VN":
                    break;
                case "X":
                    break;

                default:
            }

        }
        System.out.println("Process terminated -- memory erased");

    }
}