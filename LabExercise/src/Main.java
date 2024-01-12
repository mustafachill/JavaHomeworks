import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        ArrayList<String> roster = new ArrayList<String>();

        roster.add("Emine");
        roster.add("Ahmet");
        roster.add("Ayşe");
        roster.add("Hikmet");
        roster.add("Aliye");
        roster.add("Zuleyha");

        System.out.println(roster);
        ArrayList<String> rosterWithoutA = new ArrayList<String>();
        // assume that the list can be different than this
        // Remove all the names that is starting with "A" and leave the rest for the roster arraylist and then print it to the screen
        char firstLetter = 'a';
        for(int i = 0; i<roster.size(); i++){
            firstLetter = roster.get(i).charAt(0);
            if(firstLetter != 'a' && firstLetter != 'A'){
               rosterWithoutA.add(roster.get(i));
            }
        }
        System.out.println(rosterWithoutA);
    }
}