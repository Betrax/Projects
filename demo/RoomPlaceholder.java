import greenfoot.*;

public class RoomPlaceholder extends World
{

    public static World RoomPlaceholder = new RoomPlaceholder();
    gif background = new gif("forest.gif");

    public RoomPlaceholder()
    {
        super(1200, 700, 1);
    }

    public void act()
    {
        GOD.forceswitch();
        setBackground(background.draw(260, 260));
    }
}
