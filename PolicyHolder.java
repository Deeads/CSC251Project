/**
This is the PolicyHolder class that stores data relating to a policyholder 
*/

public class PolicyHolder 
{
   private String firstName;
   private String lastName;
   private int age;
   private String smokingStatus;
   private double height;
   private double weight;
   
   
   
   
   /**
      No arg constructor
   */
   public PolicyHolder()
   {
      firstName = "";
      lastName = "";
      age = 0;
      smokingStatus = "";
      height = 0.0;
      weight = 0.0;
   }
   
   
   
   /**
      a constructor that aceppects arguments for fieldfs
      @param first   policyholders first name
      @param last    policyholders last name
      @param age     policyholders age
      @param smoke   policyholders smokeing status
      @param height  policyholders height in inches
      @param weight  policyholders weight in pounds
   */
   
   public PolicyHolder(String first, String last, int a, String smoke, double h, double w)
   {
      firstName = first;
      lastName = last;
      age = a;
      smokingStatus = smoke;
      height = h;
      weight = w;
   }
   
   
   /**
      Constructor 
      @param obj the policyholder object to copy
   */
   
   
   public PolicyHolder(PolicyHolder obj)
   {
      firstName = obj.firstName;
      lastName = obj.lastName;
      
      age = obj.age;
      smokingStatus = obj.smokingStatus;
      height = obj.height;
      weight = obj.weight;
   
   }
   
   
   
   //setters
   /**
      setFirstName updates the value of the firstName field
      @param first   the policyholders first name
   */
   public void setFirstName(String first)
   {
      firstName = first;
   }
   
  
   /**
      setlastName updates the value of the lastName field
      @param last  the policyholders last name
   */
   public void setlastName(String last)
   {
      lastName = last;
   }
   
    /**
      setAge updates the value of the age field
      @param a  the policyholders age
   */
   public void setlastName(int a)
   {
      age = a;
   }
   
   
    /**
      setHeight updates the value of the height field
      @param h  the policyholders height
   */
   public void setHeight(double h)
   {
      height = h;
   }
   
   /**
      setWeight updates the value of the weight field
      @param w  the policyholders weight
   */
   public void setWeight(double w)
   {
      weight = w;
   }
   
   
   
   // getters
   
   /**
      getFirstName gets the value of the firstName field
      @param none
      @return firstname string
   */
   public String getFirstName()
   {
      return firstName;
   }
   
   /**
      getlastName gets the value of the lastName field
      @param none   
      @return last name string
   */
   
   public String getlastName()
   {
      return lastName;
   }
   
    /**
      getAge gets the value of the age field
      @param none
      @return age integer
   */
   public int getAge()
   {
      return age;
   }
   
   /**
      getSmokingStatus gets the value of the smokingStatus field
      @param none
      @return smoking status String
   */
   public String getSmokingStatus()
   {
      return smokingStatus;
   }
   
   
   
    /**
      getHeight gets the value of the height field
      @param none
      @return height double
   */
   public double getHeight()
   {
      return height;
   }
   
   /**
      getWeight gets the value of the weight field
      @param none
      @return weight double
   */
   public double getWeight()
   {
      return weight;
   }

   
   /** 
      getBmi simply calculates and returns the policy holders Body mass index or BMI
      @param none
      @return the calculated policy price
   */
   
   public double getBMI()
   {
      double bmiHeight = Math.pow(height,2);
      return(weight *703) / bmiHeight;
   
   }
   
   public String toString()
   {
      String output = "";
      
      output += "Policyholder's First Name: " + firstName + "\n";
      output += "Policyholder's Last Name: " + lastName + "\n";
      output += "Policyholder's Age: " + age + "\n";
      output += "Policyholder's Smoking Status (smoker/non-smoker): " + smokingStatus + "\n";
      output += String.format("Policyholder's Height: %.1f inches\n", height);
      output += String.format("Policyholder's Weight: %.1f pounds\n", weight);
      output += String.format("Policyholder's BMI: %.2f\n", getBMI());
      
      return output;
   
   
   }
   
}