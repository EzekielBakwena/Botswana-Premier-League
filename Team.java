//Team.java

public class Team {
    private String teamName;
    private String Stadium;
    private int founded;
    private String homeTown;
    private String rivals;
    private Table table; // Table being the other class in our package

        // Constructor for the Team class
        public Team(String teamName, String Stadium, int founded, String homeTown, String rivals) {
            this.teamName = teamName;
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


                