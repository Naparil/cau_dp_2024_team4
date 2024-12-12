package rabbitescape.engine;

import static org.hamcrest.CoreMatchers.nullValue;

import org.junit.Test;

import rabbitescape.engine.Token.Type;
import rabbitescape.engine.ChangeDescription.State;

public class TokenStateFactoryTest {
    @Test
    public void test()
    {
        System.out.println("\n---Test TokenStateFactoryTest---\n");
        Token token = new Token(0, 0, Type.bash); //Constructor use TokenStateFactory
        token = null;
        System.out.println("token creation success");
        State state = TokenStateFactory.switchType(Type.bash, false, false, false);
        System.out.printf("state : "); System.out.println(state); // TokenStateFactory run well
    }
}
