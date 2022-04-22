package Week1.day2;

import java.util.ArrayList;
import java.util.Iterator;

public class arraylists {
    public int counter = 0;

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("My");
        list.add("Is");
        list.add("Slim Shady");

        // Different kinds of arraylist iterations
        // For loop
        for (int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
        // Using iterator
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        // For each loop
        for (String q: list){
            System.out.println(q);
        }

    }
}
