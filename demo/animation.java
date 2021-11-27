import greenfoot.*;
import java.io.*;

// DO NOT TOUCH ANYTHING INSIDE HERE! JUST MESSAGE ME! -Oguz

// USE `animation *WORLD* = new animation(file_path);` THEN `setBackground(*WORLD*.draw(scaleX,
// scaleY));` for backgrounds.
// USE `animation *OBJECT* = new animation(file_path);` THEN `setImage(*OBJECT*.draw(scaleX,
// scaleY));` for anything else.

public class animation
{
    long static_time = System.currentTimeMillis();
    int frame = 1;
    int X;
    int Y;
    String file_path;
    GreenfootImage image;
    int max_frames;

    String java_file_path;

    public animation(String path)
    {
        file_path = path;

        // idk why but java does not wants to work with greenfoot. So I had to fix the path for it
        java_file_path =
                (System.getProperty("user.dir") + "/images/" + file_path).replaceAll("\\\\", "/");
        max_frames = new File(java_file_path).list().length;

        image = new GreenfootImage(file_path + frame + ".png");
        X = image.getWidth();
        Y = image.getHeight();

    }

    public GreenfootImage draw(int scaleX, int scaleY, int milliseconds)
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

            int wide = X * scaleX / 100;
            int high = Y * scaleY / 100;
            image.scale(wide, high);
            return image;
        }
        else
        {
            return image;
        }
    }
}
