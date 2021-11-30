import greenfoot.*; 

public class RoomJoran extends World
{
    prop door = new prop("room3.npg", 50, 150, 350, 315, 0);
    
    public RoomJoran()
    {
        super(1200, 700, 1);
        GreenfootImage background = (new GreenfootImage("roomJoran.jpg"));
        background.scale(getWidth(), getHeight());
        setBackground(background);
        
        addObject(door, 100, 200);
    }


    public void act()
    {
         if (door.click("tap"))
        {
            Greenfoot.setWorld(GOD.Room1);
        }
    }
}
