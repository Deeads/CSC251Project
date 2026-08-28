import java.util.Scanner;   
   
public class Project_david_davis
{   
   
   public static void main(String[] args)
   {
   
         Scanner input = new Scanner(System.in);
         
         System.out.print("Please enter the Policy Number: ");
         
         int holderNum = input.nextInt();
         input.nextLine();
         
         System.out.print("Please enter the Provider Name: ");
         
         String providerName = input.nextLine();
         
          
         System.out.print("Please enter the Policyholder's First Name: ");
         
         String holderFirstName = input.nextLine();
         
         System.out.print("Please enter the Policyholder's Last Name: ");
         
         String holderLastName = input.nextLine();
         
         System.out.print("Please enter the Policyholder's age: ");
         
         int holderAge = input.nextInt();
         input.nextLine();
         
         System.out.print("Please enter the Policyholder's smoking Status(smoker/non-smoker): ");
         String holderSmokeStatus = input.nextLine();
       
        
         System.out.print("Please enter the Policyholder's Height (in inches): ");
         
         double holderHeight = input.nextDouble();
         
         System.out.print("Please enter the Policyholder's Weight (in pounds): ");
         
         double holderWeight = input.nextDouble();
         
         policy policy = new policy(
               holderAge, 
               holderSmokeStatus, 
               holderWeight, 
               holderHeight, 
               holderNum, 
               holderLastName,
               holderFirstName,
               providerName);
        
                  
         
         
         System.out.printf("%nPolicy Number: %d%n", policy.getPolicyNumber());
         
         
         System.out.printf("%nProvider Name: %s ", policy.getProviderName());
         
        
         System.out.printf("%nPolicyholder's First Name: %s%n ", policy.getHolderFirstName());
         
         System.out.printf("%nPolicyholder's Last Name: %s%n ", policy.getHolderLastName());
         
         System.out.printf("%nPolicyholder's Age: %d%n ", policy.getHolderAge());
         
         System.out.printf("%nPolicyholder's Smoking Status: %s%n", policy.getHolderSmokeStatus());
         
         System.out.printf("%nPolicyHolder's Height: %.1f inches",policy.getHolderHeight());
         
         System.out.printf("%nPolicyHolder's Weight: %.1f pounds", policy.getHolderWeight());
         
         System.out.printf("%nPolicyHolder's Bmi: %.2f", policy.getBmi());
         
         System.out.printf("%nPolicy Price: $%.2f", policy.getPrice());
         
         input.close();
         
      {
 }
 }


}