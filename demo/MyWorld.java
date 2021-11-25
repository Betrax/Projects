import greenfoot.*;

public class MyWorld extends World
{
    gif background = new gif("forest.gif");
    prop player = new prop("player/idle/");
    
    public MyWorld()
    {
        super(1200, 700, 1);
    }
    
    public void act()
    {
        setBackground(background.draw(260, 260));
    }
}
