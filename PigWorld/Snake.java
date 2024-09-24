// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Snake extends Actor
{

    /**
     * Act - do whatever the Snake wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAround();
        eatPig();
        if (isGameLost()) {
            transitionToGameLose();
        }
    }

    /**
     * 
     */
    public void moveAround()
    {
        move(3);
        if (Greenfoot.getRandomNumber(10) == 1) {
            turn(Greenfoot.getRandomNumber(90) - 45);
        }
        if (isAtEdge()) {
            turn(180);
        }
    }

    /**
     * 
     */
    public void eatPig()
    {
        Actor pig = getOneIntersectingObject(Pig.class);
        if (pig != null) {
            World world = getWorld();
            world.removeObject(pig);
        }
    }

    /**
     * 
     */
    public boolean isGameLost()
    {
        World world = getWorld();
        if (world.getObjects(Pig.class).isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * 
     */
    public void transitionToGameLose()
    {
        World gameLose =  new  GameLose();
        Greenfoot.setWorld(gameLose);
        Greenfoot.playSound("lose.wav");
    }
}
