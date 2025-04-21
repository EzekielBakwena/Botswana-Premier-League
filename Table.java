/**************************************************************************
 *Program name: Table.java
 * @author: Gugu Ketshabe           ID: 202407232 
 * @author: Lone Mosime             ID: 202401044
 * @author: Devin Phokoletso        ID: 202402388
 * @author: Lekgotla Maphorisa      ID: 202400965
 * @author: Ezekiel Bakwena         ID: 202406103
 * @version:1.00
 * Description: A sub class which contains the statistical attributes of the Table class.
 * How to Compile: javac Table.java
 * How to run: java  Table
 ********************************************************************************/
//Table.java

public class Table extends ClubEntity {
    private int matchesPlayed;
    private int won;
    private int drawn;
    private int lost;
    private int points;

    // Constructor for the Table class
    public Table(String clubName, int matchesPlayed, int won, int drawn, int lost, int points) {
        super(clubName);  //Calls the constructor of the parent class (Club Entity)
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
