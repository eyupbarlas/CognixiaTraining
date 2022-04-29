package Week2.day5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Question1 {
    public static void main(String[] args) {
        /*List<String> testList = Arrays.asList("Za", "ab", "AB", "Sa", "1ab", "Ab", "!Ab");

        Stream<String> stream = testList.stream()
                .sorted(String.CASE_INSENSITIVE_ORDER
                        .thenComparing(Comparator.naturalOrder()));

        stream.forEach(s -> System.out.print(s + "  "));*/

        char[] arr = new char[]{'a','c','d'};

        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];
            int ascii = (int) c;
            System.out.print((char)ascii+":");
            System.out.println(ascii);
        }


    }
}
