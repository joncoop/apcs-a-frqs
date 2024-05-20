public class Scoreboard {

    String[] teams;
    int[] scores;
    int active;

    public Scoreboard(String team1, String team2) {
        this.teams = new String[] {team1, team2};
        this.scores = new int[] {0, 0};
        this.active = 0;
    }

    public void recordPlay(int points) {
        if (points > 0) {
            scores[active] += points;
        }
        else {
            active = (active + 1) % teams.length();
        }
    }

    public String getScore() {
        return scores[0] + "-" + scores[1] + "-" + teams[active];
    }

}