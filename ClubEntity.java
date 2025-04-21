/**************************************************************************
 *Program name: ClubEntity.java
 * @author: Gugu Ketshabe           ID: 202407232 
 * @author: Lone Mosime             ID: 202401044
 * @author: Devin Phokoletso        ID: 202402388
 * @author: Lekgotla Maphorisa      ID: 202400965
 * @author: Ezekiel Bakwena         ID: 202406103
 * @version:1.00
 * Description: A simple parent class to Team, Table and Matchday classes to demonstrate inheritance which
 *              contains the club name and year founded.
 * How to Compile: javac ClubEntity.java
 * How to run: java  ClubEntity
 ********************************************************************************/
//Parent class

public class ClubEntity{
    protected String clubName;

    public ClubEntity(String clubName){
        this.clubName = clubName;
    }

        public void displayinfo(){
            System.out.println("Entity name: "+clubName);
        }

        //Getter 
        public String getClubName(){
            return clubName;
        }

        //Setter
        public void setClubName(String clubName){
            this.clubName = clubName;
        }

}