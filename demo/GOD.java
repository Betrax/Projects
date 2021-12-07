import greenfoot.*;

// God zal elke kamer bevatten. Als je een kamer wilt toevegen, creer eerst voor uw kamer een klasse
// die de `World` klass extend.
// Gebruik daarachter`public static World *kamer_naam* = new RoomX()` om die kamer globaal
// beschikbaar te stellen.
// Rooms mogen GEEN gamemechanics codes bevatten.


public class GOD extends World
{

    public GOD()
    {
        super(1200, 700, 1);
                                                       // changes the room to the cooresponding room
                                                       // that is given as an argument. Use the same
                                                       // function with different rooms to switch
                                                       // between them.
                                                    
                                                       
        Greenfoot.setWorld(RoomRobin.RoomRobin);                                               
                                                       
                                                    /* Copy paste instead of retyping every time :)
                                                     * RoomRobin.RoomRobin
                                                     * Room4saad.Room4saad
                                                     * DesktopJoran.DesktopJoran
                                                     * DesktopGilles.DesktopGilles
                                                     * RoomPlaceholder.RoomPlaceholder
                                                     * Room1Oguz.Room1Oguz
                                                     * RoomGilles.RoomGilles
                                                     * RoomJoran.RoomJoran
                                                     * start_screen.start_screen
                                                     * 
                                                     */
    }
    
}
