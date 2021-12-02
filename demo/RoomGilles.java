import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RoomGilles here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RoomGilles extends World
{
    public static World RoomGilles = new RoomGilles();
    prop desk = new prop("desk.png", 200, 200, getWidth()/2, getHeight()/2 + 100, 0);
    
    public RoomGilles()
    {    
        super(960, 568, 1); 
        GreenfootImage background = (new GreenfootImage("basement.png"));
        background.scale(getWidth(), getHeight());
        setBackground(background);
        
        addObject(desk, getWidth()/2, getHeight()/2 + 100);
    }
    public void act()
    {
         if (desk.click("tap"))
        {
            Greenfoot.setWorld(DesktopGilles.DesktopGilles);
        }
    }
    
}
