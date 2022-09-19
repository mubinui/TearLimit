package Array.Easy;


public class SortedSquaredArray {
    public static void main(String[] args) {
        int a [] = {-4,-3,-2,-1,0,1,2,3,4};
        int a1 [] = {-4,-3,-2,1,2,3,4};
        int out [] = sortedSquaredArray(a);
        for(int i :out) System.out.print (i+"->");

    }
    public static int[] sortedSquaredArray(int[] array) {
        // Write your code here.
        int output [] = new int[array.length];
        int front = 0;
        int rear = array.length-1;



        for (int i = 0; i <array.length ; i++) {
            if(Math.abs(array[front])>=Math.abs(array[rear])){
                output[(array.length-1)-i] = (int)Math.pow(array[front],2);
                front++;

            }
            else {
                output[(array.length-1)-i] = (int)Math.pow(array[rear],2);
                rear--;

            }

        }
        return output;
    }
}
