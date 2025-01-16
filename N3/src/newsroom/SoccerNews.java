package newsroom;

public class SoccerNews extends News {
    private String competition;
    private String club;
    private String player;

    public SoccerNews(String title, String competition, String club, String player) {
        super(title);
        this.competition = competition;
        this.club = club;
        this.player = player;
        this.updatePointsAndValue();
    }

    public String getCompetition() {
        return competition;
    }

    public void setCompetition(String competition) {
        this.competition = competition;
        this.updatePointsAndValue();
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
        this.updatePointsAndValue();
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
        this.updatePointsAndValue();
    }

    @Override
    int calculatePoints() {
        int points = 5;
        if (this.competition.toLowerCase().contains("champions league")) {
            points += 3;
        }
        if (this.competition.toLowerCase().contains("liga")) {
            points += 2;
        }
        if (this.club.toLowerCase().contains("barça") || this.club.toLowerCase().contains("madrid")) {
            points += 1;
        }
        if (this.player.toLowerCase().contains("benzema") || this.player.toLowerCase().contains("ferran torres")) {
            points += 1;
        }
        return points;
    }

    @Override
    double calculateValue() {
        double value = 300;
        if (this.competition.toLowerCase().contains("champions league")) {
            value += 100;
        }
        if (this.club.toLowerCase().contains("barça") || this.club.toLowerCase().contains("madrid")) {
            value += 100;
        }
        if (this.player.toLowerCase().contains("benzema") || this.player.toLowerCase().contains("ferran torres")) {
            value += 50;
        }
        return value;
    }
}
