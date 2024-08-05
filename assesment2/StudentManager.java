
/**
 * Write a description of class StudentManager here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class StudentManager implements Manage
{
    // instance variables - replace the example below with your own
    private List<Student> students;
    private string unitName;
   public StudentManager(){
       students = new ArrayList<>();
   }
   
   @Override
   public void read(String filename){
       try(Scanner s = new Scanner(new File(filename))){
           unitName = s.nextLine().trim();
           s.nextLine();
           while(s.hasNextLine()){
               String line = s.nextLine();
               if(line.trim().isEmpty()){
                  continue; 
               }
               String[] parts = line.split(",");
               if(parts.length == 7){
                   String lastName = parts[0].trim();
                   String firstName = parts[1].trim();
                    String studentId = parts[2].trim();
                    double a1 = Double.parseDouble(parts[3].trim());
                    double a2 = Double.parseDouble(parts[4].trim());
                    double a3 = Double.parseDouble(parts[5].trim());
                    students.add(new Student(studentId, firstName, a1, a2, a3, lastName));
                    
                    
               }
               
           }
           
       }
       catch(FileNotFoundException e){
           e.printStackTrace();
       }
   }
   @Override
   public void printAllStudents(){
       System.out.println("Unit: " + unitName);
       for(Student i : students){
           System.out.println(i);
       }
   }
   public void Studentbelowthreshold(int threshold){
       for(Student st : students){
           if(st.getTotalMarks() < threshold){
               System.out.println(student);
           }
       }
   }
   @Override
   public void TopandBottomStudents(){
       sortStudents();
       System.out.println("Top 5 students: ");
       for(int i = 0; i < 5 && i < students.size(); i++){
           System.out.println(students.get(i));
       }
       System.out.println("\nBottom 5 students");
       for(int i = students.size() - 5; i < students.size(); i++){
           if(i > 0){
               System.out.println(students.get(i));
           }
       }
   }
   
   private void sortStudents(){
       for(int i = 0; i < students.size() - 1; i++){
           for(int j = 0; j < students.size() - i - 1; j++){
               if(students.get(j).getTotalMarks() < students.get(j + 1).getTotalMarks() ){
                   Student temp = students.get(j);
                   students.set(j, students.get(j + 1));
                   students.set(j + 1, temp);
               }
           }
       }
   }
}
