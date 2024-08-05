
/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student extends Person
{
    private String StudentId;
    private int[] marks;
    private int totalmarks;
    
    public Student(String StudentId, String name, int[] marks){
        super(name);
        this.StudentId = StudentId;
        this.marks = marks;
        this.totalmarks = calculate();
    }
    
    private int calculate(){
        int total = 0;
        for(int i : marks){
            total += i;
        }
        return total;
    }
    
    public String getStudentId(){
        return this.StudentId;
    }
    
    public int getTotalMarks(){
        return totalmarks;
    }
    
}
