import greenfoot.*;

//Om een object te creeren:
//prop *OBJECT_NAAM* = new prop(String file_path, int scaleX, int scaleY, int locationX, int locationY, int speed);

//Hierachter kan elke waarde met `*OBJECT_NAAM*.` geaccesed worden.
//Er is ook nog de click(String soort_click) functie, die als argument de soort click nodig heeft, geef het aan met "tap" of "hold". De namen van de argumenten spreken voorzich.


// DO NOT TOUCH THIS! MESSAGE ME -Oguz

public class prop extends Actor
{
    animation animation;
    int scaleX; // has to be between 2 - infinity
    int scaleY; // has to be between 2 - infinity
    int speed; // in milliseconds.
    int locationX; // X location of the object.
    int locationY; // Y location of the object.
    boolean click = false;
    // Only function you should care about is the constructor here.
    // Go to the world create an object
    // with the `prop *your object name* = new prop(String file_path, int scaleX, int scaleY, int
    // locationX, int locationY, int speed)`.
    public prop(String file_path, int scaleX, int scaleY, int locationX, int locationY, int speed)
    {
        this.animation = new animation(file_path);
        this.scaleX = scaleX;
        this.scaleY = scaleY;
        this.speed = speed;
        this.locationX = locationX;
        this.locationY = locationY;
    }


    public void act()
    {
        setLocation(locationX, locationY);
        
        setImage(animation.draw(scaleX, scaleY, speed));
    }

    boolean hold;

    public boolean click(String soort_click)
    {
        if (soort_click == "tap")
        {
            if (Greenfoot.mousePressed(this))
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        // Alles in 1 keer uitvoeren vraagt voor minder tijd en synced beter, DUS OPERATORS ZIJN NODIG EN NIET VERANDEREN!
        else if (soort_click == "hold")
        {
            if (Greenfoot.mousePressed(this)
                    || (this.click == true && Greenfoot.mouseClicked(null) == false))
            {
                return this.click = true;
            }
            else
            {
                return this.click = false;
            }
        }
        
        return false;
    }

    // Greenfoot is echt een slechte game engine
    public void click_killswitch()
    {
        this.click = false;
    }
}
