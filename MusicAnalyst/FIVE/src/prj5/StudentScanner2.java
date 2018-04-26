package prj5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

// -------------------------------------------------------------------------
/**
 * Write a one-sentence summary of your class here. Follow it with additional
 * details about its purpose, what abstraction it represents, and how to use it.
 * 
 * @author lil bo peep
 * @version Apr 5, 2018
 */
public class StudentScanner
{
    // ~ Fields ................................................................
    Scanner scn;


    // ~ Constructors ..........................................................

    public StudentScanner()
        throws FileNotFoundException
    {
        FileReader fileReader = new FileReader(new File("MusicSurveyData.csv"));
        scn = new Scanner(fileReader);
        scn.useDelimiter(",");
        System.out.print(scn.next());

    }


    // ~Public Methods ........................................................
    public StudentList<Student> loadStudents()
    {
        StudentList students = new StudentList();
        scn.nextLine();
        // there are 67 songs (lines)
        String str = scn.nextLine();
        SongList songs = new SongList();
        while (scn.hasNextLine())
        {
            String[] stuData = str.split(",");
            String maj_nospace = stuData[2].replaceAll(" ","_");
            String region_nospace = stuData[3].replaceAll(" ","_");
            String region_nospaceorparenth = region_nospace.replaceAll("[()]", "") ;
         
            Student stud = new Student(
                MajorEnum.valueOf(maj_nospace),
                RegionEnum.valueOf(region_nospaceorparenth),
                HobbyEnum.valueOf(stuData[4].toUpperCase()));
            
            students.add(stud);

            // now we process through all of the songs.
            // there are 64 columns, so there are 59 songs
            for (int i = 4; i < 58; i++)
            {
                if (stuData[i].equals("Yes") && stuData[i + 1].equals("Yes"))
                {
                    // haev u heard
                    Song x = songs.getEntry(i);
                    x.incrementHeard();
                    x.incrementLiked();

                }
                else if (stuData[i].equals("No"))
                {
                    break;
                }
                else if (stuData[i + 1].equals("No"))
                {
                    Song x = songs.getEntry(i);
                    x.incrementHeard();
                }

            }

        }
        return students;
    }

}
