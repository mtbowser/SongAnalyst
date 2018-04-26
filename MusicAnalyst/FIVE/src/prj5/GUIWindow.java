package prj5;

import java.awt.Color;
import CS2114.Button;
import CS2114.Shape;
import CS2114.TextShape;
import CS2114.Window;
import CS2114.WindowSide;

public class GUIWindow
{
    private Button    prevButton;
    private Button    nextButton;
    private Button    hobbyButton;
    private Button    regionButton;
    private Button    majorButton;
    private Button    artistButton;
    private Button    titleButton;
    private Button    yearButton;
    private Button    genreButton;
    private Button    quitButton;
    private Window    window;

    private Shape     line;
    private Shape     row1Right;
    private Shape     row2Right;
    private Shape     row3Right;
    private Shape     row4Right;
    private Shape     row1Left;
    private Shape     row2Left;
    private Shape     row3Left;
    private Shape     row4Left;

    private TextShape text;

    private Shape     lineTop;
    private Shape     lineBottom;
    private Shape     lineLeft;
    private Shape     lineRight;
    private Shape     lineLeg;

    private TextShape textLegend;
    private TextShape major1;
    private TextShape major2;
    private TextShape major3;
    private TextShape major4;
    private TextShape songTitle;
    private TextShape heard;
    private TextShape likes;


    public GUIWindow()
    {

        window = new Window("GUIWindow");
        this.prevButton = new Button("<Previous");
        this.nextButton = new Button("Next>");
        this.hobbyButton = new Button("Represent Hobby");
        this.regionButton = new Button("Represent Region");
        this.majorButton = new Button("Represent Major");
        this.artistButton = new Button("Sort By Artist");
        this.titleButton = new Button("Sort By Title");
        this.yearButton = new Button("Sort By Year");
        this.genreButton = new Button("Sort By Genre");
        this.quitButton = new Button("Quit");

        window.addButton(prevButton, WindowSide.NORTH);
        window.addButton(artistButton, WindowSide.NORTH);
        window.addButton(titleButton, WindowSide.NORTH);
        window.addButton(yearButton, WindowSide.NORTH);
        window.addButton(genreButton, WindowSide.NORTH);
        window.addButton(nextButton, WindowSide.NORTH);

        window.addButton(hobbyButton, WindowSide.SOUTH);
        window.addButton(majorButton, WindowSide.SOUTH);
        window.addButton(regionButton, WindowSide.SOUTH);
        window.addButton(quitButton, WindowSide.SOUTH);

        line = new Shape(100, 50, 5, 60, Color.BLACK);
        window.addShape(line);

        row1Right = new Shape(100, 50, 50, 15, Color.MAGENTA);
        window.addShape(row1Right);

        row2Right = new Shape(100, 65, 50, 15, Color.BLUE);
        window.addShape(row2Right);

        row3Right = new Shape(100, 80, 50, 15, Color.YELLOW);
        window.addShape(row3Right);

        row4Right = new Shape(100, 95, 50, 15, Color.GREEN);
        window.addShape(row4Right);

        row1Left = new Shape(50, 50, 50, 15, Color.MAGENTA);
        window.addShape(row1Left);

        row2Left = new Shape(50, 65, 50, 15, Color.BLUE);
        window.addShape(row2Left);

        row3Left = new Shape(50, 80, 50, 15, Color.YELLOW);
        window.addShape(row3Left);

        row4Left = new Shape(50, 95, 50, 15, Color.GREEN);
        window.addShape(row4Left);

        text = new TextShape(50, 30, "Example Song Title");
        window.addShape(text);

        row1Right = new Shape(100, 50, 50, 15, Color.MAGENTA);
        window.addShape(row1Right);

        lineLeft = new Shape(500, 175, 3, 125, Color.BLACK);
        window.addShape(lineLeft);

        lineRight = new Shape(600, 175, 3, 125, Color.BLACK);
        window.addShape(lineRight);

        lineTop = new Shape(500, 175, 100, 3, Color.BLACK);
        window.addShape(lineTop);

        lineBottom = new Shape(500, 300, 103, 3, Color.BLACK);
        window.addShape(lineBottom);

        lineLeg = new Shape(550, 270, 3, 25, Color.BLACK);
        window.addShape(lineLeg);

        textLegend = new TextShape(525, 175, "Legend");
        textLegend.setBackgroundColor(Color.WHITE);
        window.addShape(textLegend);

        major1 = new TextShape(505, 190, "Comp Sci");
        major1.setBackgroundColor(Color.WHITE);
        major1.setForegroundColor(Color.MAGENTA);
        window.addShape(major1);

        major2 = new TextShape(505, 205, "Other Eng");
        major2.setBackgroundColor(Color.WHITE);
        major2.setForegroundColor(Color.BLUE);
        window.addShape(major2);

        major3 = new TextShape(505, 220, "Math/CMDA");
        major3.setBackgroundColor(Color.WHITE);
        major3.setForegroundColor(Color.YELLOW);
        window.addShape(major3);

        major4 = new TextShape(505, 235, "Other");
        major4.setBackgroundColor(Color.WHITE);
        major4.setForegroundColor(Color.GREEN);
        window.addShape(major4);

        songTitle = new TextShape(520, 250, "Song Title");
        songTitle.setBackgroundColor(Color.WHITE);
        window.addShape(songTitle);

        heard = new TextShape(505, 270, "Heard");
        heard.setBackgroundColor(Color.WHITE);
        window.addShape(heard);

        likes = new TextShape(555, 270, "Likes");
        likes.setBackgroundColor(Color.WHITE);
        window.addShape(likes);

    }


    public void clickedNext()
    {

    }


    public void clickedPrev()
    {

    }


    public void clickedQuit()
    {
        
    }


    public void showByHobby()
    {

    }


    public void showByGenre()
    {

    }


    public void showByArtist()
    {
        
    }


    public void showByMajor()
    {

    }

}
