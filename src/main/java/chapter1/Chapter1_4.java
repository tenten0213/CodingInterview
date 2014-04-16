package chapter1;

import java.nio.CharBuffer;
import java.util.Arrays;

public class Chapter1_4 {
    public static String replaceSpacesBuffer(Character[] chars, int length) {

        int encodedCharsLength = length + ((int) Arrays.asList(chars)
                .stream()
                .filter(s -> s.equals(' '))
                .count()) * 2;

        CharBuffer buffer = CharBuffer.allocate(encodedCharsLength);
        for(int i = 0; i < length; i++) {
            if(chars[i] == ' ') {
                buffer.put("%20");
            } else {
                buffer.put(chars[i]);
            }
        }
        buffer.flip();
        return buffer.toString();
    }
}
