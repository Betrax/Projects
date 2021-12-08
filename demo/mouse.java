import greenfoot.*;

// Om de waarde van de muis te krijgen moet je functies mouse.X() en mouse.Y() gebruiken.
// Bijvoorbeeld als je de waarde van een prop gelijk wilt stellen aan die van de muis:
// (naam van prop).locationX = mouse.X()
// (naam van prop).locationY = mouse.Y()
// Functie mouseClicked geeft aan of dat er geklikt is of niet waar dan ook op het scherm, is nog
// nergens gebruikt
public class mouse
{
    private static int x;
    private static int x_buffer = 0;

    public static int X()
    {
        try
        {
            x = Greenfoot.getMouseInfo().getX();
            x_buffer = x;
        }catch (Exception NullPointerException)
        {
            x = x_buffer;
        }

        return x;
    }

    private static int y;
    private static int y_buffer = 0;

    public static int Y()
    {
        try
        {
            y = Greenfoot.getMouseInfo().getY();
            y_buffer = y;
        }catch (Exception NullPointerException)
        {
            y = y_buffer;
        }

        return y;
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
