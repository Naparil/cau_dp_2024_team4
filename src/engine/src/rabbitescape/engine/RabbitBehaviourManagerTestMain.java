package rabbitescape.engine;

import org.junit.Test;

public class RabbitBehaviourManagerTestMain {
    @Test
    
    public void test() {
        System.out.println("\n---Test RabbitBehaviourManager---\n");
        RabbitBehaviourManager manager = new RabbitBehaviourManager(3);

        System.out.println("RabbitBehaviourManager have behaviors list");
        System.out.println(manager.behaviours); // have same list

        RabbitBehaviourManagerTest test = new RabbitBehaviourManagerTest();

        try {
            test.testCancle(); // Runs without problems
            System.out.println("error not occur");
        } catch (Exception e) {
            System.out.println("something wrong");
        }
    }
}
