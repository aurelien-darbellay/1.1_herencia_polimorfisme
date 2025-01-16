package newsroom;

import java.util.Scanner;

public abstract class News {
    private String title;
    private String text;
    private int points;
    private double value;

    public News(String title) {
        this.title = title;
        this.text = "";
    }
    abstract int calculatePoints();

    abstract double calculateValue();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    void updatePointsAndValue() {
        this.setPoints(this.calculatePoints());
        this.setValue(this.calculateValue());
    }
    static SoccerNews createSoccerNews(String title){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What competition is the news about?");
        String competition = scanner.nextLine();
        System.out.println("What club is the news about?");
        String club = scanner.nextLine();
        System.out.println("What player is the news about?");
        String player = scanner.nextLine();
        return new SoccerNews(title,competition,club,player);
    }
    static TennisNews createTennisNews(String title){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What competition is the news about?");
        String competition = scanner.nextLine();
        System.out.println("What is the first player the news is about?");
        String player1 = scanner.nextLine();
        System.out.println("What is the second player the news is about?");
        String player2 = scanner.nextLine();
        String[] players = {player1, player2};
        return new TennisNews(title,competition,players);
    }
    static BasketNews createBasketNews(String title){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What competition is the news about?");
        String competition = scanner.nextLine();
        System.out.println("What club is the news about?");
        String club = scanner.nextLine();
        return new BasketNews(title,competition,club);
    }
    static MotoNews createMotoNews(String title){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What team is the news about?");
        String team = scanner.nextLine();
        return new MotoNews(title,team);
    }
    static F1News createF1News(String title){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What team is the news about?");
        String team = scanner.nextLine();
        return new F1News(title,team);
    }

}
