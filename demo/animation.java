import greenfoot.*;

public class animation
{
    long static_time = System.currentTimeMillis();
    String file_path;
    int frame = 1; //test 
    int X;
    int Y;
    GreenfootImage image;

    public animation(String path)
    {
        file_path = path; // AOPSHDOIASHOASD
        image = new GreenfootImage(file_path + frame + ".png");
        X = image.getWidth();
        Y = image.getHeight();
    }

    public GreenfootImage draw(int x, int y, int max_frames, int milliseconds)
    {
        if (System.currentTimeMillis() - static_time >= milliseconds)
        {
            static_time = System.currentTimeMillis();

            if (frame < max_frames)
            {
                frame++;
            }
            else
            {
                frame = 1;
            }

            image = new GreenfootImage(file_path + frame + ".png");

            int wide = X * x / 100;
            int high = Y * y / 100;
            image.scale(wide, high);
            return image;
        }
        else
        {
            return image;
        }
    }

    static void better_delay(int milliseconds)
    {
        if (System.currentTimeMillis() - static_time >= milliseconds) // er is hier een fout
        {
            
        }
    }
    {
    }
    
}
