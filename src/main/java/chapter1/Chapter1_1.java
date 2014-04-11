package chapter1;

public class Chapter1_1 {
    public static boolean isUnique(String target) {
        char[] chars = target.toCharArray();
        for(int index = 0; index < chars.length; index++) {
            if(index != target.indexOf(chars[index])) {
                return false;
            }
        }
        return true;
    }

    public static boolean isUnique_java8(String target) {
        return target.chars().distinct().count() == target.length();
    }
}
