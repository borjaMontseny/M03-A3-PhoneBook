import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PhoneBook pb = new PhoneBook();
		Scanner sc = new Scanner(System.in);
		String targetName = " ";
		PhoneEntry entry = null;

		executeSearchProgram(pb, entry, targetName, sc);

		sc.close();
	}

	public static String askTargetName(Scanner sc) {
		System.out.print("Name: ");
		String targetName = sc.nextLine();
		return targetName;
	}

	public static void executeSearchProgram(PhoneBook pb, PhoneEntry entry, String targetName, Scanner sc) {

		while (!(targetName.equalsIgnoreCase("quit"))) {
			targetName = askTargetName(sc);
			entry = pb.search(targetName);

			if (entry != null) {
				System.out.println("The number is " + entry.getPhone() + "\n");
			} else if (targetName.equalsIgnoreCase("quit")) {
				System.out.println("Good Bye.");
			} else {
				System.out.println("Name not found\n");
			}
		}

	}

}
