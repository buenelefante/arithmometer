package com.valdemiro;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class Convert {
    private final static List<String> roman = new ArrayList<String>();

    static {
        roman.add(" ");
        roman.add("I");
        roman.add("II");
        roman.add("III");
        roman.add("IV");
        roman.add("V");
        roman.add("VI");
        roman.add("VII");
        roman.add("VIII");
        roman.add("IX");
        roman.add("X");
    }

    private final static TreeMap<Integer, String> map = new TreeMap<Integer, String>();

    static {
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");
    }
        public static String convertToRoman(int number){
            int numList = map.floorKey(number);
            if (number == numList) {
                return map.get(number);
            }
            return map.get(numList) + convertToRoman(number - numList);
        }

        public static int convertToArabic(String number){
            return roman.indexOf(number);
        }
    }

