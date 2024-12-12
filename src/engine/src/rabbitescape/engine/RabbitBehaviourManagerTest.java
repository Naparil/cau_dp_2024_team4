package rabbitescape.engine;

public class RabbitBehaviourManagerTest { //behave like rabbit
    RabbitBehaviourManager behaviourManager;
    public RabbitBehaviourManagerTest()
    {
        behaviourManager = new RabbitBehaviourManager(1);
    }

    public void testCancle()
    {
        behaviourManager.behaviours.get(0).cancel();
    }
}
