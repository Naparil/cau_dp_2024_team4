package rabbitescape.ui.swing;

import org.junit.Test;
import static org.junit.Assert.assertSame;
public class GameUiTestMain {
    @Test
    public void test() {
        System.out.println("\n---Test GameUi---\n");
        GameUiTest ui = GameUiTest.getInstance("test string");
        GameUiTest ui2 = GameUiTest.getInstance("fake string");
        assertSame(ui, ui2);
        assertSame(ui.test, ui2.test);
        System.out.println(ui.test);
        System.out.println(ui2.test);
    }
}
