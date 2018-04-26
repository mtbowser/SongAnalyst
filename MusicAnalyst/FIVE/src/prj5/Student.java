package prj5;
public class Student
{
    //~ Fields ................................................................
    MajorEnum major;
    HobbyEnum hobby;
    RegionEnum region; 
    //~ Constructors ..........................................................
     Student(MajorEnum major, RegionEnum region, HobbyEnum hobby )
     {
         this.hobby = hobby;
         this.major = major;
         this.region = region;
         
         
     }
    //~Public  Methods ........................................................
     public void liked() 
     {
         // increment "Liked" 
         
     }
}
