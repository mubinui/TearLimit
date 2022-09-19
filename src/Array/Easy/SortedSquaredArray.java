package Array.Easy;

public class SortedSquaredArray {
    public static void main(String[] args) {
        int a [] = {1,2,3,4};
        int out [] = sortedSquaredArray(a);
        for(int i :out) System.out.print (i+"->");

    }
    public static int[] sortedSquaredArray(int[] array) {
        // Write your code here.
        for (int i = 0; i <array.length ; i++) {
            array[i] = (int)Math.pow(array[i],2);

        }
        return array;
    }
}
