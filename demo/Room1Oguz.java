import greenfoot.*;

public class Room1Oguz extends World
{
    // I like to keep all my variables directly inside my world so they never undergo the risk of
    // being edited in a shared document.
    public static World Room1Oguz = new Room1Oguz();

    prop background = new prop("Oguz/intro/2room red/", 63, 63, 1200 / 2, 700 / 2, 42);
    prop pc = new prop("Oguz/trans.png", 300, 200, 550, 700 / 2, 42);
    prop power_button = new prop("Oguz/trans.png", 15, 15, 775, 173, 100);
    prop arrow = new prop("Oguz/arrow.gif", 15, 15, 775, 173, 1);
    prop door = new prop("Oguz/trans.png", 200, 400, 830, 340, 100);
    prop congrats = new prop("Oguz/congrats.png", 50, 50, 1200 / 2 - 50, 700 / 2 + 200, 42);
    prop blackbar = new prop("Oguz/blackbar.png", 50, 50, 1200 / 2 + 100, 700 / 2 + 200, 42);
    prop tutorial = new prop("Oguz/tutorial.png", 50, 50, 1200 / 2, 700 / 2 + 200, 42);
    prop continue1 = new prop("Oguz/CONTINUE.png", 50, 50, 1200 / 2 + 340, 700 / 2 + 250, 42);
    // left 250 - right 510
    prop virus = new prop("Oguz/game/virus.png", 5, 5, 370, 500, 1);
    prop shield = new prop("Oguz/game/shield.png", 10, 10, 510, 460, 1);

    int score = 0;
    time delay[] = new time[50];

    boolean[] switches =
    {true, false, false, false, false, true, true, true, false, true, true, false};
    prop mobs[] = new prop[50];
    int startval = -1;
    int mobspeed = 1;



    public Room1Oguz()
    {
        super(1200, 700, 1);
        addObject(background, 0, 0);
        addObject(pc, 0, 0);
    }

    public void act()
    {
        delayArray();
        // These are all animations that need to happen to fake that 3D effect, each animation is
        // prebaked
        if (pc.click("tap"))
        {
            background.animation.frame = 1;
            bgchange("Oguz/intro/3zoom in/");
            removeObject(pc);

            switches[1] = true;
        }
        if (background.animation.frame == 15 && switches[1])
        {
            bgchange("Oguz/intro/4idle red/");

            switches[1] = false;
            switches[2] = true;

            addOb(tutorial);
            addOb(continue1);
        }
        if (switches[2])
        {
            if (delay[48].d(100) && switches[7])
            {
                continue1.locationY += 3;
                if (continue1.locationY >= 700 / 2 + 250 + 10)
                {
                    switches[7] = false;
                    switches[8] = true;
                }
            }

            if (delay[47].d(100) && switches[8])
            {
                continue1.locationY -= 3;

                if (continue1.locationY <= 700 / 2 + 250 - 10)
                {
                    switches[7] = true;
                    switches[8] = false;
                }
            }

            if (continue1.click("tap"))
            {
                removeObject(tutorial);
                removeObject(continue1);
                arrow.locationX = 730;
                addOb(arrow);
                addOb(power_button);
            }
        }
        if (power_button.click("tap") && switches[2])
        {
            switches[2] = false;
            switches[3] = true;
            removeObject(power_button);
            removeObject(arrow);
        }
        // Screen is on
        if (switches[3])
        {
            screen();
        }
        if (power_button.click("tap")
                && background.animation.file_path == "Oguz/intro/5idle green/")
        {
            removeObject(power_button);
            removeObject(arrow);
            remove(mobs);
            removeObject(virus);
            switches[3] = false;
            showText("", 510, 290);
            bgchange("Oguz/intro/6zoom out/");

            switches[4] = true;
        }
        if (switches[4] && background.animation.frame == 15)
        {
            bgchange("Oguz/intro/7room green/");
        }
        if (switches[4])
        {
            continue1.locationX = 1200 / 2 + 350 + 150;
            addOb(blackbar);
            addOb(congrats);
            addOb(continue1);
            if (delay[48].d(100) && switches[10])
            {
                continue1.locationY += 3;
                if (continue1.locationY >= 700 / 2 + 250 + 10)
                {
                    switches[10] = false;
                    switches[11] = true;
                }
            }

            if (delay[47].d(100) && switches[11])
            {
                continue1.locationY -= 3;

                if (continue1.locationY <= 700 / 2 + 250 - 10)
                {
                    switches[10] = true;
                    switches[11] = false;
                }
            }

            if (continue1.click("tap"))
            {
                removeObject(tutorial);
                removeObject(continue1);
                addOb(power_button);
                arrow.locationX = 740;
                arrow.locationY = 240;
                addOb(arrow);
                addOb(door);
                removeObject(continue1);
                removeObject(congrats);
                removeObject(blackbar);
                switches[4] = false;
            }
        }
        if (door.click("tap"))
        {
            start_screen.backgroundMusic.stop();
            Greenfoot.setWorld(new RoomJoran());
        }
    }

