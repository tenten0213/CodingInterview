package chapter1;

public class Main {
    public static boolean isUnique(String target) {
        char[] chars = target.toCharArray();
        for(int index = 0; index < chars.length; index++) {
            if(index != target.indexOf(chars[index])) {
                return false;
            }
        }
        return true;
    }
}
