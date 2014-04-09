package chapter1;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MainTest {
    @Test
    public void 文字列がすべてユニークである() {
        assertThat(true, is(Main.isUnique("hoge")));
        assertThat(true, is(Main.isUnique("h")));
        assertThat(false, is(Main.isUnique("aa")));
        assertThat(false, is(Main.isUnique("aba")));
        assertThat(false, is(Main.isUnique("baa")));
    }
}
