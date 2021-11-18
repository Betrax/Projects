import greenfoot.*;

public class player extends Actor
{
    animation idle = new animation("player/idle/");
    public void act()
    {
        setImage(idle.draw(mouse.X(),mouse.Y(), 7, 100));
    }
}
//Saad