package prj5;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Input
{
    
    // ----------------------------------------------------------
    /**
     * Create a new Input object.
     * @param studentFile
     * @param songFile
     * @throws FileNotFoundException
     */
    public Input(String studentFile, String songFile) throws FileNotFoundException 
    {
        StudentScanner stu = new StudentScanner();
        stu.loadStudents();

        SongScanner son = new SongScanner();
        son.loadSongs();

    }
// The class that contains your main method,
// must be called Input. Your Input class must
// be in a package called prj5. You are not
// required to write a testclass for Input. From Canvas you can download the
// test class InputReferenceTest3.java that WebCAT will be using. You can also
// download sample input file(s) and output file(s).
//
// Your main methods should expect the survey
// data file as the first argument to main and
// the song list data file as the second argument
// to main. Remember that in Lab 05 Ice Cream Cone
// Stack there was practice using command line
// arguments.
//
// You should generate output for the two cases
// by writing to standard out. You can use
// System.out.println() for this.
//
// Your code needs to first output the list of
// songs with the percentages by hobby and sorted
// by genre and then output the list of songs with
// the percentages by hobby and sorted by title.
// To do this you will likely need to:
// ~ Fields ................................................................
    SongScanner    songScan;
    StudentScanner stuScan;


    // ~ Constructors ..........................................................
    public static void main(String[] args) throws FileNotFoundException
    {
       Input inputy = new Input("Input/MusicSurveyData2017S.csv",
           "Input/SongList2017S.csv");
        
    }
    
}
