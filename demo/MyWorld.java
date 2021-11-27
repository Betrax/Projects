import greenfoot.*;

public class MyWorld extends World
{
    gif background = new gif("forest.gif");


    prop player = new prop("player/run/", 300, 300, 200, 200, 100); // Maak een object
    // animation_locatie,scaleX, scaleY, LocX, LocY, Animation_speed, draggable?
    prop player2 = new prop("player/idle/", 200, 100, 100, 100, 100);

    public MyWorld()
    {
        super(1200, 700, 1); // niet nodig
        addObject(player, 100, 100);// Voeg het object toe naar de wereld
        addObject(player2, 100, 100);
    }

    public void act()
    {
        setBackground(background.draw(260, 260));

        if (player.object_click)
        {
            player.locationX = mouse.get_X();
            player.locationY = mouse.get_Y();
        }
        
        if (player2.object_click)
        {
            player2.locationX = mouse.get_X();
            player2.locationY = mouse.get_Y();
        }
    }
}
