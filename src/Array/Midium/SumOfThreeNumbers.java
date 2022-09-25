package Array.Midium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumOfThreeNumbers {
    public static void main(String[] args) {

    }
    public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
        ArrayList<Integer [] > output = new ArrayList<>();
        Arrays.sort(array);
        for (int i = 0; i < array.length ; i++) {
            int pivot = array[i];
            int left = i+1, right = array.length-1;
            while (left<right){
                int result = targetSum -(pivot+array[left]+ array[right]);
                if (result==0){
                    Integer memory [] = {pivot,array[left],array[right]};
                    output.add(memory);
                    left++; right--;
                }
                else if (result>0) left++;
                else right--;

            }

        }
        return output;
    }
}
