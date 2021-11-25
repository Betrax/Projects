import greenfoot.*;
public class mouse
{
    int x;
    int y;
    
    public static int X()
    {
        return Greenfoot.getMouseInfo().getX();
    }
    public static int Y()
    {
        return Greenfoot.getMouseInfo().getY();
    }
    public static boolean mouseClicked()
    {
        if (Greenfoot.mouseClicked(null))
        {
            return true;
        }
        return false;
    }
}
