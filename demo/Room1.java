import greenfoot.*;

public class Room1 extends World
{
    gif background = new gif("forest.gif");
    
    public Room1()
    {
        super(1200, 700, 1);

    }

    public void act()
    {
        setBackground(background.draw(260, 260));
        

    }
}
