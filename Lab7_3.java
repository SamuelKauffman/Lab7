import java.util.Scanner;

public class Lab7_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a year: ");
		int Year = scan.nextInt();
		if(Year % 4 == 0 && Year != 0) {
			System.out.println("Leap year!");
		}
		else {
			System.out.println("Not leap year.");
		}
	}

}
