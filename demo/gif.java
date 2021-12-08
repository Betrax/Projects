import greenfoot.*;
// USE `gif *WORLD* = new gif(*"path"*);` THEN `setBackground(*WORLD*.draw(scaleX, scaleY));` for
// backgrounds.
// USE `gif *OBJECT* = new gif(*"path"*);` THEN `setImage(*OBJECT*.draw(scaleX, scaleY));` for
// anything else.


// DO NOT CHANGE THIS CLASS! JUST MESSAGE ME! -Oguz
public class gif
{
    GifImage GifImage;
    int X;
    int Y;

    public gif(String file_path)
    {
        this.GifImage = new GifImage(file_path);
        this.X = this.GifImage.getCurrentImage().getWidth();
        this.Y = this.GifImage.getCurrentImage().getHeight();
    }
    
    public GreenfootImage draw(int scaleX, int scaleY)
    {
        int wide = X * scaleX / 100;
        int high = Y * scaleY / 100;
        GifImage.getCurrentImage().scale(wide, high);
        return GifImage.getCurrentImage();
    }
}
