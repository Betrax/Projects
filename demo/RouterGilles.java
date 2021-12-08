import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Arrays;

/**
 * Write a description of class RouterGilles here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class RouterGilles extends World
{
    public static World RouterGilles = new RouterGilles();

    prop button1 = new prop("buttons/button1.png", 40, 40, 350, 300, 0);
    prop button2 = new prop("buttons/button2.png", 40, 40, 600, 300, 0);
    prop button3 = new prop("buttons/button3.png", 40, 40, 850, 300, 0);
    prop light = new prop("buttons/light.png", 30, 25, 600, 160, 0);
    prop green = new prop("buttons/green.png", 15, 13, 600, 160, 0);
    prop red = new prop("buttons/red.png", 30, 25, 600, 160, 0);
    prop arrow = new prop("buttons/arrow.png", 20, 20, 70, 50, 0);

    public RouterGilles()
    {
        super(1200, 700, 1);
        GreenfootImage background = (new GreenfootImage("router_zoom.png"));
        background.scale(getWidth(), getHeight());
        setBackground(background);

        addObject(button1, 1, 1);
        addObject(button2, 1, 1);
        addObject(button3, 1, 1);
        addObject(light, 1, 1);
        addObject(arrow, 1, 1);
    }

    public int loc = 99;

    public int location()
    {
        for (int i = 0; i < code.length; i++)
        {
            if (code[i] == 0)
            {
                loc = i;
                break;
            }
            else
            {
                loc = 99;
            }
        }
        return loc;
    }

    int[] code = new int[3];
    int[] answer = new int[]
    {3, 2, 3};

    public void act()
    {
        if (location() == 99)
        {
            if (Arrays.equals(code, answer))
            {
                addObject(green, 1, 1);
                DesktopGilles.wifi = true;
            }
            else
            {
                Arrays.fill(code, 0);
                addObject(red, 1, 1);
            }
        }
        else
        {
            if (button1.click("tap"))
            {
                int new_el = 1;
                code[location()] = new_el;
                Greenfoot.playSound("button.mp3");
            }
            if (button2.click("tap"))
            {
                int new_el = 2;
                code[location()] = new_el;
                Greenfoot.playSound("button.mp3");
            }
            if (button3.click("tap"))
            {
                int new_el = 3;
                code[location()] = new_el;
                Greenfoot.playSound("button.mp3");
            }
        }

        if (arrow.click("tap"))
        {
            Greenfoot.setWorld(RoomGilles.RoomGilles);
        }
    }
}
