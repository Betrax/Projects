import greenfoot.*; 

public class RoomJoran extends World
{
    public static World RoomJoran = new RoomJoran();
    
    long static_time = System.currentTimeMillis();
    
    prop door = new prop("roomJoran/trans.png", 225, 500, 350, 315, 0);
    prop laptop = new prop("roomJoran/laptop.png", 30, 30, 700, 370, 0);
    prop mirror = new prop("roomJoran/trans.png", 190, 125, 735, 250, 0);
    prop key = new prop("roomJoran/key.png", 10, 10, 720, 250, 0);
    public RoomJoran()
    {
        super(1200, 700, 1);
        GreenfootImage background = (new GreenfootImage("roomJoran.jpg"));
        background.scale(getWidth(), getHeight());
        setBackground(background);
        
        addObject(door, 100, 200);
        addObject(laptop, 100, 200);
        addObject(mirror, 100, 100);
    }

    public void act()
    {   
        key();
        if(laptop.click("tap"))
        {
            Greenfoot.setWorld(DesktopJoran.DesktopJoran);
        }
    }
    public void key()
    {
        if (mirror.click("tap"))
        {
            addObject(key, 100, 100);
        }
        if (key.click("hold"))
        {
                key.locationX = mouse.X();
                key.locationY = mouse.Y();
        }
        //try {
            //if (key.touchingProp(door))
            //{
               // Greenfoot.setWorld(RoomPlaceholder.RoomPlaceholder);
            //}   
        }//catch (java.lang.NullPointerException)
    }


