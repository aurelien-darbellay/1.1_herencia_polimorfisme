package newsroom;

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
}
