//Aaron Goode
//Calculates the hypotenuse of a triangle given the length of two legs
//HW1
import java.util.Scanner;
public class hypotenuse {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		double x,y,z;
		System.out.println("Enter the length of the first leg: ");
		x = console.nextDouble();
		
		System.out.println("Enter the length of the second leg: ");
		y = console.nextDouble();
		
		z = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
		System.out.printf("The length of the hypotenuse is %.2f%n", z);
		
		console.close();

	}

}
