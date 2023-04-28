import java.util.Scanner;
class Main 
{   
   public static void main(String[] args) 
   {  
      final int QUARTS_IN_GALLON = 4;
      int quartsNeeded = 0;
      int gallonsNeeded;
      int extraQuartsNeeded;
      boolean notvalid = true;
      Scanner input = new Scanner(System.in);
     while(notvalid)
     {
     try
      {
      System.out.print("Enter quarts needed >> ");
      quartsNeeded = input.nextInt();
      }
     catch (Exception e)
       {
         System.out.println("Please enter a number");
       }
     finally
       {
         if(quartsNeeded > 0);
         {
           notvalid = false;
         }
       }
     }
     if(notvalid)
     {
       gallonsNeeded = quartsNeeded / QUARTS_IN_GALLON;
      extraQuartsNeeded = quartsNeeded % QUARTS_IN_GALLON;
      System.out.println("A job that needs " + quartsNeeded +
         " quarts requires " + gallonsNeeded + " gallons plus " +
         extraQuartsNeeded + " quarts.");
     }
      
   }
}
