package newsroom;

public class TennisNews extends News {
    private String competition;
    private String[] players;

    public TennisNews(String title, String competition, String[] players) {
        super(title);
        this.competition = competition;
        this.players = players;
        this.updatePointsAndValue();
    }

    public String getCompetition() {
        return competition;
    }

    public void setCompetition(String competition) {
        this.competition = competition;
        this.updatePointsAndValue();
    }

    public String[] getPlayers() {
        return players;
    }

    public void setPlayers(String[] players) {
        this.players = players;
        this.updatePointsAndValue();
    }

    @Override
    int calculatePoints() {
        int points = 4;
        for (String player : this.players) {
            if (player.toLowerCase().contains("federer") || player.toLowerCase().contains("nadal") || player.toLowerCase().contains("djokovic")) {
                points += 3;
            }
        }
        return points;
    }

    @Override
    double calculateValue() {
        double value = 150;
        for (String player : this.players) {
            if (player.toLowerCase().contains("federer") || player.toLowerCase().contains("nadal") || player.toLowerCase().contains("djokovic")) {
                value += 100;
            }
        }
        return value;
    }
}
