package chapter1;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Chapter1_3Test {
    @Test
    public void 与えられた２つの文字列が同一の要素で構成されている() {
        assertThat(false, is(Chapter1_3.isEqualAfterSorted("god", "do")));
        assertThat(true, is(Chapter1_3.isEqualAfterSorted("god", "dog")));
        assertThat(false, is(Chapter1_3.isEqualAfterSorted("hoge", "fuga")));
    }
}
