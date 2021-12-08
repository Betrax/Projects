import greenfoot.*;

public class start_screen extends World
{
    public static World start_screen = new start_screen();

    prop start_menu = new prop("Oguz/intro/1dark menu/", 63, 63, 1200 / 2, 700 / 2, 42);
    prop start = new prop("Oguz/intro/menu/start.png", 100, 100, 940, 400, 42);

    public static GreenfootSound backgroundMusic = new GreenfootSound("claire.mp3");

    time delay1 = new time();
    time delay2 = new time();



    boolean switches[] =
    {true, false};

    public start_screen()
    {
        super(1200, 700, 1);


        addObject(start_menu, 0, 0);
        addObject(start, 0, 0);
    }

    public void act()
    {
        GOD.forceswitch();
        if (delay1.d(100) && switches[0])
        {
            start.locationY += 3;
            if (start.locationY >= 450)
            {
                switches[0] = false;
                switches[1] = true;
            }
        }

        if (delay2.d(100) && switches[1])
        {
            start.locationY -= 3;

            if (start.locationY <= 400)
            {
                switches[0] = true;
                switches[1] = false;
            }
        }


        backgroundMusic.playLoop();
        if (start.click("tap"))
        {
            Greenfoot.setWorld(new Room1Oguz());
        }
    }
}
