package chapter1;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Chapter1_3Test {
    @Test
    public void 与えられた２つの文字列が異なる長さの場合は偽であること() {
        assertThat(Chapter1_3.isEqualAfterSorted("god", "doggy"), is(false));
    }
    @Test
    public void 与えられた２つの文字列が同一の文字で構成されている場合は真であること() {
        assertThat(Chapter1_3.isEqualAfterSorted("god", "dog"), is(true));
    }
    @Test
    public void 与えられた２つの文字列が同一の文字で構成されていない場合は偽であること() {
        assertThat(Chapter1_3.isEqualAfterSorted("god", "bog"), is(false));
    }
}
