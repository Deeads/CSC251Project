import java.util.Scanner;

public class policy
{
   int holderNum, holderAge, policyNum; 
   String ProviderName, holderFirstName, holderLastName, holderSmokeStatus;
   double holderHeight, holderWeight, bmiNum, baseFee;
   public policy()
   {
      this.holderNum =0;
      this.holderAge = 0;
      this.ProviderName = "";
      this.holderFirstName = "";
      this.holderLastName = "";
      this.holderSmokeStatus ="";
      this.holderHeight = 0;
      this.holderWeight = 0;
      this.bmiNum = 0;
      this.baseFee = 600;
     
   }  
   
 
   
   
   public policy(int holderAge, String holderSmokeStatus, double holderHeight, double holderWeight)
   {
      price(holderAge, holderSmokeStatus, holderHeight, holderWeight);
   
   
   }
   
   
   public double bmi(double holderHeight, double holderWeight)
   {
      final double BMIHEIGHT =Math.pow(holderHeight,2);
      
      this.bmiNum = (holderWeight*703)/(BMIHEIGHT);
      
      
      return this.bmiNum;
   
   }
  

   
   public double price(int holderAge, String holderSmokeStatus, double holderHeight, double holderWeight)
   {
     
      this.baseFee = 600;
     

      if (holderAge > 50)
      {
         this.baseFee += 75;
      }
      
      if (holderSmokeStatus.equalsIgnoreCase("smoker")== true)
      {
         this.baseFee+= 100;
      
      }
      
                 
      return this.baseFee;
      
      
   }
   
   


   public static void main(String[] args)
   {
   
      Scanner input = new Scanner(System.in);
      
      double fullprice;
      
      policy policy1 = new policy();
      
      System.out.print("Please enter the Policy Number:");
      
      int UserpolicyNum = input.nextInt();
      
      
      System.out.print("Please enter the Provider Name:");
      
      String userProviderName = input.nextLine();
      input.nextLine();
      System.out.print("Please enter the Policyholder's First Name:");
      
      String userHoldersFirstName = input.nextLine();
      
      System.out.print("Please enter the Policyholder's Last Name:");
      
      String userHoldersLastName = input.nextLine();
      
      System.out.print("Please enter the Policyholder's age:");
      
      int userHoldersAge = input.nextInt();
      
      System.out.print("Please enter the Policyholder's smoking Status(smoker/non-smoker:");
      
      String userHoldersSmokeStatus = input.nextLine();
      input.nextLine();
     
      System.out.print("Please enter the Policyholder's Height (in inches):");
      
      double userHoldersHeight = input.nextDouble();
      
      System.out.print("Please enter the Policyholder's Weight (in pounds):");
      
      double userHoldersWeight = input.nextDouble();
      
      
      
      policy policy2 = new policy(userHoldersAge, userHoldersSmokeStatus,userHoldersHeight,userHoldersWeight);
      
      System.out.println("test " + policy2.price(userHoldersAge, userHoldersSmokeStatus,userHoldersHeight,userHoldersWeight));
      System.out.println("test2 " + policy2.bmi(userHoldersHeight,userHoldersWeight));
      double bmi = policy2.bmiNum;
      double bmiPrice = (bmi-35)*20;
      double finalBasePrice =policy2.baseFee;
      double fullPrice = finalBasePrice+bmiPrice;
      
      
      
      System.out.printf("Policy Number: %d ", UserpolicyNum);
      
      
      System.out.printf("%nProvider Name: %s ", userProviderName);
      
     
      System.out.printf("%nPolicyholder's First Name: %s ", userHoldersFirstName);
      
      System.out.printf("%nPolicyholder's Last Name: %s ", userHoldersLastName);
      
      System.out.printf("%nPolicyholder's Age: %s ", userProviderName);
      
      System.out.printf("%nPolicyholder's Smiking Status: %s ",userHoldersSmokeStatus);
      
      System.out.printf("%nPolicyHolder's Height: %.2f inches",userHoldersHeight);
      
      System.out.printf("%nPolicyHolder's Weight: %.2f pounds",userHoldersWeight);
      
      System.out.printf("%nPolicyHolder's Bmi: %.2f",bmi);
      
      System.out.printf("%nPolicy Price: $%.2f",fullPrice);
      
      
      
   }

}  