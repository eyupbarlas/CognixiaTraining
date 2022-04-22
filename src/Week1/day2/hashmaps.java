package Week1.day2;

import java.util.*;

public class hashmaps {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();

        hashMap.put("Love", "Ass");
        hashMap.put("your", "mouth");
        hashMap.put("personality", "vag");

        System.out.println(hashMap.get("Love"));

        Set keys = hashMap.keySet();

        Iterator<String> hmapIterator = keys.iterator();

        while (hmapIterator.hasNext()){
            System.out.println("key:"+hmapIterator.next()+"| value:"+hashMap.get(hmapIterator.next()));
        }

        for (Map.Entry<String, String> entry : hashMap.entrySet()){
            String key = entry.getKey();
            Object value = entry.getValue();
            System.out.println("key: "+key+"| value:"+value);
        }

        Set<String> mySet = new HashSet<>();
        mySet.add("wtf are we doin");

    }
}
