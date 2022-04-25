package Week2.day4;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.TreeMap;

public class Question1 {
    public static long randomNum(long min, long max) {
        return (long) (Math.random() * (max - min) + min);
    }
    static HashMap<Long , Long> rawData = new HashMap<>();
    static HashMap<String , Long> finalData = new HashMap<>();

    public static void main(String[] args) {
        //First day of last month
        Calendar calender = Calendar.getInstance();

        calender.add(Calendar.MONTH, -1);
        calender.set(Calendar.DATE, 1);
        calender.set(Calendar.HOUR, 0);
        calender.set(Calendar.MINUTE, 0);
        calender.set(Calendar.SECOND, 0);
        calender.set(Calendar.MILLISECOND, 0);

        Date lastMonth1Date = calender.getTime();
        long epochTime1Date = lastMonth1Date.getTime();


        Calendar secondCal = Calendar.getInstance();

        secondCal.add(Calendar.MONTH, -1);
        secondCal.set(Calendar.DATE, secondCal.getActualMaximum(Calendar.DATE));
        secondCal.set(Calendar.HOUR, 23);
        secondCal.set(Calendar.MINUTE, 59);
        secondCal.set(Calendar.SECOND, 59);
        secondCal.set(Calendar.MILLISECOND, 999);

        Date lastMonthLastDate = secondCal.getTime();

        long epochTimeLastDate = lastMonthLastDate.getTime();

        for(int i = 0; i< 500; i++){
            rawData.put( randomNum( epochTime1Date , epochTimeLastDate ) , randomNum( 10, 20 ) );
        }

        for( int d = 1; d <= secondCal.getActualMaximum(Calendar.DATE) ; d++ ){
            String key =  d+ "/" + secondCal.get(Calendar.MONTH) + "/" + secondCal.get(Calendar.YEAR);
            finalData.put( key, 0L );
        }


        for( Long ll : rawData.keySet() ){
//            System.out.println( ll );
            Calendar cal = Calendar.getInstance();
            cal.setTime( new Date(ll));
            String key =  cal.get(Calendar.DATE) + "/" + (cal.get(Calendar.MONTH)+1) + "/" + cal.get(Calendar.YEAR);

//            System.out.println(key);
            if(finalData.get(key) != null){
                finalData.put( key , finalData.get(key) + rawData.get(ll) );
            }

        }
        for( String ss : finalData.keySet()){
            System.out.println( ss+ " : " + finalData.get(ss) );
        }

        TreeMap<String, Long> treeMap = new TreeMap<>();

        for( String ss : finalData.keySet()){
            System.out.println( ss+ " : " + finalData.get(ss) );
            Calendar calendar = Calendar.getInstance();
            String[] split = ss.split("/");
            calendar.set(Calendar.MONTH , Integer.parseInt(split[1])-1);
            calendar.set(Calendar.YEAR , Integer.parseInt(split[2]));
            calendar.set(Calendar.DATE , Integer.parseInt(split[0]));
            treeMap.put(calendar.getTime().getTime()+"-"+ss , finalData.get(ss));
        }

        // Sorted
        for( String string : treeMap.keySet() ){
            String[] split = string.split("-");
            System.out.println( split[1] + " = "  + treeMap.get(string));
        }

    }
}
