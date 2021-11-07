import greenfoot.*;

public class MyWorld extends World
{
    gif background = new gif("forest.gif");

    public MyWorld()
    {
        super(1200, 700, 1);
        addObject(new player(), 100, 100);
    }
    public void act()
    {
        setBackground(background.draw(260, 260));
    }
}
