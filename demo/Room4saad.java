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
    prop background = new prop("Saad/Verlatenn.gif", 148, 175, 600, 350, 100);
    
    prop licht = new prop("Saad/trans1.png", 25, 25, 600, 325, 0);
    
    prop Texta = new prop("Saad/Texta.png", 100, 100, 450, 140, 0);
    prop Textb = new prop("Saad/Foutt.png", 100, 100, 450, 220, 0);
    prop Textc = new prop("Saad/Foutt.png", 100, 100, 450, 300, 0);
    prop Textd = new prop("Saad/Foutt.png", 100, 100, 450, 380, 0);
    
    prop Red2 = new prop("Saad/Redcross.png", 1, 1, 485, 200, 0);
    prop Red = new prop("Saad/Redcross.png", 1, 1, 495, 120, 0);
    prop Red3 = new prop("Saad/Redcross.png", 1, 1, 485, 280, 0);
    prop Red4 = new prop("Saad/Redcross.png", 1, 1, 485, 360, 0);
    
    prop vraag = new prop("Saad/Vraag.png", 100, 100, 200, 100, 100);
    prop antwoord = new prop("Saad/ANTWOORD A.png", 100, 100, 200, 150, 100);
    prop antwoordb = new prop("Saad/ANTWOORD B.png", 100, 100, 200, 200, 100);
    prop antwoordc = new prop("Saad/ANTWOORD C.png", 100, 100, 200, 250, 100);
    prop antwoordd = new prop("Saad/ANTWOORD D.png", 100, 100, 200, 300, 100);
    public Room4saad()
    {   
        super(1200, 700, 1); 
        addObject(background, 100, 100);
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
    
    {if (antwoord.click("tap"))
       addObject(Texta, 100, 300);
    }
    {if (antwoord.click("tap"))
        addObject(Red, 100, 300);
    }
    
    {if (antwoordb.click("tap"))
       addObject(Textb, 100, 300);
    }
    
    {if (antwoordb.click("tap"))
        addObject(Red2, 100, 300);
    }
    
    {if (Red2.click("tap"))
     removeObject(Textb);
    }
    {if (Red2.click("tap"))
     removeObject(Red2);
    }
    
    {if (Red.click("tap"))
     removeObject(Texta);
    }
    {if (Red.click("tap"))
     removeObject(Red);
    }
    
    {if (antwoordc.click("tap"))
       addObject(Textc, 100, 300);
    }
    
    {if (antwoordc.click("tap"))
        addObject(Red3, 100, 300);
    }
    
    {if (Red3.click("tap"))
     removeObject(Textc);
    }
    {if (Red3.click("tap"))
     removeObject(Red3);
    }
    
    
    {if (antwoordd.click("tap"))
       addObject(Textd, 100, 300);
    }
    
    {if (antwoordd.click("tap"))
        addObject(Red4, 100, 300);
    }
    
    {if (Red4.click("tap"))
     removeObject(Textd);
    }
    {if (Red4.click("tap"))
     removeObject(Red4);
    }
}
}


