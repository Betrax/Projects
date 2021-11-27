import greenfoot.*;

public class MyWorld extends BaseRoom
{
    gif background = new gif("forest.gif");
    prop player = new prop("player/run/", 500, 500, 200, 200, 100);
    
    public MyWorld(EscapeGame escapeGame)
    {
        super(escapeGame);
        
        addObject(player, 100, 100);
        
    }

    public void act()
    {
        setBackground(background.draw(260, 260));
    }   

}
