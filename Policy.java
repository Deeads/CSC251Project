/**
the policy class store data relating to an insurance polic
*/

public class Policy
{
   private int policyNum; 
   private String providerName;   
   private PolicyHolder policyHolder;
   // This is a static field for object counting gets incremented in both constructors shown in pages 496 to 501
   private static int policyCount = 0;
   
   public Policy()
   {
      policyNum = 0;
      providerName = "";
      // policy holder reference variable disscussed in aggregation chapter pages 522-527
      policyHolder = new PolicyHolder(); 
      policyCount++;//increment     
   }  
   
 
   
   
   /**
      this is a constructor that accpets arguments for each of its fields
      @param pNum the policy number
      @param pName the provider name
      @param ph the object policyHolder
   */
   public Policy(int pNum, String pName, PolicyHolder ph)
   {
      policyNum = pNum;
      providerName = pName;
      // policy holder reference variable  in arg constructor disscussed in aggregation chapter pages 522-527
      // improtant for security uses deep copying of the object refrenced by ph 
      policyHolder = new PolicyHolder(ph);
      policyCount++;//increment
   }
   
   //settters
   /**
      the setPolicy Number method updates the value of the policyNum field 
      @param pNum the policy number
   
   */
   public void setPolicyNumber(int pNum)
   {
      policyNum = pNum;
   }
   /**
      the setPrvoiderName method updates the value of the providerName field 
      @param pNum the policy number
   
   */
   public void setProviderName(String pName)
   {
      providerName = pName;
   }
   
   /**
      the setPolicyHolder method updates the value of the PolicyHolder field 
      @param ph the policyHolder object 
   */   
   //Deepcoping for pretecting setting  
   public void setPolicyHolder(PolicyHolder ph)
   {
      policyHolder = new PolicyHolder(ph);
   }
   
   /**
      the getPolicy Number method gets the value of the policyNum field 
      @param none
   
   */
   public int getPolicyNumber()
   {
      return policyNum;
   }
   
   
   
   /**
      the getPrvoiderName method gets the value of the providerName field 
      @param none
   
   */
   public String getProviderName()
   {
      return providerName;
   }
   
   /**
      the getPolicyHolder method gets the value of the PolicyHolder field 
      @param none 
      @return new policyHolder object 
   */   
   public PolicyHolder getPolicyHolder()
   {
      return new PolicyHolder(policyHolder);
   }
   
   /**
      the getPolicyHolder method gets the static policy count field  
      @param none
   */   
   public static int getPolicyCount()
   {
      return policyCount;
   }
   
   /**
      getPrice calculates then returns total price of policy
      @param none
   */
   
   public double getPrice()
   {
      double price = 600;

      if (policyHolder.getAge() > 50)
      {
         price += 75;
      }
      
      if (policyHolder.getSmokingStatus().equalsIgnoreCase("smoker"))
      {
         price += 100;
      
      }
      if (policyHolder.getBMI()> 35)
      {
         price += (policyHolder.getBMI() - 35)*20;
      }
                 
      return price;
      
      
   }
   
   
   public String toString()//ToString method Disscussed in pages 507 to 511
   {
      String output = "";
      output += "Policy Number: " + policyNum + "\n";
      output += "Provider Name: " + providerName + "\n";
      output += policyHolder.toString();
      output += String.format("Policy Price: $%,.2f\n", getPrice());
      
      return output;
   
   }
         
}
