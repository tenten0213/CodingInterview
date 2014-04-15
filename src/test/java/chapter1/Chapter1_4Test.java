package chapter1;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Chapter1_4Test {
    @Test
    public void 与えられた文字配列の末尾の空白が除去され空白がエンコードされた値が返却されること() {
        assertThat(Chapter1_4.replaceSpacesBuffer(new Character[]{'M','r',' ','J', 'o', 'h', 'n', ' ','S', 'm', 'i', 't', 'h', ' ', ' ', ' '}, 13), is("Mr%20John%20Smith"));
    }
}
