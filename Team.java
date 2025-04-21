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
    private String Stadium;
    private int founded;
    private String homeTown;
    private String rivals;
    private Table table; // Table being the other class in our package

        // Constructor for the Team class
        public Team(String clubName, String Stadium, int founded, String homeTown, String rivals) {
            super(clubName);  // Calls the constructor of the parent class.
            this.Stadium = Stadium;
            this.founded = founded;
            this.homeTown = homeTown;
            this.rivals = rivals;
            this.table = table;
        }
            //Getters and Setters for the Team class
            public String getTeamName() {
                return teamName;
            }
              public void setTeamName(String teamName){
                this.teamName = teamName;
              }

                public String getStadium() {
                    return Stadium;
                }
                public void setStadium(String Stadium) {
                    this.Stadium = Stadium;
                }
                  public int getFounded() {
                    return founded;
                     }

                public void setFounded(int founded) {
                    this.founded = founded;
                }

                public String getHomeTown() {
                    return homeTown;
                }
                
                public void setHomeTown(String homeTown) {
                    this.homeTown = homeTown;
                }

                public String getRivals() {
                    return rivals;
                }

                public void setRivals(String rivals) {
                    this.rivals = rivals;
                }

                public Table getTable() {
                    return table;
                }
                public void setTable(Table table) {
                    this.table = table;
                }
   }   


                
