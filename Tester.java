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

public class Tester{
    public static void main (String[] args){

        //Team array declaration and objects
        Team[] teams = new Team[6];
        teams [0] = new Team ("Township Rollers", "Jamali Stadium", 1961, "Gaborone", "jwaneng Galaxy");
        teams [1] = new Team ("Gaborone United", "National Stadium", 1967, "Gaborone", "BDF XI");
        teams [2] = new Team("Masitaoka FC", "Molepolole Sports Complex", 1968, "Molepolole", "Township Rollers");
        teams [3] = new Team("BDF XI", "SSKB Stadium", 1996, "Mogoditshane", "Gaborone United");
        teams [4] = new Team("Jwaneng Galaxy", "Galaxy Stadium", 2014, "Jwaneng", "Township Rollers");


        //Table array declaration and objects
        Table[] table1 = new Table[5];
        table1 [0] = new Table ("Township Rollers", 10, 8, 2, 0, 26);
        table1 [1] = new Table ("Gaborone United", 10, 6, 2, 2, 20);
        table1 [2] = new Table ("Masitaoka FC", 10, 5, 3, 2, 18);
        table1 [3] = new Table ("BDF XI", 10, 4, 4, 2, 16);
        table1 [4] = new Table ("Jwaneng Galaxy", 10, 3, 5, 2, 14);

        


        
    }
}