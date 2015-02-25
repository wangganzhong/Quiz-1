import java.util.Scanner;

public class QBrating {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter number of passing attempts (ATT):");
		double ATT = input.nextDouble();
		
		System.out.println("Enter number of completion (CMP):");
		double COMP = input.nextDouble();
		
		System.out.println("Enter passing yards (YDS):");
		double YDS = input.nextDouble();
		
		System.out.println("Enter touchdown passes (TD):");
		double TD = input.nextDouble();
		
		System.out.println("Enter interception (INT):");
		double INT = input.nextDouble();

		input.close();
		
		double a = ((COMP / ATT * 100) - 30) * .05;
			if (a < 0)
			a = 0;
			else if (a > 2.375)
			a = 2.375;
		
		double b = ((YDS / ATT) - 3) * .25;
			if (b < 0)
			b = 0;
			else if (b > 2.375)
			b = 2.375;
		
		double c = (TD / ATT * 100) * .2;
			if (c < 0)
			c = 0;
			else if (c > 2.375)
			c = 2.375;
			
		double d = 2.375 - ((INT / ATT * 100) * .25);
			if (d < 0)
			d = 0;
			else if (d > 2.375)
			d = 2.375;
		
		double passerRating = (a + b + c + d) / 6 * 100;
		
		
		System.out.println("The passer rating is" + passerRating);
		
		System.out.printf("The passer rating is:%.1f",passerRating);
	}

}
