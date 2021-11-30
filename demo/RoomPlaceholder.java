import greenfoot.*;

public class RoomPlaceholder extends World
{
    gif background = new gif("forest.gif");

    public RoomPlaceholder()
    {
        super(1200, 700, 1);
    }

    public void act()
    {
        setBackground(background.draw(260, 260));
    }
}
