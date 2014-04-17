package chapter1;

import org.apache.commons.lang3.ArrayUtils;

import java.nio.CharBuffer;
import java.util.Arrays;

public class Chapter1_4 {
    public static String replaceSpacesBuffer(char[] chars, int length) {

        Character[] characters = ArrayUtils.toObject(chars);
        int encodedCharsLength = length + ((int) Arrays.asList(characters)
                .stream()
                .filter(s -> s.equals(' '))
                .count()) * 2;

        CharBuffer buffer = CharBuffer.allocate(encodedCharsLength);
        for(int i = 0; i < length; i++) {
            if(characters[i] == ' ') {
                buffer.put("%20");
            } else {
                buffer.put(characters[i]);
            }
        }
        buffer.flip();
        return buffer.toString();
    }
}
