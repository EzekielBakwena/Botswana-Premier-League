/**************************************************************************
 *Program name: SortSearchUtil.java
 * @author: Gugu Ketshabe           ID: 202407232 
 * @author: Lone Mosime             ID: 202401044
 * @author: Devin Phokoletso        ID: 202402388
 * @author: Lekgotla Maphorisa      ID: 202400965
 * @author: Ezekiel Bakwena         ID: 202406103
 * @version:1.00
 * Description: A program containing insertion sort,  selection sort, linear search, and binary search algorithms.
 * How to compile: javac SortSearchUtil.java
 * How to run: java  SortSearchUtil
 ********************************************************************************/

 public class SortSearchUtil{

    //Selection sort to sort on StadiumName in ascending order
    public static void selectionSort(List<Team> teams) {
        int n = teams.size();
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            
            for (int j = i + 1; j < n; j++) {
                if (teams.get(j).getStadiumName().compareTo(teams.get(minIndex).getStadiumName()) < 0) {
                    minIndex = j;  
                }
            }
            
            Team temp = teams.get(minIndex);
            teams.set(minIndex, teams.get(i));
            teams.set(i, temp);
        }
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


            //linear search to find stadium name
            public static String searchStadiumName(Team[] teams, String stadiumName) {
                for (int i = 0; i < teams.length; i++) {
                    if (teams[i].getStadiumName().equalsIgnoreCase(stadiumName)) {
                        return teams[i].getClubName();
                    }
                }
                return "-1";
            }

            //Iterative Binary search to find the index of a club with the most points attained
            public static int binarySearchByPoints(Table[] table1, int pointsAttained){
                //left and right pointers
                int left = 0;
                int right = table1.length - 1;

                while(left<=right){
                    //initially find the middle index
                    int mid = (left+right)/2;
                    int midNumber = table1[mid].getPointsAttained();

                    //if the middle number is equals to points attained, return the index
                    if(pointsAttained == midNumber){
                        return mid;
                    }
                    else if(pointsAttained < midNumber){
                        right = mid -1;
                    }
                    else{
                        left = mid + 1;
                    }
                }
                    return -1; //if the club is not found, return -1   
   
        }
 }