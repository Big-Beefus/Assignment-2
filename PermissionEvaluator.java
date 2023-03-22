/*
 * Everett Krantz and Caitlyn Taylor
 * CS 465
 * 
 * 
 */
package assignment2;
import java.util.*;
import java.io.*;

public class PermissionEvaluator 
{   
    //No args constructor
    public PermissionEvaluator()
    {
        
    }
    
    //Note for us: this integer is just a placeholder so NetBeans doesn't scream at me
    public PermissionEvaluator(int x)
    {
        
    }
    
    //Method that prompts the user to choose one of four options and then runs
    //the corresponding method
    public void menu()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please choose one of these four options:\n"
                + "Option 1: Load input entries\n"
                + "Option 2: Print ACM\n"
                + "Option 3: Update ACM entries from a file\n"
                + "Option 4: Evaluate access requests from a file");
        int choice = input.nextInt();
        
        switch(choice)
        {
            case 1:
                System.out.println("Please enter the filepath of the file you"
                        + "wish to load from: ");
                String filepath = input.nextLine();
                break;

            case 2:

            case 3: 

                
        }
                    
    }
    
    //Method that reads and prints the contents of the file
    public void readFile(String fileName)
    {
        
    }
    
    //Method that reads the given permissions file and stores each 
    //item in an ArrayList
    public void readAndStore(String fileName) throws IOException
    {
        FileReader fr = new FileReader("input-acm-entries.txt");
        BufferedReader br = new BufferedReader(fr);
        
        
    }
}
