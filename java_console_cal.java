package August4;

import java.util.Scanner;

public class java_console_cal {

		//java console calculate
	double a, b;
		
		public static double add( double a ,double b) {
			return a+b;
		}
		
		public static double substract(double a,double b) {
			return a-b;
		}
		
		public static double multiplication(double a,double b) {
			return a*b;
		}
		
		public static double divide(double a,double b) {
			if(b==0) {
				System.out.println("Error:cannot divide by zero");
				return Double.NaN;
			}
			return a/b;
		}
			
      
public static void main(String[] args) {
	Scanner S1=new Scanner(System.in);
	boolean continueCalculation=true;
	
	System.out.println("---Welcome to basic Calculator--");
	while(continueCalculation) {
		System.out.println("\nEnter first number: ");
		double a=S1.nextDouble();
		System.out.println("\nEnter second number: ");
		double b=S1.nextDouble();
		System.out.println("choose operation(+,-,*,/):");
		char operator=S1.next().charAt(0);
		double result;
		
		switch(operator){
		case '+':
			result=add(a,b);
				break;
		case '-':
			result=substract(a,b);
			break;
		case '*':
			result=multiplication(a,b);
			break;
		case '/':
			result=divide(a,b);
			break;
			default:
				System.out.println("Invalid operator.");
				continue;
		}
		System.out.println("result: "+result);
		
		
		
		
	}
	
	

}
}