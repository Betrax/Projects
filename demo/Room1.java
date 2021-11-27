import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Room1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Room1 extends BaseRoom
{

    public Room1(EscapeGame escapeGame)
    {
        super(escapeGame);

        GreenfootImage background = (new GreenfootImage("basement.png"));
        background.scale(getWidth(), getHeight());
        setBackground(background);

    }

    public void act()
    {

    }

}

