import greenfoot.*; 

public class Room2 extends World
{
    GreenfootImage background = (new GreenfootImage("basement.png"));
    public static prop player = new prop("player/run/", 500, 500, 500, 500, 100);
    
    
    prop vraag = new prop("a.png", 100, 100, 200, 100, 100);
    
    public Room2()
    {
        super(1200, 700, 1);
        background.scale(getWidth(), getHeight());
        setBackground(background);
        
        addObject(player, 100, 200);
        
        addObject(vraag, 100, 200);
    }

    public void act()
    {
        if (player.click("tap"))
        {
            Greenfoot.setWorld(GOD.Room1);
        }
    }

}

