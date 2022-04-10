package calculator;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Notes {
    public static void main(String[] args) {
        String s = "5+5";
//        Pattern pattern = Pattern.compile("(\\d{1,2})(\\D)(\\d{1,2})");
//        Pattern pattern = Pattern.compile("([1-9])(\\D)([1-9])");
        String regEx = ("(10|[1-9])(\\D)(10|[1-9])");
        Pattern pattern = Pattern.compile("(10|[1-9])(\\D)(10|[1-9])");
        Matcher matcher = pattern.matcher(s);
        System.out.println(Pattern.matches("([1-9]|[1][0])(\\D)([1-9]|[1][0])", s));
        while (matcher.find()){
            System.out.println(matcher.group());
        }
        System.out.println("////////////////////////////////");
        String s1 = "";
//        Pattern pattern = Pattern.compile("(\\d{1,2})(\\D)(\\d{1,2})");
        Pattern pattern1 = Pattern.compile("([0-9]|1[0])");
        Matcher matcher1 = pattern1.matcher(s1);

        while (matcher1.find()){
            System.out.println(matcher1.group());
        }

        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");

        StringBuilder [] stringBuilders = {sb1, sb2, sb3};
        stringBuilders[2]=new StringBuilder("D");

        List<StringBuilder> stringBuilderList = Arrays.asList(stringBuilders);
        System.out.println(stringBuilderList);


    }
}
