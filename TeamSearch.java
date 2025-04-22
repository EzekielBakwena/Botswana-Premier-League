/**************************************************************************
 *Program name: TeamSearch.java
 * @author: Gugu Ketshabe           ID: 202407232 
 * @author: Lone Mosime             ID: 202401044
 * @author: Devin Phokoletso        ID: 202402388
 * @author: Lekgotla Maphorisa      ID: 202400965
 * @author: Ezekiel Bakwena         ID: 202406103
 * @version:1.00
 * Description: A linear search to find the oldest team
 * How to compile: javac TeamSearch.java
 * How to run: java  TeamSearch
 ********************************************************************************/


public class TeamSearch {
    // Linear search to find the oldest team
    public static Team findoldestteam (Team[] teams){
        if (teams == null || team.length == 0) {
            return null;
        }
    }

    Team oldestTeam = teams[0];

    for (int i = 1; i < teams.length; i++) {
        if (teams[i]. getYearFounded() < oldestTeam.getYearFounded()) {
            oldestTeam = teams[i]
        }
        return oldestTeam; 
    }
    
}
