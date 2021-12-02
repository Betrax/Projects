import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Room4saad here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Room4saad extends World
{
    public static World Room4saad = new Room4saad();
    GreenfootImage background = (new GreenfootImage("Verlaten.jpg"));
    
    prop licht = new prop("Saad/trans1.png", 25, 25, 600, 325, 0);
    
    prop vraag = new prop("Saad/Vraag.png", 100, 100, 200, 100, 100);
    prop antwoord = new prop("Saad/ANTWOORD A.png", 100, 100, 200, 150, 100);
    prop antwoordb = new prop("Saad/ANTWOORD B.png", 100, 100, 200, 200, 100);
    prop antwoordc = new prop("Saad/ANTWOORD C.png", 100, 100, 200, 250, 100);
    prop antwoordd = new prop("Saad/ANTWOORD D.png", 100, 100, 200, 300, 100);
    public Room4saad()
    {   
        super(1200, 700, 1); 
        background.scale(getWidth(), getHeight());
        setBackground(background);
        
        addObject(licht, 100, 200);
    
        
        
    }
    
    public void act()
    {
    {
     if (licht.click("tap")) 
        {
        addObject(vraag, 100, 200);
        addObject(antwoord, 100, 300);
        addObject(antwoordb, 100, 300);   
        addObject(antwoordc, 100, 300); 
        addObject(antwoordd, 100, 300); 
        }
    }
}
}



