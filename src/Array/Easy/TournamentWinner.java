package Array.Easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.ListIterator;

public class TournamentWinner {
    public static void main(String[] args) {

    }

    public String tournamentWinner(ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
        // Write your code here.
        HashMap<String,Integer> memory = new HashMap<>();
        int index = 0;
        for(ArrayList<String>tournament:competitions){
            ListIterator<String> teams = tournament.listIterator();
            String team1 = teams.next();
            String team2 = teams.next();
            int r = results.get(index);
            if (r==0){
                if(memory.containsKey(team2)){
                    int temp = memory.get(team2);
                    memory.replace(team2,temp,temp+3);
                }
                else{
                    memory.put(team2,3);
                }
            }
            else {
                if(memory.containsKey(team1)){
                    int temp = memory.get(team1);
                    memory.replace(team1,temp,temp+3);
                }
                else{
                    memory.put(team1,3);
                }

            }
            index++;

        }
        int max = 0;
        String nameofmax = "";
        for(ArrayList<String>tournament:competitions){
            ListIterator<String> teams = tournament.listIterator();
            String team1 = teams.next();
            String team2 = teams.next();
            if(memory.containsKey(team1)){
                int temp = memory.get(team1);
                if (temp>max){
                    max = temp;
                    nameofmax = team1;

                }
            }
            if (memory.containsKey(team2)){
                int temp = memory.get(team2);
                if (temp>max){
                    max = temp;
                    nameofmax = team2;

                }

            }

        }



        return nameofmax;
    }


}
