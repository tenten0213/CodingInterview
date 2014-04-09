package chapter1;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Chapter1_1Test {
    @Test
    public void 文字列がすべてユニークである() {
        assertThat(true, is(Chapter1_1.isUnique("hoge")));
        assertThat(true, is(Chapter1_1.isUnique("h")));
        assertThat(false, is(Chapter1_1.isUnique("aa")));
        assertThat(false, is(Chapter1_1.isUnique("aba")));
        assertThat(false, is(Chapter1_1.isUnique("baa")));
    }
}
