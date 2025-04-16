//Table.java

public class Table {
    private int matchesPlayed;
    private int won;
    private int drawn;
    private int lost;
    private int points;

    // Constructor for the Table class
    public Table(int matchesPlayed, int won, int drawn, int lost, int points) {
        this.matchesPlayed = matchesPlayed;
        this.won = won;
        this.drawn = drawn;
        this.lost = lost;
        this.points = points;
    }

        //Basic  Getters and Setters
        public int getMatchesPlayed() {
            return matchesPlayed;
        }
        public void setMatchesPlayed(int matchesPlayed) {
            this.matchesPlayed = matchesPlayed;
        }
        public int getWon() {
            return won;
        }
        public void setWon(int won) {
            this.won = won;
        }
        public int getDrawn() {
            return drawn;
        }
        public void setDrawn(int drawn) {
            this.drawn = drawn;
        }
        public int getLost() {
            return lost;
        }
        public void setLost(int lost) {
            this.lost = lost;
        }
        public int getPoints() {
            return points;
        }
        public void setPoints(int points) {
            this.points = points;
        }


}
