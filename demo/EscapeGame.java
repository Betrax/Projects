import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EscapeGame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EscapeGame extends World
{
    public static final int RESOLUTION = 1;
    public static final int WIDTH = 1200;
    public static final int HEIGHT = 700;

    public static BaseRoom room1; //onthoudt de rooms
    public static BaseRoom room2;
    public static BaseRoom myworld1;
    private BaseRoom currentRoom; //de huidige room
    public EscapeGame()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(WIDTH / RESOLUTION, HEIGHT / RESOLUTION, RESOLUTION);
        //initialiseer de kamers   
        room1 = new Room1(this); //geeft EscapeGame mee
        room2 = new Room2(this);
        myworld1 = new MyWorld(this);
        SetRoom(room1);

       
    }

    private void SetRoom(BaseRoom room)
    {
        currentRoom = room;
        Greenfoot.setWorld(room);
    }

    public void NextRoom()
    {
        if (currentRoom == myworld1) {
            
            SetRoom(room1);
            
        }
        else if(currentRoom == room1)
        {
            SetRoom(room2);
           
        }
       
        else
        {
            SetRoom(room1);
        }
    }
}
