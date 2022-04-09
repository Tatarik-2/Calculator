package calculator;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class Tools {
    final static String REGEXFORROMAN = "(\\w{1,4})(\\D)(\\w{1,4})";
    final static String REGEXFORARABIAN = "(10|[1-9])(\\D)(10|[1-9])";

    private static final Map<String, Integer> romeNumbers = new HashMap<>();

    public static void inputRomeNumbersHashMap() {
        romeNumbers.put("I", 1);
        romeNumbers.put("II", 2);
        romeNumbers.put("III", 3);
        romeNumbers.put("IV", 4);
        romeNumbers.put("V", 5);
        romeNumbers.put("VI", 6);
        romeNumbers.put("VII", 7);
        romeNumbers.put("VIII", 8);
        romeNumbers.put("IX", 9);
        romeNumbers.put("X", 10);
    }

    public static int getValueOfRomeNumber(String s) {
        if (romeNumbers.containsKey(s)) {
            return romeNumbers.get(s);
        } else throw new RuntimeException("Некорректные данные");
    }

    public static boolean checkInputData(String regEx, String inputText) {
        boolean a = Pattern.matches(regEx, inputText);
        if (a) {
            return a;
        } else {
            throw new RuntimeException("Введены некорректные данные. Пожалуйста, попробуйте еще раз");
        }
    }

    public static boolean checkRomeNumbers(String s1, String s2) {
        boolean b1 = romeNumbers.containsKey(s1);
        boolean b2 = romeNumbers.containsKey(s2);
        return b1 && b2;
    }

    public static double getResult(int i1, char i2, int i3) {
        double result = 0;
        switch (i2) {
            case '+':
                result = i1 + i3;
                break;
            case '-':
                result = i1 - i3;
                break;
            case '*':
                result = i1 * i3;
                break;
            case '/':
                result = (double) i1 / i3;
                break;
            default:
                throw new RuntimeException("Некорректный символ");
        }
        return result;
    }
}
