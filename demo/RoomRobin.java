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

    prop emptyBackground = new prop("windows.jpg", 170, 270, 600, 350, 0);

    prop Cross = new prop("Robin/ExitCross.png", 3, 3, 1170, 30, 0);

    prop Cross2 = new prop ("Robin/ExitCross.png", 3, 3, 950, 275, 0);

    prop ZipFile = new prop ("Robin/ZipFileImage.png", 20,20 ,200 , 75, 100);

    prop Taskbar = new prop ("Robin/Taskbar.png", 105,115 , 600 , 685, 0);

    prop Pedestal = new prop ("Robin/Pedestal.png",10,10,800,510,0);

    prop Blusser = new prop ("Robin/Blusser.png",35,35,120,570,0);

    prop Alert = new prop ("Robin/HelpExclMark.png",10,10,75,30,0);

    prop Arrow = new prop ("Robin/Arrow.gif",15,15,130,30,0);

    prop ExplanationBox = new prop ("Robin/TextBox.png",100,70,600,355,0);

    prop ExplanationBox2 = new prop ("Robin/TextBox.png",150,30,625,350,0);

    prop ExplanationBox3 = new prop ("Robin/TextBox.png",60,10,800,300,0);

    time delay0 = new time();

    private String text1 = "In this room you can interact with objects by simply cliking on them";
    private String text2 = "To start, please interact with the laptop";
    private String text3 = "You can always come back here for tips";

    int Playable = 0;

    public RoomRobin()
    {    

        super(1200, 700, 1); 
        GreenfootImage achtergrond = (new GreenfootImage("Robin/roomRobin.jpg"));
        achtergrond.scale(getWidth(), getHeight());
        setBackground(achtergrond);
        addObject(Pedestal,1,1);
        addObject(USB, 1,1);
        addObject(Laptop, 1,1);
        addObject(Blusser,1,1);
        addObject (Alert,1,1);
        addObject (Arrow,1,1);
        Arrow.setRotation (90);

    }

    public void act (){

        if (Alert.click("tap")) {

            addObject(ExplanationBox,1,1);
            addObject(Cross2,1,1);
            showText(text1,600,340);
            showText(text2,600,380);
            showText(text3,600,420);
            removeObject (Arrow);
        }

        if (Cross2.click("tap")){

            removeObject (ExplanationBox);
            showText(null,600,340);
            showText(null,600,380);
            showText(null,600,420);
            removeObject(Cross2);
            Playable = 1;
        }

        if (Playable != 0)

        {
            if (USB.click("tap") && USB.locationX != 631) {
                USB.animation.image = new GreenfootImage ("Robin/USB_Image2.png");
                showText("Press enter to instert the USB into the Laptop", 800, 300);
                addObject(ExplanationBox3,1,1);
                Playable = 2;
            }

            if (Greenfoot.isKeyDown("enter") && Playable == 2) {
                USB.locationX = 631;
                USB.locationY = 456;
                text1 = "Interact with the zip file in the Laptop!";
                text2 = null;
                showText(null,800,300);
                removeObject(ExplanationBox3);
                Playable = 3;
            }

            if (Laptop.click("tap") && USB.locationX != 631) {

                addObject (emptyBackground,1,1);
                addObject (Cross,1,1);
                addObject (Taskbar,1,1); 
                addObject(ExplanationBox2,1,1);
                showText("There appears to be nothing much to see here yet, look for other interactible objects in the room!",600,350);
                showText(null,800,300);
                text1 = "Look for interactible objects in the room and click on them!";
                text2 = null;
                removeObject(ExplanationBox3);
            }
            if (Laptop.click("tap") && USB.locationX == 631) {
                addObject (emptyBackground,1,1);
                addObject (Cross,1,1);
                addObject (Taskbar,1,1);
                addObject (ZipFile,1,1);
                

            }

            if (Cross.click("tap")) {
                removeObject(emptyBackground);
                removeObject(ZipFile);
                removeObject(Taskbar);
                removeObject(ExplanationBox2); 
                showText(null,600,350);
                removeObject(Cross);
                
                if (Playable == 2) {
                    
                showText("Press enter to instert the USB into the Laptop", 800, 300);
                addObject(ExplanationBox3,1,1);
                    
                }
                
                
            }
            if (ZipFile.click("tap")) {
                
                
                
            }
                
            }
        }
        }

