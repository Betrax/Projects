import greenfoot.*;

// Om een object te creeren:
// prop *OBJECT_NAAM* = new prop(String file_path, int scaleX, int scaleY, int locationX, int
// locationY, int speed);

// Hierachter kan elke waarde met `*OBJECT_NAAM*.` geaccesed worden.
// Er is ook nog de click(String soort_click) functie, die als argument de soort click nodig heeft,
// geef het aan met "tap" of "hold". De namen van de argumenten spreken voorzich.


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
    gif gif;
    String path;
    // Only function you should care about is the constructor here.
    // Go to the world create an object
    // with the `prop *your object name* = new prop(String file_path, int scaleX, int scaleY, int
    // locationX, int locationY, int speed)`.
    public prop(String file_path, int scaleX, int scaleY, int locationX, int locationY, int speed)
    {
        this.path = file_path;
        if (file_path.contains(".gif"))
        {
            this.gif = new gif(path);
        }
        else
        {
            this.animation = new animation(path);
        }
        
        this.scaleX = scaleX;
        this.scaleY = scaleY;
        this.speed = speed;
        this.locationX = locationX;
        this.locationY = locationY;
    }


    public void act()
    {
        setLocation(locationX, locationY);
        if (path.contains(".gif"))
        {
            setImage(gif.draw(scaleX, scaleY));
        }
        else
        {
            setImage(animation.draw(scaleX, scaleY, speed));
        }
    }

    boolean hold;
    

    public boolean click(String soort_click)
    {
        //only return 1 true statement, after you press the mouse. It requires another click to work.
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
        // Continues to return true as long as you hold the button.
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
    
    
    // checks if your prop is touching another prop.
    // Use it in act(){}, like this: if(MYPROP.touching()){}
    public boolean touching(prop prop)
    {
       return isTouching(prop.class);
    }
    
    // checks if your prop is touching a specific prop.
    // Use it in act(){}, like this: if(MYPROP.touchingProp(TARGETPROPNAME)){}
    public boolean touchingProp(prop prop)
    {
       return intersects(prop);
    }
}
