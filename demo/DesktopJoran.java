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
    
    long static_time = System.currentTimeMillis();
    
    prop background = new prop("windows.jpg", 169, 270, 600, 350, 0);   
   
    prop norton = new prop ("RoomJoran/norton.png", 8, 8, x, y, 0);
    prop textbox1 = new prop ("RoomJoran/textbox.png", 100, 100, 600, 350, 0);
    prop exit = new prop ("RoomJoran/exit.png", 2, 2, 960, 215, 0);
    prop textbox2 = new prop ("RoomJoran/textbox.png", 20, 10, 600, 450, 0);
    
    prop virussen [] = {new prop ("RoomJoran/virus.png", 15, 15, 100, 100, 0),
                        new prop ("RoomJoran/virus.png", 15, 15, Greenfoot.getRandomNumber(1200), Greenfoot.getRandomNumber(700), 0),
                        new prop ("RoomJoran/virus.png", 15, 15, Greenfoot.getRandomNumber(1200), Greenfoot.getRandomNumber(700), 0),
                        new prop ("RoomJoran/virus.png", 15, 15, Greenfoot.getRandomNumber(1200), Greenfoot.getRandomNumber(700), 0),
                        new prop ("RoomJoran/virus.png", 15, 15, Greenfoot.getRandomNumber(1200), Greenfoot.getRandomNumber(700), 0),
                        new prop ("RoomJoran/virus.png", 15, 15, Greenfoot.getRandomNumber(1200), Greenfoot.getRandomNumber(700), 0),
                        new prop ("RoomJoran/virus.png", 15, 15, Greenfoot.getRandomNumber(1200), Greenfoot.getRandomNumber(700), 0),
                        new prop ("RoomJoran/virus.png", 15, 15, Greenfoot.getRandomNumber(1200), Greenfoot.getRandomNumber(700), 0)};
    boolean virussen_removed[] = {true, true,true, true, true, true, true, true};
    boolean play = false;
        public DesktopJoran()
    {    
        super(1200, 700, 1); 
        
        addObject(virussen[0], 100, 100);
            addObject(virussen[1], 100, 100);
            addObject(virussen[2], 100, 100);
            addObject(virussen[3], 100, 100);
            addObject(virussen[4], 100, 100);
            addObject(virussen[5], 100, 100);
            addObject(virussen[6], 100, 100);
            addObject(virussen[7], 100, 100);
            addObject(norton, x, y);
            
        
        showText("Remove all of the virusses from your computer",600, 350);
        addObject(textbox1, 100, 100);
        addObject(exit, 100, 100);
        
    }
    
    public void act()
    {
        start();
        move();
        remove();
        end();
    }
    public void start()
    {
        if(exit.click("tap"))
        {
            removeObject(textbox1);
            showText(null, 600, 350);
            removeObject(exit);
            
            play = true;
        }
    }
    
    public void end() 
    {
          if (virussen_removed[0] == false && virussen_removed[1] == false && virussen_removed[2] == false && virussen_removed[3] == false &&
        virussen_removed[4] == false && virussen_removed[0] == false && virussen_removed[5] == false && virussen_removed[6] == false &&
        virussen_removed[7] == false)
        {
            showText("Congrats you have removed all the virusses of of your computer!\n The key for the door is hidden behind the mirror", 600, 350);
            addObject(textbox1, 100, 100);
            showText("Return to room", 600, 450);
            addObject(textbox2, 100, 100);
            if(textbox2.click("tap"))
            {
                Greenfoot.setWorld(RoomJoran.RoomJoran);
            }
        }
    }
    
    public void remove()
    {
           
      
        if (norton.touchingProp(virussen[0]))
        {
            removeObject(virussen[0]);
            virussen_removed[0] = false;
        }
        if (norton.touchingProp(virussen[1]))
        {
            removeObject(virussen[1]);
            virussen_removed[1] = false;
        }
        if (norton.touchingProp(virussen[2]))
        {
            removeObject(virussen[2]);
            virussen_removed[2] = false;
        }
        if (norton.touchingProp(virussen[3]))
        {
            removeObject(virussen[3]);
            virussen_removed[3] = false;
        }
        if (norton.touchingProp(virussen[4]))
        {
            removeObject(virussen[4]);
            virussen_removed[4] = false;
        }
        if (norton.touchingProp(virussen[5]))
        {
            removeObject(virussen[5]);
            virussen_removed[5] = false;
        }
        if (norton.touchingProp(virussen[6]))
        {
            removeObject(virussen[6]);
            virussen_removed[6] = false;
        }
        if (norton.touchingProp(virussen[7]))
        {
            removeObject(virussen[7]);
            virussen_removed[7] = false;
        }
    }
    
    public void move()
    {   
        if ( play == true)
        {
            if (System.currentTimeMillis() - static_time >=100 && Greenfoot.isKeyDown("up"))
            {
             static_time = System.currentTimeMillis();
             norton.locationY -= 20;
            }
            if (System.currentTimeMillis() - static_time >=100 && Greenfoot.isKeyDown("left"))
            {
             static_time = System.currentTimeMillis();
             norton.locationX -= 20;
            }
            if (System.currentTimeMillis() - static_time >=100 && Greenfoot.isKeyDown("down"))
            {
             static_time = System.currentTimeMillis();
             norton.locationY += 20;
            }
            if (System.currentTimeMillis() - static_time >=100 && Greenfoot.isKeyDown("right"))
            {
             static_time = System.currentTimeMillis();
             norton.locationX += 20;
            }
        }
    }
}


     
       
    
                                 
        
    
