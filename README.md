# M03-A3-PhoneBook

Modify the program so that it asks the user for the person to look up:

```
Name: 
Violet Smith
The number is: (312) 223-1937 

Name:
James Barclay
The number is: (418) 665-1223 

Name: 
Scott Eccles
Name not found.

Name: quit
good-by
```

Of course, the user must enter the name exactly for a match to be found. To make things a little easier, use the **toUpperCase()** method of class **String** to convert the target name and each array name to upper case when equality is being tested. Now the name the user enters need not match upper and lower case exactly.

Another improvement: rewrite the **search()** method to use just one return. You will need to rewrite new code in another classes and methods.

This is the original version of the program:

```
class PhoneEntry {

	// Name of a person
	String name;
	// Their phone number
	String phone;

	PhoneEntry (String name, String phone) { 
		this.name = name;
		this.phone = phone; 
	}
}

class PhoneBook { 

	PhoneEntry[] phoneBook;

  // Constructor
  PhoneBook() {
		phoneBook = new PhoneEntry[5];
		phoneBook[0] = new PhoneEntry("James Barclay", "(418)665- 1223");
		phoneBook[1] = new PhoneEntry("Grace Dunbar", "(860)399- 3044");
		phoneBook[2] = new PhoneEntry("Paul Kratides", "(815)439- 9271");
		phoneBook[3] = new PhoneEntry("Violet Smith", "(312)223- 1937");
		phoneBook[4] = new PhoneEntry("John Wood", "(913)883- 2874");
	}

	PhoneEntry search (String targetName) {
		for (int j = 0; j < phoneBook.length; j++) {
			if (phoneBook[j].name.equals(targetName)) {
				return phoneBook[j];
			}
		}
		return null;
	}
}


class PhoneBookTester {

	public static void main (String[] args) {
		PhoneBook pb = new PhoneBook();

		// Search for "Violet Smith"
		PhoneEntry entry = pb.search( "Violet Smith" );

		if (entry != null) {
			System.out.println(entry.name + ": " + entry.phone );

		} else {
			System.out.println("Name not found"); 
		}
	} 
}
```