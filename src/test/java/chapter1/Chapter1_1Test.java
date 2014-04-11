package chapter1;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Chapter1_1Test {
    @Test
    public void 同一の文字が含まれない場合は真となること() {
        assertThat(Chapter1_1.isUnique("hoge"), is(true));
    }
    @Test
    public void 文字列が１文字の場合は真となること() {
        assertThat(Chapter1_1.isUnique("a"), is(true));
    }
    @Test
    public void 同一の文字が含まれる場合は偽となること() {
        assertThat(Chapter1_1.isUnique("abcdefga"), is(false));
    }
    @Test
    public void マルチバイトで同一の文字が含まれる場合は偽となること() {
        assertThat(Chapter1_1.isUnique("あいうえおあ"), is(false));
    }
    @Test
    public void 同一の文字が含まれない場合は真となること_java8() {
        assertThat(Chapter1_1.isUnique_java8("hoge"), is(true));
    }
    @Test
    public void 文字列が１文字の場合は真となること_java8() {
        assertThat(Chapter1_1.isUnique_java8("a"), is(true));
    }
    @Test
    public void 同一の文字が含まれる場合は偽となること_java8() {
        assertThat(Chapter1_1.isUnique_java8("abcdefga"), is(false));
    }
    @Test
    public void マルチバイトで同一の文字が含まれる場合は偽となること_java8() {
        assertThat(Chapter1_1.isUnique_java8("あいうえおあ"), is(false));
    }
}
