/**************************************************************************
 *Program name: Team.java
 * @author: Gugu Ketshabe           ID: 202407232 
 * @author: Lone Mosime             ID: 202401044
 * @author: Devin Phokoletso        ID: 202402388
 * @author: Lekgotla Maphorisa      ID: 202400965
 * @author: Ezekiel Bakwena         ID: 202406103
 * @version:1.00
 * Description: A sub class which contains the attributes of a team and its table.
 * How to Compile: javac Team.java
 * How to run: java  Team
 ********************************************************************************/
//Team.java

public class Team extends ClubEntity {
    //Attributes of the team class
    private String stadiumName;
    private int yearFounded;
    private String homeTown;
    private String rivalTeam;

        // Constructor for the Team class
        public Team(String clubName, String stadiumName, int yearFounded, String homeTown, String rivalTeam) {
            super(clubName);  // Calls the constructor of the parent class.
            this.stadiumName = stadiumName;
            this.yearFounded = yearFounded;
            this.homeTown = homeTown;
            this.rivalTeam = rivalTeam;
        }
            //Getters and Setters for the Team class
                public String getStadiumName() {
                    return stadiumName;
                }
                public void setStadiumName(String stadiumName) {
                    this.stadiumName = stadiumName;
                }
                  public int getYearFounded() {
                    return yearFounded;
                     }

                public void setYearFounded(int yearFounded) {
                    this.yearFounded = yearFounded;
                }

                public String getHomeTown() {
                    return homeTown;
                }
                
                public void setHomeTown(String homeTown) {
                    this.homeTown = homeTown;
                }

                public String getRivalTeam() {
                    return rivalTeam;
                }

                public void setRivalTeam(String rivalTeam) {
                    this.rivalTeam = rivalTeam;
                }
public void insertionSort(teams[] arr){

    for(int i = 1; i < teams.size(); i++){

        Team keyTeam = teams.get(i);
        int key = keyTeam.getTable().getPointsAttained();
        int j = i - 1;

        while (j >= 0 && teams.get(j).getTable().getPointsAttained() < key){

            teams.set(j + 1, teams.get(j));
            j--;
        }
        teams.set(j + 1, keyTeam); 
    }
}
   }   


                
