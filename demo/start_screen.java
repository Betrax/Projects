import greenfoot.*;

public class start_screen extends World
{
    public static World start_screen = new start_screen();

    prop start_menu = new prop("Oguz/intro/1dark menu/", 63, 63, 1200 / 2, 700 / 2, 42);
    prop start = new prop("Oguz/intro/menu/start.png", 100, 100, 950, 350, 42);
    prop credits = new prop("Oguz/intro/menu/credits.png", 100, 100, 950, 450, 42);
    prop exit = new prop("Oguz/intro/menu/exit.png", 100, 100, 950, 550, 42);

    GreenfootSound backgroundMusic = new GreenfootSound("claire.mp3");

    public start_screen()
    {
        super(1200, 700, 1);


        addObject(start_menu, 0, 0);
        addObject(start, 0, 0);
        addObject(credits, 0, 0);
        addObject(exit, 0, 0);
    }

    public void act()
    {
        //backgroundMusic.playLoop();
        if (start.click("tap"))
        {
            Greenfoot.setWorld(Room1Oguz.Room1Oguz);
        }
        else if (credits.click("tap"))
        {
            
        }
        else if (exit.click("tap"))
        {
        }
    }

}
