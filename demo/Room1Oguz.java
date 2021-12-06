import greenfoot.*; 
public class Room1Oguz extends World
{
    // I like to keep all my variables directly inside my world so they never undergo the risk of being edited in a shared document.
    public static World Room1Oguz = new Room1Oguz();
    prop background = new prop("Oguz/intro/2room red/", 63, 63, 1200/2, 700/2, 42);
    prop pc = new prop("Oguz/trans.png", 300, 200, 550, 700/2, 42);
    prop power_button = new prop("Oguz/filled.png", 15, 15, 775, 173, 100);
    
    // to time the animations
    boolean[] switches = {true, false, false, false, false};
    
    public Room1Oguz()
    {
        super(1200, 700, 1); 
        addObject(background, 0, 0);
        addObject(pc, 0, 0);
    }
    
    public void act()
    {
        background();
    }
    
    public void screen()
    {
        
    }
    
    public void background()
    {
        // These are all animations that need to happen to fake that 3D effect, each animation is prebaked
        if (pc.click("tap") && switches[0])
        {
            background.animation = new animation("Oguz/intro/3zoom in/");
            removeObject(pc);
            
            switches[0] = false;
            switches[1] = true;
        }
        if (background.animation.frame == 15 && switches[1])
        {
            addObject(power_button, 0, 0);
            background.animation = new animation("Oguz/intro/4idle red/");
            
            switches[1] = false;
            switches[2] = true;
        }
        if(switches[1])
        {
            removeObject(power_button);
        }
        if (power_button.click("tap") && switches[2])
        {
           background.animation = new animation("Oguz/intro/5idle green/");
           
           switches[2] = false;
           switches[3] = true;
        }
        if(background.animation.file_path == "Oguz/intro/5idle green/" && background.animation.frame == 15 &&switches[3])
        {
            background.animation = new animation("Oguz/intro/6zoom out/");
            
            switches[3] = false;
            switches[4] = true;
        }
        if(switches[4] &&  background.animation.frame == 15)
        {
            background.animation = new animation("Oguz/intro/7room green/");
        }
    }
}
