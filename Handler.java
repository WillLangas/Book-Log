import java.util.Scanner;
import java.util.ArrayList;

public class Handler {
	public static void main(String[] args) {
		System.out.println("##############################");
		System.out.println("#                            #");
		System.out.println("#   Welcome to Book Logger   #");
		System.out.println("#   Written by Will Langas   #");
		System.out.println("#                            #");
		System.out.println("##############################");

		Scanner scnr = new Scanner(System.in);
		ArrayList<Book> bookList = new ArrayList<Book>(1);

		char optionKey = 'a';
		
		do {
			System.out.println("Please select one of the following actions");
			System.out.println("1) Log a new book");
			System.out.println("2) Remove a book from log");
			System.out.println("3) List all books in log");
			System.out.println("4) Analyze book log");
			System.out.println("5) Save book log to file");

			optionKey = scnr.next().charAt(0);

			switch (optionKey){
				case '1': 
					// TO DO: Implement adding new book instance
					break;
				case '2':
					// TO DO: Implement removing a book from the arrayList
					break;
				case '3': 
					// TO DO: Implement listing all the books
					break;
				case '4':
					// TO DO: Perform analysis options, should this lead to new options?
					break;
				case '5': 
					// TO DO: Implement file writer
					break;
				default:
					System.out.println("Unrecognized action, please try again");
			}

		} while (optionKey != 'q');
	}
}
