import greenfoot.*;

public class player extends Actor
{
    animation idle = new animation("C:/Users/Oguz/Documents/School/Greenfoot-windows-370/Projects/demo/images/player/idle/");
    
    public void act()
    {
        setImage(idle.draw(1000, 1000, 7, 100));
    }
}
