package chapter1;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
public class Chapter1_5Test {
    @Test
    public void 元の文字列より圧縮された文字列が短い場合は圧縮された文字列が返却されること() {
       assertThat(Chapter1_5.compress("aabcccccaaa"), is("a2b1c5a3"));
    }
    @Test
    public void 元の文字列より圧縮された文字列が長い場合は元の文字列が返却されること() {
        assertThat(Chapter1_5.compress("abcdef"), is("abcdef"));
    }
}
