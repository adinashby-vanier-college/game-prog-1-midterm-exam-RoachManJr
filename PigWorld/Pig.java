// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Pig extends Actor
{

    /**
     * Act - do whatever the Pig wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move();
        eat();
        if (isGameWon()) {
            transitionToGameWin();
        }
    }

    /**
     * 
     */
    public void move()
    {
        if (Greenfoot.isKeyDown("w")) {
            move(2);
        }
        if (Greenfoot.isKeyDown("s")) {
            move(-2);
        }
        if (Greenfoot.isKeyDown("a")) {
            turn(-3);
        }
        if (Greenfoot.isKeyDown("d")) {
            turn(3);
        }
    }

    /**
     * 
     */
    public void eat()
    {
        Actor burger = getOneIntersectingObject(Burger.class);
        if (burger != null) {
            World world = getWorld();
            world.removeObject(burger);
            Greenfoot.playSound("eating.wav");
        }
    }

    /**
     * 
     */
    public boolean isGameWon()
    {
        World world = getWorld();
        if (world.getObjects(Burger.class).isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * 
     */
    public void transitionToGameWin()
    {
        World gameWin =  new  GameWin();
        Greenfoot.setWorld(gameWin);
        Greenfoot.playSound("win.wav");
    }
}
