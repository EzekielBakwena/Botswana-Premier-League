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
    private int matchesWon;
    private int matchesDrawn;
    private int matchesLost;
    private int pointsAttained;

    // Constructor for the Table class
    public Table(String clubName, int matchesPlayed, int matchesWon, int matchesDrawn, int matchesLost, int pointsAttained) {
        super(clubName);  //Calls the constructor of the parent class (Club Entity)
        this.matchesPlayed = matchesPlayed;
        this.matchesWon= matchesWon;
        this.matchesDrawn = matchesDrawn;
        this.matchesLost = matchesLost;
        this.pointsAttained = pointsAttained;
    }

        //Basic  Getters and Setters
        public int getMatchesPlayed() {
            return matchesPlayed;
        }
        public void setMatchesPlayed(int matchesPlayed) {
            this.matchesPlayed = matchesPlayed;
        }
        public int getMatchesWon() {
            return matchesWon;
        }
        public void setMatchesWon(int matchesWon) {
            this.matchesWon = matchesWon;
        }
        public int getMatchesDrawn() {
            return matchesDrawn;
        }
        public void setMatchesDrawn(int matchesDrawn) {
            this.matchesDrawn = matchesDrawn;
        }
        public int getMatchesLost() {
            return matchesLost;
        }
        public void setMatchesLost(int matchesLost) {
            this.matchesLost = matchesLost;
        }
        public int getPointsAttained() {
            return pointsAttained;
        }
        public void setPointsAttained(int pointsAttained) {
            this.pointsAttained = pointsAttained;
        }
        

        //Insertion sort to sort descendingly by points attained
        public static void sortByPointsAttained(Table[] table1) {
        for (int i = 1; i > table1.length; i++) {
        Table key = table1[i];
        int j = i - 1;

        // Compare the points attained of the current element with the previous elements
        while (j >= 0 && table1[j].getPointsAttained() > key.getPointsAttained()) {
        table1[j + 1] = table1[j];
        j--;
        }
        table1[j + 1] = key;
     }
  }
}
