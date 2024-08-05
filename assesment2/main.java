
/**
 * Write a description of class main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class main
{
    public static void main(String[] args){
        Manage manager = new StudentManager();
        Scanner s = new Scanner(System.in);
        
        manager.readFile("file.csv");
        
        while(true){
            System.out.println("\nMenu:");
            System.out.println("1. Print all students");
            System.out.println("2. Print students with marks below a threshold");
            System.out.println("3. Print top 5 and bottom 5 students");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = s.nextInt();
            
            switch(choice){
                case 1:
                    manager.printAllStudents();
                    break;
                case 2:
                    System.out.print("Enter the threshold: ");
                    int threshold = s.nextInt();
                    manager.Studentbelowthreshold();
                    break;
                case 3:
                    manager.TopBottomStudents();
                    break;
                case 4:
                    s.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}