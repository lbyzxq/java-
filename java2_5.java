package git_demo;
import java.util.Scanner;
public class java2_5 {
  public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner input=new Scanner(System.in);
    System.out.print("Enter an integer for second: ");
    int Second = input.nextInt();
    int minutes = Second/60;
    int remainingSecond = Second % 60;
    System.out.println(Second+" Second is "+ minutes + " minutes and " + remainingSecond +" Second");
	}
}
