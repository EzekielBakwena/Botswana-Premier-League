/**************************************************************************
 *Program name: Tester.java
 * @author: Gugu Ketshabe           ID: 202407232 
 * @author: Lone Mosime             ID: 202401044
 * @author: Devin Phokoletso        ID: 202402388
 * @author: Lekgotla Maphorisa      ID: 202400965
 * @author: Ezekiel Bakwena         ID: 202406103
 * @version:1.00
 * Description: A main class thats used to test our classes 
 * How to compile: javac Tester.java
 * How to run: java  Tester
 ********************************************************************************/
//Tester.java

public class Tester {
    public static void main(String[] args) {

        // Team array declaration and objects
        Team[] teams = new Team[5];
        teams[0] = new Team("Township Rollers", "Jamali Stadium", 1961, "Gaborone", "Jwaneng Galaxy");
        teams[1] = new Team("Gaborone United", "National Stadium", 1967, "Gaborone", "BDF XI");
        teams[2] = new Team("Masitaoka FC", "Molepolole Sports Complex", 1968, "Molepolole", "Township Rollers");
        teams[3] = new Team("BDF XI", "SSKB Stadium", 1996, "Mogoditshane", "Gaborone United");
        teams[4] = new Team("Jwaneng Galaxy", "Galaxy Stadium", 2014, "Jwaneng", "Township Rollers");

        // Table array declaration and objects
        Table[] table1 = new Table[5];
        table1[0] = new Table("Masitaoka FC", 10, 5, 3, 2, 18);
        table1[1] = new Table("BDF XI", 10, 4, 4, 2, 16);
        table1[2] = new Table("Township Rollers", 10, 8, 2, 0, 26);
        table1[3] = new Table("Jwaneng Galaxy", 10, 3, 5, 2, 14);
        table1[4] = new Table("Gaborone United", 10, 6, 2, 2, 20);


        // Printing table details before sort
        System.out.println("\n**Table details before insertion sort:**");
        for (Table t : table1) {
            System.out.println("Club Name: " + t.getClubName() + ", Points: " + t.getPointsAttained());
        }

        // Sort insertion
        SortSearchUtil.sortByPointsAttained(table1);

        // Printing table details after sort
        System.out.println("\n**Table details after insertion sort:**");
        for (Table t : table1) {
            System.out.println("Club Name: " + t.getClubName() + ", Points: " + t.getPointsAttained());
        }


        //Binary search to search for the team with the most points attained
        int pointsToSearch = 14;
        int index = SortSearchUtil.binarySearchByPoints(table1, pointsToSearch);
        if (index != -1) {
            System.out.println("\nTeam with " + pointsToSearch + " points attained: " + table1[index].getClubName());
        } else {
            System.out.println("\nTeam with " + pointsToSearch + " points attained not found.");
        }

        //Selection sort to sort on stadium name in ascending order
        SortSearchUtil.selectionSort(teams);

        //for loop to print the sorted teams by stadium name
        System.out.println("\n**Teams sorted by selection sort (stadium name):**");
        for (Team team : teams) {
            System.out.println("Club Name: " + team.getClubName() + ", Stadium Name: " + team.getStadiumName());
        }

        //Linear search to search for the team with the stadium name "Jamali Stadium"
        String stadiumNameToSearch = "Jamali Stadium";
        String clubName = SortSearchUtil.searchStadiumName(teams, stadiumNameToSearch);
        if (!clubName.equals("-1")) {
            System.out.println("\n linear Search demo");
            System.out.println("\nClub with stadium name " + stadiumNameToSearch + ": " + clubName);
        } else {
            System.out.println("\nClub with stadium name " + stadiumNameToSearch + " not found.");
        }

        // validate the year field for each team using InvalidYearException.
        System.err.println("\nValidating year founded for each team using InvalidYearException:");
        for (Team team : teams) {
            try {
                InvalidYearException.validateYear(team.getYearFounded(), team.getClubName());
                System.out.println("\nTeam " + team.getClubName() + " Year founded is: " + team.getYearFounded());
            } catch (InvalidYearException e) {
                System.out.println("Invalid input found at: " + e.getMessage());
            }
        }
    }
}