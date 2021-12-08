import greenfoot.*;
import java.io.*;

// USE `animation *WORLD* = new animation(folder_path);` THEN `setBackground(*WORLD*.draw(scaleX,
// scaleY));` for backgrounds.
// USE `animation *OBJECT* = new animation(folder_path);` THEN `setImage(*OBJECT*.draw(scaleX,
// scaleY));` for anything else.
// Every image inside the folder has to be a png and each file needs to be numbered like: 1.png,
// 2.png, 3.png, ...

// If you directly give the filepath of an image, then you can name it whatever you want.
// Ex: (player/idle/idle.png)


// Don't change anything without me -Oguz
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

        if (file_path.contains("png") || file_path.contains("jpg")) // If the filepath is a directly
                                                                    // to an image
        {
            image = new GreenfootImage(file_path);
            max_frames = 1;
        }
        else // If the filepath is to a folder that contains multiple images
        {

            // idk why but java does not wants to work with greenfoot. So I had to fix the path for
            // it
            java_file_path = (System.getProperty("user.dir") + "/images/" + file_path)
                    .replaceAll("\\\\", "/");
            max_frames = new File(java_file_path).list().length;

            try
            {
                image = new GreenfootImage(file_path + frame + ".png");
            }catch (Exception e)
            {
                image = new GreenfootImage(file_path + "x (" + frame + ").png");
            }
        }

        X = image.getWidth();
        Y = image.getHeight();
    }

    public GreenfootImage draw(int scaleX, int scaleY, int milliseconds)
    {
        if (System.currentTimeMillis() - static_time >= milliseconds && max_frames > 1)
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

            try
            {
                image = new GreenfootImage(file_path + frame + ".png");
            }catch (Exception NoClassDefFoundError)
            {
                image = new GreenfootImage(file_path + "x (" + frame + ").png");
            }
        }
        int wide = X * scaleX / 100;
        int high = Y * scaleY / 100;
        image.scale(wide, high);
        return image;
    }
}
