package rabbitescape.ui.swing;

public class GameUiTest{
    public final String test;
    private static GameUiTest uniqueInstance;

    private GameUiTest(
        String test
    )
    {
        this.test = test;
    }

    public static GameUiTest getInstance(String test) {
	if (uniqueInstance == null) {
	    uniqueInstance = new GameUiTest(test);
    	    }
    	    return uniqueInstance;
    	}
}