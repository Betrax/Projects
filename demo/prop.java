import greenfoot.*;

//DO NOT TOUCH THIS! MESSAGE ME -Oguz

public class prop extends Actor
{
    animation animation;
    int scaleX; // has to be between 2 - infinity
    int scaleY; // has to be between 2 - infinity
    int speed; // in milliseconds.
    int locationX; // X location of the object.
    int locationY; // Y location of the object.
    
    
    // Only function you should care about is the constructor here. 
    //Go to the world create an object
    //with the `prop *your object name* = new prop(String file_path, int scaleX, int scaleY, int locationX, int locationY, int speed)`.
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
}