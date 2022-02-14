package com.valdemiro;


public class Basic {
    public static void inp(String oneNum, String operand, String twoNum) {
        int one = 0;
        int two = 0;
        int result = 0;

        boolean flag = false;
        try {
            one = Integer.parseInt(oneNum);
            two = Integer.parseInt(twoNum);
        } catch (Exception e) {
            try {
                one = Convert.convertToArabic(oneNum);
                two = Convert.convertToArabic(twoNum);
                flag = true;
            } catch (Exception e2) {
                System.out.println("Что-то пошло не так");
            }
        }

        switch (operand) {
            case ("-") -> result = one - two;
            case ("+") -> result = one + two;
            case ("*") -> result = one * two;
            case ("/") -> result = one / two;
            default -> System.out.println("Введите правильный операнд");
        }

        if (one < 1 || one > 10 || two < 1 || two > 10) {
            System.out.println("Неправильные данные");
            System.exit(0);
        }
        if (flag) {
            String roman = Convert.convertToRoman(result);
            System.out.println(roman);

        } else {
            System.out.println(result);
        }
    }
}