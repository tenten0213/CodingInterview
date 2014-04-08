package chapter1;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MainTest {
    @Test
    public void 文字列がすべてユニークである() {
        assertTrue(Main.isUnique("hoge"));
        assertFalse(Main.isUnique("foo"));
        assertFalse(Main.isUnique("ooo"));
        assertFalse(Main.isUnique("foaaaaao"));
        assertFalse(Main.isUnique("ababagagaga"));
    }
}
