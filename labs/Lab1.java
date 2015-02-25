package labs;

import java.util.Scanner;

public class Lab1 {
	
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			
			System.out.print("Enter the number of years you want to work:");
			double nToWork = input.nextDouble();
			
			System.out.print("Enter your annual rate of return during your investment (0-.2):");
			double iInvestment = input.nextDouble();
			
			System.out.print("Enter the number of years you want to be retired for:");
			int nRetired = input.nextInt();

			System.out.print("Enter your annual rate of return during your payback (0-.03):");
			double iPayback = input.nextDouble();
			
			System.out.print("Enter the required income you would live to recieve:");
			double RI = input.nextDouble();
			
			System.out.print("Enter your expect monthly SSI income (<$2,642):");
			double SSI = input.nextDouble();
		
			
			double PV1 = (1 - Math.pow (1 + (iPayback/12), -(nRetired*12)));
			double PV2 = (PV1/(iPayback/12));
			double PV3 = (RI-SSI) * PV2;
			
			double PMT1 = (Math.pow (1+ (iInvestment/12), (nToWork*12)) - 1);
			double PMT2 = (iInvestment/12) * PV3 / PMT1;
			
			input.close();
				
			System.out.println ("You need to save $" + PV3 + "in total.");
			System.out.println ("You need to put $" + PMT2 + "monthly.");
			
		}
	}
