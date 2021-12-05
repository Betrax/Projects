import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DesktopJoran here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DesktopJoran extends World
{
    public static World DesktopJoran = new DesktopJoran();
    prop background = new prop("windows.jpg", 169, 270, 600, 350, 0);
    prop win =  new prop ("RoomJoran/win.jpg", 10000, 100000, 100, 100, 0);   
    
    public DesktopJoran()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 700, 1); 
        
        
        addObject(background, 100, 100);
    }
    
    
    public void act()
    {
        guessgame();
    }
    
        String guess = "" ;
        String answer = "Updaten";
        int guess_count = 0; 
        boolean out_of_guesses[] = {true, true, true, true, true, true};
       
    public void guessgame()
    {
          if (out_of_guesses[0] == true)
         {
            while ((guess!= answer) && out_of_guesses[1] == true)
             {
                if (guess_count < 3)
                 {
                     String guess = Greenfoot.ask("Wat is een simpele maar effiecient manier om gehacked te worden te voorkomen? ");
                     guess_count ++;
                 }
                else
                 {
                     out_of_guesses[0] = false;
                     out_of_guesses[1] = false;
                 }
                }
            if (guess == answer)
            {
                Greenfoot.setWorld(RoomJoran.RoomJoran);
            }
        }
            
        if (out_of_guesses[1] == false)
            {
            while ((guess!= answer) && out_of_guesses[2])
             {
                if (guess_count < 6)
                 {
                     guess = Greenfoot.ask("Wat is een simpele maar effiecient manier om gehacked te worden te voorkomen? \n Tip 1: Het inorde houden van apllicaties  " );
                     guess_count ++;
                 }
                else 
                 {
                     out_of_guesses[2] = false;
                 }
                }
            if (guess == answer)
                 {
                     addObject(win, 100, 100);
                 }
                }
                
                 if (out_of_guesses[2] == false)
         {
            while ((guess!= answer) && out_of_guesses[3])
             {
                if (guess_count < 9)
                 {
                     guess = Greenfoot.ask("Wat is een simpele maar effiecient manier om gehacked te worden te voorkomen? \n Tip 1: Het inorde houden van apllicaties \n Tip 2: De eerste letter is U. ");
                     guess_count ++;
                 }
                else 
                 {
                     out_of_guesses[3] = false;
                 }
                }
            if (guess == answer) 
                 {
                     addObject(win, 100, 100);
                 }
        }
        
        if (out_of_guesses[3] == false)
        {
            while (guess!= answer)
            {
                guess = Greenfoot.ask("Wat is een simpele maar effiecient manier om gehacked te worden te voorkomen? \n Tip 1: Het inorde houden van apllicaties \n Tip 2: De eerste letter is U.\n Tip 3: De tweede letter is P:");
            }
            if (guess == answer)
            {
                addObject(win, 100, 100);
                Greenfoot.stop();
            }
        }
    }
    }



     
       
    
                                 
        
    
