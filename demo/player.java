import greenfoot.*;

public class player extends Actor
{
    public void act()
    {
        if (mouse.mouseClicked()==true)
        {
            move();
        }
    }
    public void move()
    {
        move(100);
    }
}
