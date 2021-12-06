import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DesktopJoran here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DesktopJoran extends World
{
    public static World DesktopJoran = new DesktopJoran();
    int x;
    int y;
    prop background = new prop("windows.jpg", 169, 270, 600, 350, 0);   
    prop virus1 = new prop ("RoomJoran/virus.png", 15, 15, Greenfoot.getRandomNumber(1200), Greenfoot.getRandomNumber(700), 0);
    prop virus2 = new prop ("RoomJoran/virus.png", 15, 15, Greenfoot.getRandomNumber(1200), Greenfoot.getRandomNumber(700), 0);
    prop virus3 = new prop ("RoomJoran/virus.png", 15, 15, Greenfoot.getRandomNumber(1200), Greenfoot.getRandomNumber(700), 0);
    prop virus4 = new prop ("RoomJoran/virus.png", 15, 15, Greenfoot.getRandomNumber(1200), Greenfoot.getRandomNumber(700), 0);
    prop virus5 = new prop ("RoomJoran/virus.png", 15, 15, Greenfoot.getRandomNumber(1200), Greenfoot.getRandomNumber(700), 0);
    prop virus6 = new prop ("RoomJoran/virus.png", 15, 15, Greenfoot.getRandomNumber(1200), Greenfoot.getRandomNumber(700), 0);
    prop virus7 = new prop ("RoomJoran/virus.png", 15, 15, Greenfoot.getRandomNumber(1200), Greenfoot.getRandomNumber(700), 0);
    prop virus8 = new prop ("RoomJoran/virus.png", 15, 15, Greenfoot.getRandomNumber(1200), Greenfoot.getRandomNumber(700), 0);
    prop needle = new prop ("RoomJoran/needle.png", 8, 8, x, y, 0);
    
    public DesktopJoran()
    {    
         // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 700, 1); 
        
        addObject(background, 100, 100);
        addObject(virus1, 100, 100);
        addObject(virus2, 100, 100);
        addObject(virus3, 100, 100);
        addObject(virus4, 100, 100);
        addObject(virus5, 100, 100);
        addObject(virus6, 100, 100);
        addObject(virus7, 100, 100);
        addObject(virus8, 100, 100);
        addObject(needle, x, y);
    }
    
    
    public void act()
    {
        move();
    }

    public void move()
    {   
        if (needle.click("hold"))
        {
             x = Greenfoot.getMouseInfo().getX();
        }
    }
    }



     
       
    
                                 
        
    
