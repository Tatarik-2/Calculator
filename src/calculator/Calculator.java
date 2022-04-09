package calculator;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {
    public static void main(String[] args) {
        Tools.inputRomeNumbersHashMap();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите выражение без пробелов: ");
        String text = scanner.next();
        Tools.checkInputData(Tools.REGEXFORROMAN, text);

        Pattern pattern = Pattern.compile(Tools.REGEXFORROMAN);
        Matcher matcher = pattern.matcher(text);

        String s1 = null;
        String s2 = null;
        String s3 = null;

        int i1 = 0;
        int i3 = 0;
        while (matcher.find()) {
            s1 = matcher.group(1);
            s2 = matcher.group(2);
            s3 = matcher.group(3);
        }

        boolean romeNumbersTrue = Tools.checkRomeNumbers(s1, s3);
        if (romeNumbersTrue) {
            i1 = Tools.getValueOfRomeNumber(s1);
            i3 = Tools.getValueOfRomeNumber(s3);
        } else {
            Pattern pattern2 = Pattern.compile(Tools.REGEXFORARABIAN);
            Matcher matcher2 = pattern2.matcher(text);
            while (matcher2.find()) {
                s1 = matcher2.group(1);
                s2 = matcher2.group(2);
                s3 = matcher2.group(3);
            }

            boolean arabianNumbersTrue = Tools.checkInputData(Tools.REGEXFORARABIAN, text);
            if (arabianNumbersTrue) {
                i1 = Integer.parseInt(s1);
                i3 = Integer.parseInt(s3);

            }
        }

        char i2 = s2.charAt(0);
        double result = Tools.getResult(i1, i2, i3);

        System.out.println("result of: " + s1 + " " + i2 + " " + s3 + " = " + result);
    }
}

