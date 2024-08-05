
/**
 * Write a description of class trial here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class trial
{
    public static void main(String[] args){
        String unitName = "";
        
        try{
            Scanner s = new Scanner(new File("file.csv"));
            s.nextLine();
            s.nextLine();
           
            
        while (s.hasNextLine()){
            String d = s.nextLine();
            //System.out.println(d);
            String[] parts = d.split(",");
            System.out.println(parts.length);
            // for (String i : parts){
            // System.out.println(i);
        // }
        }
        
        
    }
    catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    }
}
