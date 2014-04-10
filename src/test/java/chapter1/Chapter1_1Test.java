package chapter1;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Chapter1_1Test {
    @Test
    public void 同一の文字が含まれない場合は真となること() {
        assertThat(true, is(Chapter1_1.isUnique("hoge")));
    }
    @Test
    public void 文字列が１文字の場合は真となること() {
        assertThat(true, is(Chapter1_1.isUnique("a")));
    }
    @Test
    public void 同一の文字が含まれる場合は偽となること() {
        assertThat(false, is(Chapter1_1.isUnique("abcdefga")));
    }
    @Test
    public void マルチバイトで同一の文字が含まれる場合は偽となること() {
        assertThat(false, is(Chapter1_1.isUnique("あいうえおあ")));
    }
}
