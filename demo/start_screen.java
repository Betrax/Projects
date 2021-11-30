import greenfoot.*;

public class start_screen extends World
{
    gif background = new gif("forest.gif");

    public start_screen()
    {
        super(1200, 700, 1);
    }

    public void act()
    {
        setBackground(background.draw(260, 260));
    }

}
