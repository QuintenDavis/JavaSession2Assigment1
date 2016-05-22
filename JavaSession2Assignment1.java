import java.util.Scanner;

public class JavaSession2Assignment1 {

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		System.out.print("Enter your age.....");
		int age = s.nextInt();
		if(age >= 18)
		{
			System.out.println("Your eligible to vote");
		}
		else
		{
			System.out.println("Your not eligible to vote");
		}
	}
	
}	
