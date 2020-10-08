package sislamoglu.in.the_time_in_words;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    private static Map<Integer, String> timeValueMap = new HashMap<>();

    public static void main(String[] args) {
        loadMap();
        System.out.println(Solution.timeInWords(7, 15).equals("quarter past seven"));
        System.out.println(Solution.timeInWords(3, 0).equals("three o' clock"));
        System.out.println(Solution.timeInWords(5, 47).equals("thirteen minutes to six"));
        System.out.println(Solution.timeInWords(5, 30).equals("half past five"));
    }

    private static void loadMap(){
        timeValueMap.put(1, "one");
        timeValueMap.put(2, "two");
        timeValueMap.put(3, "three");
        timeValueMap.put(4, "four");
        timeValueMap.put(5, "five");
        timeValueMap.put(6, "six");
        timeValueMap.put(7, "seven");
        timeValueMap.put(8, "eight");
        timeValueMap.put(9, "nine");
        timeValueMap.put(10, "ten");
        timeValueMap.put(11, "eleven");
        timeValueMap.put(12, "twelve");
        timeValueMap.put(13, "thirteen");
        timeValueMap.put(14, "fourteen");
        timeValueMap.put(15, "quarter");
        timeValueMap.put(16, "sixteen");
        timeValueMap.put(17, "seventeen");
        timeValueMap.put(18, "eighteen");
        timeValueMap.put(19, "nineteen");
        timeValueMap.put(20, "twenty");
        timeValueMap.put(21, "twenty one");
        timeValueMap.put(22, "twenty two");
        timeValueMap.put(23, "twenty three");
        timeValueMap.put(24, "twenty four");
        timeValueMap.put(25, "twenty five");
        timeValueMap.put(26, "twenty six");
        timeValueMap.put(27, "twenty seven");
        timeValueMap.put(28, "twenty eight");
        timeValueMap.put(29, "twenty nine");
        timeValueMap.put(30, "half");
    }

    private static String timeInWords(int h, int m) {
        if (m == 0){
            return timeValueMap.get(h) + " o' clock";
        }else if (m >= 1 && m <= 30){
            if (m == 1){
                return timeValueMap.get(m) + " minute past " + timeValueMap.get(h);
            }
            else if (m == 15 || m == 30){
                return timeValueMap.get(m) + " past " + timeValueMap.get(h);
            }
            return timeValueMap.get(m) + " minutes past " + timeValueMap.get(h);
        }else if(m >= 31 && m < 60){
            if(m == 59){
                return timeValueMap.get(60-m) + " minute to " + timeValueMap.get(h+1);
            }else if(m == 45){
                return timeValueMap.get(60-m) + " to " + timeValueMap.get(h+1);
            }
            return timeValueMap.get(60-m) + " minutes to " + timeValueMap.get(h+1);
        }else{
            return "Unknown minute interval";
        }
    }


}
