package Week2.day6;

import java.util.ArrayList;
import java.util.HashMap;

public class Assessment {
    public static void main(String[] args) {
        ArrayList<Character> charList = new ArrayList<>();
        for (char letter = 'a'; letter <= 'z'; letter++){
            charList.add(letter);
        }
        HashMap<Character, Integer> result = new HashMap<>();

        for (int i = 0; i < charList.size() - 1; i++){
            for (int j = i + 1; j < charList.size(); j++){
                char key = (char) (charList.get(i) & charList.get(j)); //
                if (result.containsKey(key)){
                    result.put(key, result.get(key)+1);
                }
                else{
                    result.put(key, 1);
                }
            }
        }
        for (Character c : result.keySet()){
            System.out.println(c + "->" + result.get(c));
        }

    }
}
