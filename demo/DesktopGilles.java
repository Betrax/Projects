import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DesktopGilles here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DesktopGilles extends World
{
    prop chrome = new prop("chrome.jpg", 80, 80, 10, 10, 0);
    
    public DesktopGilles()
    {    
        super(710, 444, 1); 
        GreenfootImage background = (new GreenfootImage("windows.jpg"));
        background.scale(getWidth(), getHeight());
        setBackground(background); 
    
        addObject(chrome, 10, 10);
    }
}
