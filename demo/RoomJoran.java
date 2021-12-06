import greenfoot.*; 

public class RoomJoran extends World
{
    public static World RoomJoran = new RoomJoran();
    prop door = new prop("roomJoran/trans.png", 225, 500, 350, 315, 0);
    prop laptop = new prop("roomJoran/laptop.png", 30, 30, 700, 370, 0);
    
    public RoomJoran()
    {
        super(1200, 700, 1);
        GreenfootImage background = (new GreenfootImage("roomJoran.jpg"));
        background.scale(getWidth(), getHeight());
        setBackground(background);
        
        addObject(door, 100, 200);
        addObject(laptop, 100, 200);
    }

    public void act()
    {
         if (door.click("tap"))
        {
            Greenfoot.setWorld(RoomPlaceholder.RoomPlaceholder);
        }
        if(laptop.click("tap"))
        {
            Greenfoot.setWorld(DesktopJoran.DesktopJoran);
        }
    }
    
    public void WorldFix() {
        Greenfoot.setWorld(RoomRobin.RoomRobin);
    }
}
