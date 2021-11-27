import greenfoot.*;
public class mouse
{
    private static int x;
    private static int x_buffer = 0;
    
    public static int get_X()
    {
        try{
            x = Greenfoot.getMouseInfo().getX();
            x_buffer = x;
        }
        catch(Exception NullPointerException)
        {
            x = x_buffer;
        }
        
        return x;
    }
    
    private static int y;
    private static int y_buffer = 0;
    
    public static int get_Y()
    {
        try{
            y = Greenfoot.getMouseInfo().getY();
            y_buffer = y;
        }
        catch(Exception NullPointerException)
        {
            y = y_buffer;
        }
        
        return y;
    }
    
    
    // nog niet echt nuttig, maar het werkt
    public static boolean mouseClicked()
    {
        if (Greenfoot.mouseClicked(null))
        {
            return true;
        }
        return false;
    }
}
