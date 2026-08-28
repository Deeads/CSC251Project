

public class policy
{
   private int holderNum, holderAge, policyNum; 
   private String providerName, holderFirstName, holderLastName, holderSmokeStatus;
   private double holderHeight;
   private double holderWeight;
   
   
   
   
   public policy()
   {
      holderNum =0;
      holderAge = 0;
      providerName = "";
      holderFirstName = "";
      holderLastName = "";
      holderSmokeStatus ="";
      holderHeight = 0;
      holderWeight = 0;     
   }  
   
 
   
   
   
   public policy(int holderAge, String holderSmokeStatus, double holderWeight, double holderHeight, int holderNum, String holderLastName, String holderFirstName, String providerName)
   {
      this.holderNum = policyNum;
      this.providerName = providerName;
      this.holderFirstName = holderFirstName;
      this.holderLastName = holderLastName;
      this.holderAge = holderAge;
      this.holderSmokeStatus = holderSmokeStatus;
      this.holderHeight = holderHeight;
      this.holderWeight = holderWeight;
   }
   
   public void setPolicyNumber(int policyNumber)
   {
      this.policyNum = policyNum;
   }
   
   public void setProviderName(String providerName)
   {
      this.providerName = providerName;
   }
   
   public void setHolderFirstName(String holderFirstName)
   {
      this.holderFirstName = holderFirstName;
   }
   
   
   public void setHolderLastName(String holderLastName)
   {
      this.holderLastName = holderLastName;
   }
   
   public void setHolderAge(int holderAge)
   {
      this.holderAge = holderAge;
   }
   
   public void setHolderSmokeStatus(String holderSmokeStatus)
   {
      this.holderSmokeStatus = holderSmokeStatus;
   }
   
   public void setHolderHeight(double holderHeight)
   {
      this.holderHeight = holderHeight;
   }
   
   public void setHolderWeight(double holderWeight)
   {
      this.holderWeight = holderWeight;
   }
   
   public int getPolicyNumber()
   {
   
      return policyNum;
   }
   
   public String getProviderName()
   {
      return providerName;
   }
   
   public String getHolderFirstName()
   {
   
      return holderFirstName;
   }
   
   public String getHolderLastName()
   {
      return holderLastName;
   }
   
   public int getHolderAge()
   {
      return holderAge;
   }
   
   public String getHolderSmokeStatus()
   {
   
      return holderSmokeStatus;
   }
   
   
   public double getHolderHeight()
   {
   
      return holderHeight;
   }
   
   public double getHolderWeight()
   {
      return holderWeight;
   }
   
   
   public double getBmi()
   {
      final double BMIHEIGHT =Math.pow(holderHeight,2);    
      return (holderWeight*703)/(BMIHEIGHT);
   
   }
  

   
   public double getPrice()
   {
      double price = 600;

      if (holderAge > 50)
      {
         price += 75;
      }
      
      if (holderSmokeStatus.equalsIgnoreCase("smoker"))
      {
         price += 100;
      
      }
      if (getBmi()> 35)
      {
         price += (getBmi() - 35)*20;
      }
                 
      return price;
      
      
   }
         
}
