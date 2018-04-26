package prj5;
public class SongListTest extends student.TestCase
{
    //~ Fields ................................................................
    private SongList testList;
    private Song s1;
    private Song s2;
    private Song s3;
    private Song s4;
    //~ Constructors ..........................................................

    //~Public  Methods ........................................................
    public void setUp() 
    {
        testList = new SongList();
        s1 = new Song("bring me to life","evanescence", "emo", "2001", 34, 44);
        s2 = new Song("remembering sunday", "all time low", "pop punk", "2004", 33, 56);
        s3 = new Song("in da club", "50 cent", "hip-hop", "2005", 88, 80);
        s4 = new Song ("toxic", "britney Spears", "pop", "2006", 77, 44);
        testList.add(s1);
        testList.add(s2);
        testList.add(s3);
        testList.add(s4);
        
    }
    public void testSortByGenre() 
    {
        assertTrue(testList.remove(s1));
        System.out.println(testList.toString());
       testList.sortByArtist(testList);
       System.out.println(testList.toString());
        
    }
}
