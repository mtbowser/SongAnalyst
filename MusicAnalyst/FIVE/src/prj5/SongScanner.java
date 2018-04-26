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
public class SongScanner
{
    // ~ Fields ................................................................
    private Scanner       scn;
    public SongList songs;


    // ~ Constructors ..........................................................

    // ----------------------------------------------------------
    /**
     * Create a new SongScanner object.
     * @throws FileNotFoundException
     */
    public SongScanner()
        throws FileNotFoundException
    {
        FileReader fileReader = new FileReader(new File("SongList.csv"));
        scn = new Scanner(fileReader);
        scn.useDelimiter(",");
        System.out.print(scn.next());
        SongList songs = new SongList();
        // Uma Thurman,Fall Out Boy,2015,rock
        // Uma Thurman,Fall Out Boy,2015,rock
        // Upside Down,Diana Ross,1980,disco
        // Watching the Detectives,Elvis Costello,1977,punk

    }


    // ~Public Methods ........................................................
    public SongList loadSongs()
    {
       

        while (scn.hasNext())
        {
            String str = scn.nextLine();
            String[] songInfo = str.split(",");
            Song song = new Song(
                songInfo[0],
                songInfo[1],
                songInfo[2],
                songInfo[3],
                0,
                0);
            songs.add(song);

        }
        System.out.print(songs.toString());
        return songs;

    }

}
