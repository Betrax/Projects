import greenfoot.*;

public class RoomGilles extends World
{
    public static World RoomGilles = new RoomGilles();
    prop desk = new prop("desk.png", 13, 13, 600, 450, 0);
    prop nota = new prop("tabs/ascii.jpg", 11, 14, 800, 275, 0);
    prop notaxl = new prop("tabs/ascii.jpg", 56, 73, 600, 350, 0);
    prop router = new prop("router.png", 8, 8, 410, 367, 0);
    prop trap = new prop("transparent.png", 50, 50, 150, 262, 0);

    public RoomGilles()
    {
        super(1200, 700, 1);
        GreenfootImage background = (new GreenfootImage("basement.png"));
        background.scale(getWidth(), getHeight());
        setBackground(background);

        addObject(desk, 600, 450);
        addObject(nota, 900, 150);
        addObject(router, 1, 1);
        addObject(trap, 1, 1);
    }

    boolean nota_open = false;
    public static boolean door_open = false;

    public void act()
    {
        if (desk.click("tap"))
        {
            Greenfoot.setWorld(DesktopGilles.DesktopGilles);
        }
        if (nota.click("tap"))
        {
            addObject(notaxl, 800, 275);
            nota_open = true;
        }
        if (nota_open && Greenfoot.mouseClicked(RoomGilles))
        {
            removeObject(notaxl);
        }
        if (router.click("tap"))
        {
            Greenfoot.setWorld(RouterGilles.RouterGilles);
        }
        if (trap.click("tap"))
        {
            if (door_open == true)
            {
                Greenfoot.playSound("door.mp3");
                Greenfoot.setWorld(RoomRobin.RoomRobin);
            }
            else
            {
                Greenfoot.playSound("locked.mp3");
            }
        }
    }

}
