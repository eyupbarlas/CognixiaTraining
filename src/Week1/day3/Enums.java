package Week1.day3;

import java.time.YearMonth;

public class Enums {
    enum DAYS{MON, TUE, WED, THU, FRI, SAT, SUN}

    public static void main(String[] args) {
        /*
        for (DAYS day: DAYS.values()) {
            System.out.println(day);
        }

        String[] names = {"a", "b", "c", "d"};
        for (String str: names) {
            System.out.println(str);
        }*/

        // how many days remaining in the month
        int monthLength = YearMonth.of(2022, 4).lengthOfMonth();
        int currentDay = 22;
        System.out.println(monthLength-currentDay);


    }
}
