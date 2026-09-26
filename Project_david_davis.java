import java.util.*;   
import java.io.*;
   
public class Project_david_davis
{   
   
   public static void main(String[] args)
   {
   
      try
      {
         File file = new File("PolicyInformation.txt");
         
         Scanner inputFile = new Scanner(file);
         
         int policyNumber = 0, age = 0;
         String providerName = "", firstName = "", lastName = "", smokingStatus = "", fileInput = " ";
         double height = 0.0, weight = 0.0;
         int smokerCount = 0, nonSmokerCount = 0;
         
         ArrayList<Policy> policies = new ArrayList<Policy>();
         
         
         while(inputFile.hasNext())
         {
            fileInput = inputFile.nextLine();
            
            policyNumber = Integer.parseInt(fileInput);
            providerName = inputFile.nextLine();
            firstName = inputFile.nextLine();
            lastName = inputFile.nextLine();
            
            fileInput = inputFile.nextLine();
            
            age = Integer.parseInt(fileInput);
            
            smokingStatus = inputFile.nextLine();
            
            fileInput=inputFile.nextLine();
            height=Double.parseDouble(fileInput);
            fileInput= inputFile.nextLine();
            weight=Double.parseDouble(fileInput);
            
            if (inputFile.hasNext())
            {
               inputFile.nextLine();
            
            }
            
            PolicyHolder holder = new PolicyHolder(firstName, lastName, age, smokingStatus, height, weight);
            Policy p = new Policy(policyNumber, providerName, holder);
            
            policies.add(p);
         
         }
         
         inputFile.close();
         
         for(int i = 0; i < policies.size(); i++)
         {
            System.out.println(policies.get(i));
            System.out.println();
            //count the number of smokers and non-smokers
            if (policies.get(i).getPolicyHolder().getSmokingStatus().equalsIgnoreCase("smoker"))
            {
               smokerCount++;
            }
            else
            {
               nonSmokerCount++;
            }
            
         
         }
         System.out.println("There were " + Policy.getPolicyCount() + " Policy objects created.");
         System.out.println("The number of policies with a smoker is: " + smokerCount);
         System.out.println("The number of policies with a non-smoker is: " + nonSmokerCount);

      }//try
   
      catch(IOException ex)
      {
         System.out.println("Something went wrong reading the file: ");
      }
   
   
   }
 
 
 
 
 
 
 
 }
   
   