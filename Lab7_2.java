import java.util.Scanner;

public class Lab7_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your employee number?");
		int Num = scan.nextInt();
		if(Num>=100 && Num<200){
			System.out.println("General Manager");
		}
		else if(Num>=200 && Num<300) {
			System.out.println("Supervisor");
		}
		else if(Num>=300 && Num<400) {
			System.out.println("Staff");
		}
		else if(Num>=400 && Num<500) {
			System.out.println("Contractor");
		}
		else {
			System.out.println("Invalid category");
		}
	}

}
