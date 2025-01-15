package newsroom;

public class MotoNews extends News {
    private String team;

    public MotoNews(String title, String team) {
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
        int points = 3;
        if (this.team.toLowerCase().contains("honda") || this.team.toLowerCase().contains("yamaha")) {
            points += 3;
        }
        return points;
    }

    @Override
    double calculateValue() {
        double value = 100;
        if (this.team.toLowerCase().contains("honda") || this.team.toLowerCase().contains("yamaha")) {
            value += 50;
        }
        return value;
    }
}
