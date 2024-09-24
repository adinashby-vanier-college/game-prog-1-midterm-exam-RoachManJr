// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     */
    public MyWorld()
    {
        super(600, 400, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Burger burger =  new Burger();
        addObject(burger, 113, 72);
        Burger burger2 =  new Burger();
        addObject(burger2, 196, 76);
        Burger burger3 =  new Burger();
        addObject(burger3, 156, 134);
        Pig pig =  new Pig();
        addObject(pig, 165, 215);
        Burger burger4 =  new Burger();
        addObject(burger4, 63, 296);
        Burger burger5 =  new Burger();
        addObject(burger5, 128, 352);
        Burger burger6 =  new Burger();
        addObject(burger6, 454, 45);
        Burger burger7 =  new Burger();
        addObject(burger7, 397, 105);
        Burger burger8 =  new Burger();
        addObject(burger8, 529, 235);
        Burger burger9 =  new Burger();
        addObject(burger9, 398, 299);
        Snake snake =  new Snake();
        addObject(snake, 512, 334);
    }
}
