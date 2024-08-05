
/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student extends Person
{
    private String StudentId;
    private double a1;
    private double a2;
    private double a3;
    
    public Student(String StudentId, String Firstname, double a1, double a2, double a3, String Lastname){
        super(Firstname, Lastname);
        this.StudentId = StudentId;
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
    }
    
    public double assignment1Marks(){
        return a1;
    }
    
    public double assignment2Marks(){
        return a2;
    }
    
    public double assignment3Marks(){
        return a3;
    }
    
    public String getStudentId(){
        return this.StudentId;
    }
    
    public double getTotalMarks(){
        return a1 + a2 + a3;
    }
    
}
