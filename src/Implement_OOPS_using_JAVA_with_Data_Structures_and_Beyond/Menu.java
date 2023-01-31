package Implement_OOPS_using_JAVA_with_Data_Structures_and_Beyond;
import java.lang.StackWalker.Option;
import java.util.Scanner;

public class Menu {
	private Operation operation;

	public Menu() {
		// TODO Auto-generated constructor stub
		this.operation = new Operation();
	}
	
	//About
	public void about() {
		System.out.println("About LockedMe.com"
				+ "\n\nCompany: Company Lockers Pvt. Ltd "
				+ "\nVerzion: v1.0"
				+ "\nProject: Java Full Stack Developer 2022 program"
				+ "\nModule: Implement OOPS using JAVA with Data Structures and Beyond"
				+ "\n\n*******Developer details***********"
				+ "\nName: Francisco Ramalho Salavador Libele"
				+ "\nEmail: Francisco.Libele@vm.co.mz"
				+ "\nCountry: Mozamnique "
				+ "\ncontact: +25884990 2247"
				+ "\nUsername: libelef"
				+ "\n\n*************************"
				+ "\n0. Main Menu");
		
		Scanner scan = new Scanner(System.in);
		try {
			byte option = Byte.parseByte(scan.next());	
			switch (option) {
	
		case 0: {
				mainMenu();break;
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
	
	//List Menu 
	public void menuList() {
		Operation op =new Operation();
		op.listFiles("src/Files");
		System.out.println("\n\n*************************"
				+ "\nSelect an option"
				+ "\n0. Main Menu");
		
		Scanner scan = new Scanner(System.in);
		try {
			byte option = Byte.parseByte(scan.next());	
			switch (option) {
	
		case 0: {
				mainMenu();break;
			}
			default:
				//throw new IllegalArgumentException("Unexpected value: " + option);
				System.out.println("Invalid option. Please , select a valid!");menuList();
			}
		} catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println("Invalid Input!"
					+ "Note: Input should be a number. Please try again \n\n");mainMenu();
		}	
	}
	
	//Main Menu
	public void mainMenu () {
		
			System.out.println("\n**************************************"
					+ "\nWelcome to Company Lockers Pvt. Ltd\n"
					+ "LockedMe.com");
			System.out.println("Select an Option"
					+ "\n*****************************\n"
					+ "\n1. List files in order"
					+"\n2. File operations Manager"
					+ "\n3. About"
					+ "\n0. Exit");
		
			Scanner scan = new Scanner(System.in);
			try {
				byte option = Byte.parseByte(scan.next());	
				switch (option) {
				case 1: {
					menuList();break;
				}
				case 2: {
					menuFileOperation();break;
				}
				case 3: {
					about();break;
				}
			case 0: {
					System.out.println("Exiting..."
							+ "\nThank you!");
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
	
	public void menuFileOperation () {
		Operation op = new Operation();
		System.out.println("\n********************************** \nFile Manager Menu "
				+ "\nSelect a  option"
				+ "\n****************************\n"
				+ "\n1. Add file"
				+ "\n2. Delete file "
				+ "\n3. Search file"
				+ "\n0. Main Menu");
		
		Scanner scan = new Scanner(System.in);
		try {
			byte option = Byte.parseByte(scan.next());	
			switch (option) {
			
			case 1: {
				op.addFile();menuFileOperation();break;
			}
			case 2: {
				op.deleteFile();menuFileOperation();break;
			}
			case 3: {
				op.find();menuFileOperation();break;
			}
	
			case 0: {
				mainMenu();break;
			}
			default:
				//throw new IllegalArgumentException("Unexpected value: " + option);
				System.out.println("Invalid option. Please , select a valid!");menuFileOperation();
			}
		} catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println("Invalid Input!"
					+ "Note: Input should be a number. Please try again \n\n");mainMenu();
		}	
		
	}

	//Menu search
	public void menuSearch() {
		Operation op =new Operation();
		op.listFiles("src/Files");
		System.out.println("\n\n*************************"
				+ "\nSelect an option"
				+ "\n1. Search"
				+ "\n0. Main Menu");
		
		Scanner scan = new Scanner(System.in);
		try {
			byte option = Byte.parseByte(scan.next());	
			switch (option) {
			case 1: {
				op.find();menuSearch();break;
			}
	
		case 0: {
				mainMenu();break;
			}
			default:
				//throw new IllegalArgumentException("Unexpected value: " + option);
				System.out.println("Invalid option. Please , select a valid!");mainMenu();break;
			}
		} catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println("Invalid Input!"
					+ "Note: Input should be a number. Please try again \n\n");mainMenu();
		}	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Menu menu = new Menu();

		menu.mainMenu();

	}

}
