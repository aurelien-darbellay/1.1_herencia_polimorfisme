package newsroom;

import java.util.ArrayList;

public class Redactor {
    private final String dni;
    private String name;
    private ArrayList<News> news = new ArrayList<>();
    private static int salary;

    static {
        salary = 1500;
    }

    public static int getSalary() {
        return salary;
    }

    public static void setSalary(int salary) {
        Redactor.salary = salary;
    }

    public Redactor(String dni, String name) {
        this.dni = dni;
        this.name = name;
    }

    public String getDni() {
        return dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<News> getNews() {
        return news;
    }

    public void setNews(ArrayList<News> news) {
        this.news = news;
    }

    public void addNews(News newNews) {
        this.news.add(newNews);
    }
}
