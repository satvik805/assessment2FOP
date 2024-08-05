
/**
 * Write a description of class Person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Person
{
   private String Firstname;
   private String Lastname;
   
   
   public Person(String Firsatname, String Lastname){
       this.Firstname = Firstname;
       this.Lastname = Lastname;
   }
   
   public String getFirstName(){
       return Firstname;
   }
   
   public String getLastName(){
       return Lastname;
   }
   
   
}
