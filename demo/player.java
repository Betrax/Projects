import greenfoot.*;

public class player extends Actor
{
    animation idle = new animation("player/idle/");
    
    public void act()
    {
        setImage(idle.draw(1000, 1000, 7, 100));
    }
}
//Saad