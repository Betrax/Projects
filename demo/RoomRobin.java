import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RoomRobin here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */


public class RoomRobin extends World
{
    public static World RoomRobin = new RoomRobin();

    prop USB = new prop("Robin/USB_Image.png", 8, 8, 800, 410, 0);

    prop Laptop = new prop("Robin/Laptop_Image.png", 6, 6, 557, 430, 0);

    prop emptyBackground = new prop("windows.jpg", 170, 270, 600, 350, 0);

    prop Cross = new prop("Robin/ExitCross.png", 3, 3, 1170, 30, 0);

    prop Cross2 = new prop("Robin/ExitCross.png", 3, 3, 950, 275, 0);

    prop Cross3 = new prop("Robin/ExitCross.png", 3, 3, 950, 275, 0);

    prop ZipFile = new prop("Robin/ZipFileImage.png", 20, 20, 200, 75, 0);

    prop Taskbar = new prop("Robin/Taskbar.png", 105, 115, 600, 685, 0);

    prop Pedestal = new prop("Robin/Pedestal.png", 10, 10, 800, 510, 0);

    prop Blusser = new prop("Robin/Blusser.png", 60, 60, 120, 570, 0);

    prop Alert = new prop("Robin/HelpExclMark.png", 10, 10, 75, 30, 0);

    prop Arrow = new prop("Robin/Arrow.gif", 15, 15, 130, 30, 0);

    prop ExplanationBox = new prop("Robin/TextBox.png", 100, 70, 600, 355, 0);

    prop ExplanationBox2 = new prop("Robin/TextBox.png", 150, 30, 625, 350, 0);

    prop ExplanationBox3 = new prop("Robin/TextBox.png", 60, 10, 800, 300, 0);

    prop NextBox = new prop("Robin/TextBox.png", 15, 7, 600, 500, 0);

    prop CircuitBackground = new prop("Robin/Circuit.jpg", 100, 100, 600, 350, 0);

    prop Defender = new prop("Robin/Defender.png", 15, 15, 100, 650, 0);

    prop Electricity = new prop("Robin/Electricity.gif", 15, 15, 1, 1, 0);

    prop Code = new prop("Robin/Code.gif", 5, 5, 125, 0, 0);

    prop Fire = new prop("Robin/Fire.gif", 40, 30, Laptop.locationX, Laptop.locationY - 10, 0);

    prop Blus = new prop("Robin/Smoke.gif", 50, 50, 600, Blusser.locationY - 100, 0);



    private String text1 = "In this room you can interact with objects by cliking on them";
    private String text2 = "To start, please interact with the laptop";
    private String text3 = "You can always come back here for tips";

    int Score = 0;
    int Playable = 0;
    boolean CanShoot = true;
    boolean CanSpawn = true;

    time delay[] =
    {new time(), new time(), new time()};

    public RoomRobin()
    {

        super(1200, 700, 1);
        GreenfootImage achtergrond = (new GreenfootImage("Robin/roomRobin.jpg"));
        achtergrond.scale(getWidth(), getHeight());
        setBackground(achtergrond);
        addObject(Pedestal, 1, 1);
        addObject(USB, 1, 1);
        addObject(Laptop, 1, 1);
        addObject(Blusser, 1, 1);
        addObject(Alert, 1, 1);
        addObject(Arrow, 1, 1);
        Arrow.setRotation(90);

    }

