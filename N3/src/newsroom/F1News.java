package newsroom;

public class F1News extends News {
    private String team;

    public F1News(String title, String team) {
        super(title);
        this.team = team;
        this.updatePointsAndValue();
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
        this.updatePointsAndValue();
    }

    @Override
    int calculatePoints() {
        int points = 4;
        if (this.team.toLowerCase().contains("ferrari") || this.team.toLowerCase().contains("mercedes")) {
            points += 2;
        }
        return points;
    }

    @Override
    double calculateValue() {
        double value = 100;
        if (this.team.toLowerCase().contains("ferrari") || this.team.toLowerCase().contains("mercedes")) {
            value += 50;
        }
        return value;
    }
}
