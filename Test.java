
public class Test {

	public static void main(String[] args) {
		
		double amount = 12618.98; 
		double interestRate = 0.0013; 
		double interest = amount * interestRate; 
		System.out.println("Interest is " + interest); 
		System.out.printf("Interest is $%4.2f", interest);

		//It will print a line looking this (to the console): 
		//Interest is 16.404674 

		//Use the printf function so it will write the following line: 

		//Interest is $16.40 
		
	}

}
