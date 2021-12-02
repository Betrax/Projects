import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Room4saad here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Room4saad extends World
{
    GreenfootImage background = (new GreenfootImage("Verlaten.jpg"));
    
    prop vraag = new prop("vraag", 100, 100, 200, 100, 100);
    
    public Room4saad()
    {    
        super(1200, 700, 1); 
        background.scale(getWidth(), getHeight());
        setBackground(background);
        
        addObject(vraag, 100, 200);
        
    }
}
