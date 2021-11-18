import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Room2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Room2 extends BaseRoom
{
    private int count = 0;

    public Room2(EscapeGame escapeGame)
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
