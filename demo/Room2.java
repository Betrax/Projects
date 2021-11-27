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
    prop placeHolder = new prop("player/roll/",500,500, 300,300,100);
    public Room2(EscapeGame escapeGame)
    {
        super(escapeGame);
        
        GreenfootImage background = (new GreenfootImage("banaan.jpg"));
        background.scale(getWidth(), getHeight());
        setBackground(background);
        
        addObject(placeHolder, 300,300);
        
    }
        

    public void act()
    {

    }
}
