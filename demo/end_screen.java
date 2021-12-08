import greenfoot.*;
public class end_screen extends World
{
    prop background = new prop("end/end.gif", 150, 150, 1200/2, 700/2, 1);
    prop text = new prop("end/end.png", 50, 50, 1200/2, 700/2, 1);
    public end_screen()
    {
        super(1200, 700, 1);
    }
    
    public void act()
    {
        addObject(background, 1, 1);
        addObject(text, 1, 1);
    }
}
