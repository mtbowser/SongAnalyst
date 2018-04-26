package prj5;
public class SongTest extends student.TestCase
{
    //~ Fields ................................................................
    private Song s1;
    private Song s2;
   
    //~Public  Methods ........................................................
    public void setUp() 
    {
        s1 = new Song();
        
        
    }
    public void testGetter() 
    {
        s1.setTitle("bruh");
        assertEquals("bruh", s1.getTitle());
        
    }
}
