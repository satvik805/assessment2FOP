

import java.util.Scanner;
public class last
{
    public static void main(String[] args){
       StudentManager manager = new StudentManager();
        Scanner s = new Scanner(System.in);
        
        manager.read("file.csv");
        
        while(true){
            System.out.println("\nMenu:");
            System.out.println("1. Print all students");
            System.out.println("2. Print students with marks below a threshold");
            System.out.println("3. Print top 5 and bottom 5 students");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = s.nextInt();
            
            if(choice ==1){
                manager.printAllStudents();
            }
            else if(choice == 2){
                System.out.println("Enter Threshold: ");
                int t = s.nextInt();
                manager.studentbelowthreshold(t);
            }
            else if(choice == 3){
                manager.topandBottomStudents();
            }
            else if(choice == 4){
                break;
            }
        }
    }
}
