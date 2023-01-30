package Implement_OOPS_using_JAVA_with_Data_Structures_and_Beyond;
import java.lang.StackWalker.Option;
import java.util.Scanner;

public class Menu {

	public Menu() {
		// TODO Auto-generated constructor stub
	}
	
	public void mainMenu () {
		
			System.out.println("Welcome to Company Lockers Pvt. Ltd\n");
			System.out.println("Select an Option\n"
					+ "\n1. User Management"
					+ "\n2. Produts"
					+ "\n0. Exit");
			System.out.println("\n***** Develoed by Francisco Libele****");
			Scanner scan = new Scanner(System.in);
			try {
				byte option = Byte.parseByte(scan.next());	
				switch (option) {
				case 1: {
					userMenu();break;
				}
			case 0: {
					System.out.println("Exiting"
							+ "\nBye Bye");
				}
				default:
					//throw new IllegalArgumentException("Unexpected value: " + option);
				}
			} catch (NumberFormatException e) {
				// TODO: handle exception
				System.out.println("Invalid Input!"
						+ "Note: Input should be a number. Please try again \n\n");mainMenu();
			}	
		
	}
	
	public void userMenu () {
		System.out.println("\nSelect an Option*"
				+ "\n1. Add"
				+ "\n2. Remove"
				+ "\n3. Search"
				+ "\n0. Back ");
		Scanner scan = new Scanner(System.in);
		try {
			byte option = Byte.parseByte(scan.next());
			switch (option) {
			case 1: {
				userMenu();break;
			}
		case 0: {		
				mainMenu();break;
			}
			default:
				//throw new IllegalArgumentException("Unexpected value: " + option);
			}
		} catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println("Invalid number entered!"
					+ "\n"+e.getMessage());userMenu();
		}	
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Menu menu = new Menu();

		menu.mainMenu();

	}

}