    public void screen()
    {
        addOb(virus);
        int virusSpeed = 2;
        if (Greenfoot.isKeyDown("up") && delay[0].d(15) && virus.locationY >= 290)
        {
            virus.locationY -= virusSpeed;
        }
        if (Greenfoot.isKeyDown("down") && delay[1].d(15) && virus.locationY <= 500)
        {
            virus.locationY += virusSpeed;
        }
        if (Greenfoot.isKeyDown("left") && delay[2].d(15) && virus.locationX >= 250)
        {
            virus.locationX -= virusSpeed + 1;
        }
        if (Greenfoot.isKeyDown("right") && delay[3].d(15) && virus.locationX <= 510)
        {
            virus.locationX += virusSpeed + 1;
        }
        if (virus.locationY <= 290)
        {
            virus.locationY = 500;
            score += 1;
            remove(mobs);
        }
        String s = String.valueOf(score);
        showText(s, 510, 290);
        levelf(shield, score);
        if (score >= 6 && switches[9])
        {
            switches[9] = false;
            addOb(arrow);
            addOb(power_button);
            background.animation.file_path = "Oguz/intro/5idle green/";
        }
    }

    public void levelf(prop shield, int amount)
    {
        if (amount != startval)
        {
            startval = amount;
            for (int i = 0; i < amount; i++)
            {
                int X = getRandomNumber(250, 510);
                int Y = getRandomNumber(290, 470);
                mobs[i] = new prop("Oguz/game/shield.png", 12, 12, X, Y, 1);
            }
            add(mobs, amount);
        }
        for (int i = 0; i < amount; i++)
        {
            if (delay[i + 4].d(10) && mobs[i].locationX >= 250)
            {
                mobs[i].locationX -= mobspeed;
            }
            else if (mobs[i].locationX <= 250)
            {
                mobs[i].locationX = 510;
                mobs[i].locationY = getRandomNumber(290, 470);
                mobspeed = getRandomNumber(1, 2);
            }
            if (virus.touchingProp(mobs[i]))
            {
                virus.locationY = 500;
            }
        }
    }

    public void delayArray()
    {
        if (switches[6])
        {
            for (int i = 0; i < 50; i++)
            {
                delay[i] = new time();
            }
            switches[6] = false;
        }
    }

    public void add(prop array[], int amount)
    {
        for (int i = 0; i != amount; i++)
        {
            addObject(array[i], 1, 1);
        }
    }

    public int getRandomNumber(int start, int end)
    {
        int normal = Greenfoot.getRandomNumber(end - start + 1);
        return normal + start;
    }

    public void addOb(prop prop)
    {
        addObject(prop, 1, 1);
    }

    public void remove(prop array[])
    {
        for (int i = 0; i != array.length; i++)
        {
            removeObject(array[i]);
        }
    }

    public void bgchange(String path)
    {
        background.animation.frame = 1; // gota make sure that the animation does not just skip at
                                        // such a fundemental transition
        background.animation.file_path = path;
    }
}
