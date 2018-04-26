package prj5;

import CS2114.Shape;
import CS2114.TextShape;

public class GUIGlyph {

    String songTitle;
    String artist;
    int year;
    String genre;
    TextShape title;
    TextShape data;
    Shape pinkHeard;
    Shape pinkLike;
    Shape blueHeard;
    Shape blueLike;
    Shape orangeHeard;
    Shape orangeLike;
    Shape greenHeard;
    Shape greenLike;
    Song song;
    InputScan input;
    int mode;


    public GUIGlyph(
        String songTitle,
        String artist,
        int year,
        String genre,
        Song song,
        InputScan input,
        int modeChecker) {
        
        this.songTitle = songTitle;
        this.artist = artist;
        this.year = year;
        this.genre = genre;
        this.song = song;
        this.input = input;
        mode = modeChecker;
        
    }
    
    public void drawGlyph(Window window, int offsetX, 
        int offsetY, int represent)
    {
        int xValue = 150 + offsetX;
        title = new TextShape(60 + offsetX, 70 + offsetY, songTitle);
        xValue = xValue - title.getWidth()/2;
        title.setX(xValue);
        title.setBackgroundColor(Color.white);
        window.addShape(title);
        

        xValue = 150 + offsetX;
        if (represent == 0)
        {
            data = new TextShape(xValue, 85 + offsetY, artist);
            xValue = xValue - data.getWidth()/2;
            data.setX(xValue);
            data.setBackgroundColor(Color.white);
            window.addShape(data);
        }
        else if (represent == 1)
        {
            data = new TextShape(xValue, 85 + offsetY, year + "");
            xValue = xValue - data.getWidth()/2;
            data.setX(xValue);
            data.setBackgroundColor(Color.white);
            window.addShape(data);
        }
        else if (represent == 2)
        {
            data = new TextShape(xValue, 85 + offsetY, genre);
            xValue = xValue - data.getWidth()/2;
            data.setX(xValue);
            data.setBackgroundColor(Color.white);
            window.addShape(data);
        }
        
        if (mode == -1)
        {
            drawBarsGenre(offsetX, offsetY, window);
        }
        else if (mode == 0)
        {
            drawBarsMajor(offsetX, offsetY, window);
        }
        else if (mode == 1)
        {
            drawBarsRegion(offsetX, offsetY, window);
        }
    }
}
