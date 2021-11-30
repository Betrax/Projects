import greenfoot.*;

public class start_screen extends World
{
    gif background = new gif("forest.gif");
    
    public static prop player2 = Room2.player;

    public start_screen()
    {
        super(1200, 700, 1);
        addObject(player2, 100, 500);
    }

    public void act()
    {
        setBackground(background.draw(260, 260));
        
        if (player2.click("hold"))
        {
            player2.locationX = mouse.X();
            player2.locationY = mouse.Y();
        }
    }

}
