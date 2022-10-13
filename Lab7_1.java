import java.util.Scanner;

public class Lab7_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("How much gas can your car hold? ");
		double capacity = scan.nextInt();
		System.out.println("How much gas is in your car? ");
		double amount = scan.nextInt();
		double level = amount/capacity;
		if(level<.25) {
			System.out.println("You have less than a quarter of a tank.");
		}
		else if(level<.50) {
				System.out.println("You have less than half a tank.");
			}
		else if(level<.75) {
			System.out.println("You have less than three quarters of a tank.");
		}
		else if(level>.75 && level<1) {
			System.out.println("Almost a full tank.");
		}
		else {
			System.out.println("Invalid!");
		}
			
		
	}

}