    public void act()
    {
        if (Alert.click("tap"))
        {

            addObject(ExplanationBox, 1, 1);
            addObject(Cross2, 1, 1);
            showText(text1, 600, 340);
            showText(text2, 600, 380);
            showText(text3, 595, 420);
            removeObject(Arrow);

            if (Playable == 7)
            {

                showText("Next Room", 600, 500);
                addObject(NextBox, 1, 1);
                removeObject(Cross2);
            }
        }

        if (Cross2.click("tap"))
        {

            removeObject(ExplanationBox);
            showText(null, 600, 340);
            showText(null, 600, 380);
            showText(null, 595, 420);
            removeObject(Cross2);
            if (Playable == 0)
            {
                Playable = 1;
            }
        }

        if (Playable != 0)

        {
            if (USB.click("tap") && USB.locationX != 631)
            {
                USB.animation.image = new GreenfootImage("Robin/USB_Image2.png");
                showText("Press enter to instert the USB into the Laptop", 800, 300);
                addObject(ExplanationBox3, 1, 1);
                Playable = 2;
            }

            if (Greenfoot.isKeyDown("enter") && Playable == 2)
            {
                USB.locationX = 631;
                USB.locationY = 456;
                text1 = "Interact with the zip file in the Laptop!";
                text2 = null;
                showText(null, 800, 300);
                removeObject(ExplanationBox3);
                Playable = 3;
            }

            if (Laptop.click("tap") && USB.locationX != 631)
            {

                addObject(emptyBackground, 1, 1);
                addObject(Cross, 1, 1);
                addObject(Taskbar, 1, 1);
                addObject(ExplanationBox2, 1, 1);
                showText(
                        "There appears to be nothing much to see here yet, look for other interactible objects in the room!",
                        600, 350);
                showText(null, 800, 300);
                text1 = "Look for interactible objects in the room and click on them!";
                text2 = null;
                removeObject(ExplanationBox3);
            }
            if (Laptop.click("tap") && USB.locationX == 631)
            {
                addObject(emptyBackground, 1, 1);
                addObject(Cross, 1, 1);
                addObject(Taskbar, 1, 1);
                addObject(ZipFile, 1, 1);


            }

            if (Cross.click("tap"))
            {
                removeObject(emptyBackground);
                removeObject(ZipFile);
                removeObject(Taskbar);
                removeObject(ExplanationBox2);
                showText(null, 600, 350);
                removeObject(Cross);

                if (Playable == 2)
                {

                    showText("Press enter to instert the USB into the Laptop", 800, 300);
                    addObject(ExplanationBox3, 1, 1);

                }


            }
            if (ZipFile.click("tap") && Playable == 3)
            {

                addObject(CircuitBackground, 1, 1);
                addObject(Defender, 1, 1);
                addObject(ExplanationBox, 1, 1);
                showText("The file contained malware!", 600, 290);
                showText("electrical systems in your motherboard are now shutting down", 600, 330);
                showText("your only hope is to turn them back on yourself", 600, 370);
                showText("press the spacebar to shoot", 600, 450);
                showText("press the up and down keys to move", 600, 480);
                addObject(Cross3, 1, 1);
                removeObject(emptyBackground);
                removeObject(ZipFile);
                removeObject(Taskbar);
                removeObject(Cross);
            }


            if (Cross3.click("tap"))
            {

                removeObject(ExplanationBox);
                showText(null, 600, 290);
                showText(null, 600, 330);
                showText(null, 600, 370);
                showText(null, 600, 450);
                showText(null, 600, 480);
                removeObject(Cross3);
                Playable = 4;
            }


            if (Playable == 4)
            {
                if (Greenfoot.isKeyDown("down") && Defender.locationY < 700 && delay[0].d(10))
                {

                    Defender.locationY = Defender.locationY + 3;
                }
                if (Greenfoot.isKeyDown("up") && Defender.locationY > 0 && delay[1].d(10))
                {

                    Defender.locationY = Defender.locationY - 3;
                }

                showText("Score: " + Score + "/5", 1100, 50);
                if (CanSpawn == true && Score <= 4)
                {

                    addObject(Electricity, 1, 1);
                    Electricity.locationX = Greenfoot.getRandomNumber(800) + 300;
                    Electricity.locationY = Greenfoot.getRandomNumber(650) + 25;
                    CanSpawn = false;
                }

                if (CanShoot == true && Greenfoot.isKeyDown("space"))
                {
                    addObject(Code, 1, 1);
                    Code.locationY = Defender.locationY;
                    Code.locationX = Defender.locationX + 30;
                    CanShoot = false;
                }
                if (CanShoot == false && delay[2].d(2))
                {

                    Code.locationX = Code.locationX + 2;
                    if (Code.locationX >= 1200)
                    {

                        removeObject(Code);
                        CanShoot = true;
                    }
                    if (Code.locationX >= Electricity.locationX - 5
                            && Code.locationX <= Electricity.locationX + 5
                            && Code.locationY >= Electricity.locationY - 25
                            && Code.locationY <= Electricity.locationY + 45)
                    {

                        removeObject(Code);
                        removeObject(Electricity);
                        CanShoot = true;
                        CanSpawn = true;
                        Score = Score + 1;
                    }
                }
                if (Score == 5 || Score == 6)
                {

                    CanShoot = false;
                    CanSpawn = false;
                    showText(null, 1100, 50);

                    addObject(ExplanationBox, 1, 1);
                    showText("Congrats! You managed to save most of the components!", 600, 330);
                    showText("but it seems your cooling system wasn't one of them...", 600, 390);
                    addObject(Cross3, 1, 1);
                    Playable = 5;
                }
                if (Cross3.click("tap") && Score != 0)
                {

                    showText(null, 600, 330);
                    showText(null, 600, 390);
                    removeObject(ExplanationBox);
                    removeObject(Cross3);
                    removeObject(Defender);
                    removeObject(CircuitBackground);
                    addObject(Fire, 1, 1);
                    text1 = "Use the fire extinguisher!";
                }


            }
            if (Playable == 5)
            {

                if (Blusser.click("tap"))
                {

                    Blusser.locationX = 705;
                    Blusser.locationY = 510;
                    addObject(Blus, 1, 1);
                    Blus.setRotation(180);
                    Blus.locationX = Fire.locationX;
                    Blus.locationY = Fire.locationY + 25;
                    removeObject(Fire);
                    addObject(Arrow, 1, 1);
                    text1 = "Remember: when in doubt of the source of a file you should not open it!";
                    text2 = "Malicious code can be hidden in almost any type of file";
                    text3 = "Not only malware, but ransomware, virusses, worms, trojans, etc... can be hidden";

                    Playable = 7;
                }
            }

        }
        if (NextBox.click("tap"))
        {
            Greenfoot.setWorld(new Room4saad());
        }
    }
}


