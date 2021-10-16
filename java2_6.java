package git_demo;
import java.util.Scanner;
public class java2_6 {
  public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner input =new Scanner (System.in);
    System.out.print("Enter a dgree in Fahrenheit:");
    double fahrenheit = input.nextDouble();
    double celsius = (5.0/9)*(fahrenheit-32);
    System.out.println("Fahrenheit "+fahrenheit +" is "+celsius +" in Celsius");
	}
}
