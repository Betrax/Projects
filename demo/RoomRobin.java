import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RoomRobin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

//Deze kamer zeeeeeeeer is work in progress. Alle Gameplay features/de minigame en de meeste props moeten nog komen :) 

public class RoomRobin extends World
{
    public static World RoomRobin = new RoomRobin();

    prop USB = new prop("Robin/USB_Image.png", 8, 8, 800, 410, 100);

    prop Laptop = new prop("Robin/Laptop_Image.png", 6, 6, 557, 430, 100);

    prop emptyBackground = new prop("windows.jpg", 169, 270, 600, 350, 0);

    prop Cross = new prop("Saad/Redcross.png", 2, 2, 1150, 50, 0);
    
    prop ZipFile = new prop ("Robin/ZipFileImage.png", 20,20 ,200 , 75, 0);
    
    prop Taskbar = new prop ("Robin/Taskbar.png", 105,115 , 600 , 685, 0);
    
    prop Pedestal = new prop ("Robin/Pedestal.png",10,10,800,510,0);
    
    String ImageUSB1 = "Robin/USB_Image.png";

    boolean equipped = false;

    public RoomRobin()
    {    
        
        super(1200, 700, 1); 
        GreenfootImage achtergrond = (new GreenfootImage("Robin/roomRobin.jpg"));
        achtergrond.scale(getWidth(), getHeight());
        setBackground(achtergrond);
        addObject(Pedestal,1,1);
        addObject(USB, 1,1);
        addObject(Laptop, 1,1);
        
        
    }

    public void act (){ 
        
       
    
        if (USB.click("tap") && equipped == false) {//USB.animation.file_path == ("Robin/USB_Image.png")) {

            
            USB.animation.image = new GreenfootImage ("Robin/USB_Image2.png");
            equipped = true;
        }

        if (USB.click("tap") && equipped != false);{
            
          USB.animation.image = new GreenfootImage("Robin/USB_Image.png");
           equipped = false;
        }
        
        if (Greenfoot.isKeyDown("enter")) {
            
            USB.locationX = 631;
            USB.locationY = 458;
        }

         if (Laptop.click("tap") && USB.locationX != 631) {
             
            addObject (emptyBackground,1,1);
            addObject (Cross,1,1);
            addObject (Taskbar,1,1); 
            }
        if (Laptop.click("tap") && USB.locationX == 631) {
            addObject (emptyBackground,1,1);
            addObject (Cross,1,1);
            addObject (ZipFile,1,1);
            addObject (Taskbar,1,1);
        }

        if (Cross.click("tap")) {
            removeObject(emptyBackground);
            removeObject(Cross);
            removeObject(ZipFile);
            removeObject (Taskbar);
        }

    }
}

