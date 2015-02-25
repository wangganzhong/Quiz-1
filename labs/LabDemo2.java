// Done by members from Group 3:
package labs;

import java.util.Scanner;

public class LabDemo2 {

   public static double pmt(double rate, double n, double p, double f, boolean t) {
       double retval = 0;
       if (rate == 0) {
           retval = -1*(f+p)/n;
       }
       else {
       retval = ( f + p * Math.pow (rate+1, n) ) * rate
                 /
              ((t ? rate + 1 : 1) * (1 - Math.pow (rate+1, n)));
       }
       return retval;
   }

   public static void main(String[] args) {
	   //Create a Scanner object
	   Scanner input  = new Scanner(System.in);
	   
	   //Prompt the user to enter the required income
	   System.out.print("Enter the expected income you would to receive per month after retired: ");
	   double requiredIncome = input.nextDouble();
	   
	   // Prompt the user to enter the SSI
	   System.out.print("Enter your monthly SSI (<$2,642): ");
	   double  monthlySSI = input.nextDouble();
	   
	   //Prompt the user to enter the years they want to work
	   System.out.print("Enter the number of years you want to work: ");
	   double yearsToWork = input.nextDouble();
	   
	   //Prompt the user to enter the years they want to retired for
	   System.out.print("Enter the number of years you want to be retired for: ");
	   double yearsRetired = input.nextDouble();
	   
	   //Prompt the user to enter the interest rate during investing
	   System.out.print("Enter your interest rate for annual return when you are investing (0-.2): ");
	   double annualReturnI = input.nextDouble();
	   
	   //Prompt the user to enter the interest rate during payback
	   System.out.print("Enter your interest rate for annual return when your are getting payback (0-.03): ");
	   double annualReturnP = input.nextDouble();
	   
	   //User inputs for the variable calculations
	   input.close();
	   
	   //Compute your Present Value 
	   double pv = (requiredIncome - monthlySSI) * (

			   (1 - Math.pow (1 + annualReturnP/12.0, -yearsRetired*12))
			   /(annualReturnP/12.0)
			   );
	   
	   //Display result
	   System.out.println("The amount you would need to save is: " + pv);
	   System.out.println("The amount you need to put away each month is: " + -pmt(annualReturnI/12.0, yearsToWork*12, 0, pv, false) );
	   
	   
   }

}
