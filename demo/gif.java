import greenfoot.*;

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
    
    public GreenfootImage draw(int x, int y)
    {
        int wide = X * x / 100;
        int high = Y * y / 100;
        GifImage.getCurrentImage().scale(wide, high);
        return GifImage.getCurrentImage();
    }
}
<<<<<<< HEAD




//test1
=======
//test2
//test1
>>>>>>> 2a9c7550c4d78f88466d5db80566cccdfb1da6c3
