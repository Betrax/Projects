import greenfoot.*;

public class animation
{    long static_time = System.currentTimeMillis();
    int frame = 1;
    int X;
    int Y;
    String file_path;
    GreenfootImage image;

    public animation(String path)
    {
        file_path = path;
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
}
//test