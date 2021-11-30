import greenfoot.*; 

public class Room3 extends World
{
    prop door = new prop("room2/", 100, 100, 100, 100, 0);
    
    public Room3()
    {
        super(1200, 700, 1);
        GreenfootImage background = (new GreenfootImage("room3.jpg"));
        background.scale(getWidth(), getHeight());
        setBackground(background);
        addObject(door, 100, 100);
    }


    public void act()
    {

    }
}
