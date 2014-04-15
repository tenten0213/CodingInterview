package chapter1;

public class Chapter1_4 {
    public static String replaceSpaces(String target) {
        return target.trim().replaceAll("\\s", "%20");
    }
}
