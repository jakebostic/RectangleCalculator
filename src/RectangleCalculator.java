import java.util.Scanner;

public class RectangleCalculator {

	public static void main(String[] args) {
		System.out.println("Welcome to the Area and Perimiter Calculator");
		//finishes step number 1
		
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.print("Enter length:  ");
			int length = sc.nextInt();
			System.out.println();

			System.out.print("Enter width:  ");
			int width = sc.nextInt();
			System.out.println();
			// finishes step number 2

			double area = length * width;
			double perimiter = 2 * length + 2 * width;

			System.out.println("Area " + area);
			System.out.println("Perimiter " + perimiter);
			System.out.println();
			System.out.println("Continue? (y/n)");
			choice = sc.next();
			// break between run of code and close of program
				
		
		}
	    sc.close();
		System.out.println("Bye!");

	}

}
