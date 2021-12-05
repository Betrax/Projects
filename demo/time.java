import greenfoot.*;
import java.io.*;

// Use it like this:
// first create a time-class variable like you create any variable: time delay0 = new time()
// Then inside act(): if(delay0.d(int millisecs)) {YOUR CODE;}
// For each time you want to reuse this delay, you will have to create another variable for it, ex: delay0, delay1, delay2, ...

public class time  
{
    long static_time = System.currentTimeMillis(); // This var needs to be fresh on the init for each new line I use it on. So for each new line I generate a variable for it.
    
    public boolean d(int millisecs)
    {
        if(System.currentTimeMillis() - static_time >= millisecs)
        {
            static_time = System.currentTimeMillis();
            return true;
        }
        else
        {
            return false;
        }
    }
}
