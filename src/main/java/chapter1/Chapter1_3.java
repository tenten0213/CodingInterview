package chapter1;

import java.util.Arrays;

public class Chapter1_3 {
    public static boolean isEqualAfterSorted(String foo, String bar) {
        if (foo.length() != bar.length()) {
            return false;
        }
        char[] fooList = foo.toCharArray();
        char[] barList = bar.toCharArray();
        Arrays.sort(fooList);
        Arrays.sort(barList);
        return Arrays.equals(fooList, barList);
    }
}
