package rabbitescape.engine;

import java.lang.module.ModuleDescriptor.Builder;
import rabbitescape.engine.Block.BuilderBlock;

import org.junit.Test;


public class BlockTestMain {
    @Test
    public void test()
    {
        System.out.println("\n---Test BlockTestMain---\n");
        Block block =  new Block.BuilderBlock()
        .setPosition(10,10)
        .setMaterial(Block.Material.EARTH)
        .setShape(Block.Shape.BRIDGE_UP_RIGHT)
        .build();
        if (block != null )
            System.out.println("BuilderBlock make block successfully");
        System.out.printf("x : "); System.err.println(block.getPosition().x);
        System.out.printf("y : "); System.err.println(block.getPosition().y);
        
    }
}
