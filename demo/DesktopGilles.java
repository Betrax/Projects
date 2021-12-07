import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.JOptionPane;
/**
 * Write a description of class DesktopGilles here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DesktopGilles extends World
{
    public static World DesktopGilles = new DesktopGilles();
    prop power = new prop("icons/power.png", 10, 10, 30, 670, 0);
    prop chrome = new prop("icons/chrome.png", 4, 4, 40, 40, 0);
    prop note = new prop("icons/notepad.png", 12, 12, 110, 40, 0);
    prop file = new prop("icons/file.png", 7, 7, 180, 40, 0);
    prop note_tab = new prop("tabs/notetab.png", 65, 63, 600, 250, 0);
    prop krant = new prop("tabs/krant.jpg", 54, 70, 600, 275, 0);
    prop hack_closed = new prop("tabs/hack_closed.jpg", 130, 98, 600, 275, 0);
    prop hack_open = new prop("tabs/hack_open.jpg", 130, 98, 600, 275, 0);
    public DesktopGilles()
    {    
        super(1200, 700, 1); 
        GreenfootImage background = (new GreenfootImage("windowsedit.jpg"));
        background.scale(getWidth(), getHeight());
        setBackground(background); 
    
        addObject(power, 30, 670);
        addObject(chrome, 40, 40);
        addObject(note, 110, 40);
        addObject(file, 180, 40);
    }
    
    boolean note_open = false;
    boolean chrome_open = false;
    boolean file_open = false;
    boolean password = false;
    public static boolean wifi = false;
    public void act()
    {
        if (power.click("tap"))
        {
            Greenfoot.setWorld(RoomGilles.RoomGilles);
        }
        
        if (chrome.click("tap") && wifi == false)
        {
            JOptionPane.showMessageDialog(null, "No internet connection.");
        }
        if (chrome.click("tap") && wifi == true)
        {
            chrome_open = true;
            if (RoomGilles.door_open == false)
            {   
                addObject(hack_closed, 1, 1);
            }
            else
            {
                addObject(hack_open, 1, 1);
            }
        }
        if (chrome_open && Greenfoot.mouseClicked(DesktopGilles))
        {
            removeObject(hack_closed);
            removeObject(hack_open);
            chrome_open = false;
        }
        if (chrome_open && wifi == true && Greenfoot.isKeyDown("control") && Greenfoot.isKeyDown("d"))
        {
            addObject(hack_open, 1, 1);
            RoomGilles.door_open = true;
            Greenfoot.playSound("unlock.mp3");
        }
        
        if ((note.click("tap")) && (!note_open))
        {
            addObject(note_tab, 1, 1);
            note_open = true;
        }
        if (note_open && Greenfoot.mouseClicked(DesktopGilles))
        {
            removeObject(note_tab);
            note_open = false;
        }
        
        if (file.click("tap") && !password)
        {
            String pass;
            pass = JOptionPane.showInputDialog(null, "ENTER PASSWORD");
            if (pass.toUpperCase().equals("CRASH"))
            {
                JOptionPane.showMessageDialog(null, "CORRECT");
                password = true;
                file_open = true;
                addObject(krant, 1, 1);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "WRONG", "WARNING", JOptionPane.ERROR_MESSAGE);
            }
        }
        if (file.click("tap") && password)
        {
            file_open = true;
            addObject(krant, 1, 1);
        }
        if (file_open && Greenfoot.mouseClicked(DesktopGilles))
        {
            removeObject(krant);
            file_open = false;
        }
    }
}
