package git_demo;
import java.util.Scanner;
public class java2_9 {
  ublic static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner input = new Scanner(System.in);
    double annualInteresRate = input.nextDouble();
    
    double monthlyInterestRate = annualInteresRate / 1200;
    
    System.out.print("Enter number of years as an integer,e.g., 5:");
    int numberOfYears = input.nextInt();
    
    System.out.print("Enter loan amount,e.g., 120000.95: ");
    
    double loanAmount = input.nextDouble();
    
    double monthlyPayment = loanAmount * monthlyInterestRate / (1-1/Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
    
    double totalPayment = monthlyPayment * numberOfYears * 12;
    
    System.out.println("The monthly payment is $" + (int)(monthlyPayment * 100) / 100.0);
    System.out.println("The total payment is $" + (int)(totalPayment * 100) / 100.0);
    
	}
}
