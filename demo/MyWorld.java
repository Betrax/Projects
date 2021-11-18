import greenfoot.*;

public class MyWorld extends BaseRoom
{
    gif background = new gif("forest.gif");

    public MyWorld(EscapeGame escapeGame)
    {
        super(escapeGame);
        addObject(new player(), 100, 100);
    }

    public void act()
    {
        setBackground(background.draw(260, 260));
    }

}
