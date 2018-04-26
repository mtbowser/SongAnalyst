package prj5;

// -------------------------------------------------------------------------
/**
 * Write a one-sentence summary of your class here. Follow it with additional
 * details about its purpose, what abstraction it represents, and how to use it.
 * 
 * @author lil bo peep
 * @version Apr 21, 2018
 */
public class Song
{
    // ~ Fields ................................................................
    public String title;
    public String artist;
    public String genre;
    public String year;
    public int    liked;

    public int    heard;

    // ~ Constructors ..........................................................


    // ----------------------------------------------------------
    /**
     * Create a new Song object.
     * 
     * @param titlex
     * @param artistx
     * @param genrex
     * @param yearx
     * @param likedx
     * @param heardx
     */
    public Song(
        String titlex,
        String artistx,
        String genrex,
        String yearx,
        int likedx,
        int heardx)
    {
        this.title = titlex;
        this.artist = artistx;
        this.genre = genrex;
        this.year = yearx;
        heard = 0;
        liked = 0;
    }


    public Song()
    {

    }


    public String getArtist()
    {
        return this.artist;
    }
   


    // ~Public Methods ........................................................
    public String getGenre()
    {

        return this.genre;
    }


    // ---------------------------------------
    /**
     * Place a description of your method here.
     * 
     * @return
     */
    public String getTitle()
    {

        return this.title;
    }


    public void setTitle(String title)
    {

        this.title = title;
    }


    public void incrementLiked()
    {
        liked = liked++;

    }


    public void incrementHeard()
    {
        heard = heard++;

    }


    public void setArtist(String Artist)
    {
        this.artist = artist;
    }


    public void setGenre(String genre)
    {
        this.genre = genre;
    }


    public void setYear(String year)
    {
        year = this.year;

    }


    // ----------------------------------------------------------
    /**
     * Place a description of your method here.
     * 
     * @param song
     * @return
     */
    public int compareByGenre(Song song)
    {
        return this.getGenre().compareTo(song.getGenre());

    }


    // ----------------------------------------------------------
    /**
     * Place a description of your method here.
     * 
     * @param song
     * @return
     */
    public int compareByTitle(Song song)
    {
        return this.getTitle().compareTo(song.getTitle());

    }
}
