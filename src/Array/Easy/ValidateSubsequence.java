package Array.Easy;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;


public class ValidateSubsequence {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list = List.of(5, 1, 22, 25, 6, -1, 8, 10);
        List<Integer> sequence = new ArrayList<>();
        sequence = List.of(1, 6, -1, 10);
        System.out.println(isValidSubsequence(list,sequence));

    }

    public static boolean isValidSubsequence(List<Integer>array, List<Integer> sequence){
        ListIterator <Integer> sequence_iterator = sequence.listIterator();
        int counter = 0;
        boolean flag = false;
        if (array.size()>=sequence.size()){

            for (Integer i:array) {
                if(sequence_iterator.hasNext()){
                    int x = sequence_iterator.next();
                    System.out.println(x+"->Sequence");
                    System.out.println(i+"-> List");
                    if (x==i){
                        counter++;
                        System.out.println(counter);
                        if(counter==sequence.size()){
                            flag = true;
                            break;

                        }
                    }
                    else sequence_iterator.previous();


                }

            }
        }


        return flag;

    }
}
