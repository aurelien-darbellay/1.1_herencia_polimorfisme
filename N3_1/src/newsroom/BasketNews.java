package newsroom;

public class BasketNews extends News {
    private String competition;
    private String club;

    public BasketNews(String title, String competition, String club) {
        super(title);
        this.competition = competition;
        this.club = club;
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

    @Override
    int calculatePoints() {
        int points = 4;
        if (this.competition.toLowerCase().contains("euro league")) {
            points += 3;
        }
        if (this.competition.toLowerCase().contains("acb")) {
            points += 2;
        }
        if (this.club.toLowerCase().contains("barça") || this.club.toLowerCase().contains("madrid")) {
            points += 1;
        }
        return points;
    }

    @Override
    double calculateValue() {
        double value = 250;
        if (this.competition.toLowerCase().contains("euro league")) {
            value += 75;
        }
        if (this.club.toLowerCase().contains("barça") || this.club.toLowerCase().contains("madrid")) {
            value += 75;
        }
        return value;
    }
}
