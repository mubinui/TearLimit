package Array.Easy;

import java.util.*;


public class NonConstructibleChange {
    public static void main(String[] args) {
        int coins [] = {5, 7, 1, 1, 2, 3, 22}; // cannot construct 4
        int coins1 [] = {1,2,5};
        System.out.println(Arrays.toString(coins1));
        System.out.println(nonConstructibleChange(coins1));

    }
    public static int nonConstructibleChange(int[] coins) {
        // Write your code here.

        Arrays.sort(coins);
        HashSet<Integer> memory = new HashSet<>();
        for(int i : coins) memory.add(i);
        int change = 1;

        for (int i = 0; i<coins.length; i++) {
            int temp = coins[i];
            if(change<coins[i] ){
                if  (change<temp && ! memory.contains(temp-1)){

                    return change;
                }



            }
            change += coins[i];

        }




        return change;
    }
}
