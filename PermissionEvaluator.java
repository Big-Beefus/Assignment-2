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
    private HashMap<String, Map<String, Set<String>>> permissionsMap = new HashMap<>();
    
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
        String choice;
        Scanner input = new Scanner(System.in);
        do
        {
            System.out.println("Please choose one of these four options:\n"
                    + "Option 1: Load input entries\n"
                    + "Option 2: Print ACM\n"
                    + "Option 3: Update ACM entries from a file\n"
                    + "Option 4: Evaluate access requests from a file");
            choice = input.nextLine();
 
            switch(choice)
            {
                case "1":
                    System.out.println("Please enter the filepath of the file you"
                            + "wish to load from or enter q to quit: ");
                    String filepath = input.nextLine();
                case "2":
                    loadFromFile("");
                case "3":
                    
                case "4":
                    evaluate();
                default:
                    System.out.println("Invalid input");
            }
        }while(!"q".equals(choice));
                    
    }
    
    public void loadFromFile(String dataFile)
    {
        BufferedReader fileReader = null; 
        try
        {
            File inFile = new File(dataFile);
            fileReader = new BufferedReader(new FileReader(inFile));
            
            String nextFileLine = null;
            
            while((nextFileLine = fileReader.readLine()) != null)
            {
                String[] info = nextFileLine.split(",");
                
                String user = info[0].trim();
                String fileName = info[1].trim();
                String permissions = info[2].trim();
                
                if (!user.equals("") && !fileName.equals("") && !permissions.equals(""))
                { 
                    //addToACM(user, fileName, permissions);
                }
                    
            }
            
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
        }
        if(fileReader != null)
        {
            try
            {
                fileReader.close();
            }
            catch(IOException exception)
            {
                exception.printStackTrace();
            }
        }
    }
    
    /*public void addToACM(String user, String fileName, String permissions)
    {
        Car car = new Car(vin, make, model, year, available);
        if(permissionsMap.containsKey(car.getMake()))
        {
            if(permissionsMap.get(car.getMake()).containsKey(car.getModel()))
            {
                if(permissionsMap.get(car.getMake()).get(car.getModel()).contains(car))
                {
                    return;
                }
                permissionsMap.get(car.getMake()).get(car.getModel()).add(car);
                carNum++;
            }
            else
            {
                permissionsMap.get(car.getMake()).put(car.getModel(), new HashSet<Car>());
                permissionsMap.get(car.getMake()).get(car.getModel()).add(car);
                carNum++;
            }
        }
        else
        {
            permissionsMap.put(car.getMake(), new HashMap<String, Set<Car>>() {});
            permissionsMap.get(car.getMake()).put(car.getModel(), new HashSet<Car>());
            permissionsMap.get(car.getMake()).get(car.getModel()).add(car);
            carNum++;
        }
    }
    */
    
    public void evaluate()
    {
        
    }
    
    @Override
    public String toString()
    {
       System.out.println("Username: " + getName());
       System.out.println("File name: " + getNumCars());
       System.out.println("==========================================");
       for(String m:permissionsMap.keySet())
       {
           System.out.println(m + ":");
           for(String n: permissionsMap.get(m).keySet()){
               System.out.println("     " + n + ":");
               for(Car car: permissionsMap.get(m).get(n))
               {
                   System.out.println("            " + car);
               }
           }
           System.out.println("------------");
       }
        return "";
    }
}
   