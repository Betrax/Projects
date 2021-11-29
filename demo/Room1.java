import greenfoot.*;

public class Room1 extends World
{
    gif background = new gif("forest.gif");
    prop player = new prop("player/knockback/", 300, 300, 300, 200, 100);

    public Room1()
    {
        super(1200, 700, 1);
        addObject(player, 100, 500);
    }

    public void act()
    {
        setBackground(background.draw(260, 260));
        
        if (player.click("hold"))
        {
            player.locationX = mouse.X();
            player.locationY = mouse.Y();
        }
    }
}
