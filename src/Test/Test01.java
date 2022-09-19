package Test;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Test01 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list = List.of(1,2,3,4,5,6,7);

        ListIterator<Integer> iterator = list.listIterator();
        int counter = 0;

        for (int i = 0; i <7 ; i++) {

            if (iterator.hasNext()){
                int x = iterator.next();




            }


        }
        System.out.println(counter);

}

}
