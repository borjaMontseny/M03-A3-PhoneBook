
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PhoneBook pb = new PhoneBook();

		// Search for "Violet Smith"
		PhoneEntry entry = pb.search("Violet Smith");

		if (entry != null) {
			System.out.println(entry.name + ": " + entry.phone);

		} else {
			System.out.println("Name not found");
		}
	}

}
