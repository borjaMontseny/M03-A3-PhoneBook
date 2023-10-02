import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PhoneBook pb = new PhoneBook();

		Scanner sc = new Scanner(System.in);
		String targetName = " ";
		PhoneEntry entry = null;

		while (!(targetName.equalsIgnoreCase("quit"))) {
			System.out.print("Name: ");
			targetName = sc.nextLine();
			entry = pb.search(targetName);

			if (entry != null) {
				System.out.println("The number is " + entry.getPhone() + "\n");
			} else if (targetName.equalsIgnoreCase("quit")) {
				System.out.println("Good Bye.");
			} else {
				System.out.println("Name not found\n");
			}
		}

		sc.close();
	}

}
