package chapter1;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Chapter1_3Test {
    @Test
    public void 与えられた２つの文字列が異なる長さの場合は偽であること() {
        assertThat(false, is(Chapter1_3.isEqualAfterSorted("god", "doggy")));
    }
    @Test
    public void 与えられた２つの文字列が同一の文字で構成されている場合は真であること() {
        assertThat(true, is(Chapter1_3.isEqualAfterSorted("god", "dog")));
    }
    @Test
    public void 与えられた２つの文字列が同一の文字で構成されていない場合は偽であること() {
        assertThat(false, is(Chapter1_3.isEqualAfterSorted("god", "bog")));
    }
}
