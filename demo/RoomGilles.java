import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class RoomGilles extends World
{
    public static World RoomGilles = new RoomGilles();
    prop desk = new prop("desk.png", 15, 15, 600, 450, 0);
    prop nota = new prop("ascii.jpg", 11, 14, 800, 275, 0);
    prop notaxl = new prop("ascii.jpg", 56, 73, 600, 350, 0);
    
    public RoomGilles()
    {    
        super(1200, 700, 1);
        GreenfootImage background = (new GreenfootImage("basement.png"));
        background.scale(getWidth(), getHeight());
        setBackground(background);
        
        addObject(desk, 600, 450);
        addObject(nota, 900, 150);
    }
    boolean switch1 = true;
    public void act()
    {
        if (desk.click("tap"))
        {
            Greenfoot.setWorld(DesktopGilles.DesktopGilles);
        }
        if (nota.click("tap"))
        {
            addObject(notaxl, 800, 275);
            switch1 = false;
        }
        if (switch1)
        {
            removeObject(notaxl);
        }
    }
    
}
