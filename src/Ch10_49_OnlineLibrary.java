import java.util.Scanner;
public class Ch10_49_OnlineLibrary {
	
static class Library{
	  Scanner input1 = new Scanner(System.in);
		String [] Books = {"Ulysses" , "In Search of Lost Time" , "The Great Gatsby" , "One Hundred Years of Solitude" , "The Catcher in the Rey"
		, "The Diary of a Wimpy Kid - The Last Straw" , "Tom Gates - A Tiny bit Lucky"};	
		
		
		
		
		public void addBooks(){
			
			System.out.print("Enter the name of the book you want to add: "); String newBook = input1.nextLine();
			String [] newBooks = {newBook};
			
			System.out.println();
			
			System.out.println("New List of Books is:");
			showAvailableBooks();
			System.out.println("~ " + newBooks[0]);
			
		}
		
		public void issueBooks(){
			System.out.print("From the available books select the book you want to issue: "); String issued = input1.nextLine();
			String [] issueBooks = {issued};
			System.out.printf("\nReceipt:\nBook Issued: %s (return within 2 Weeks)\nThank You!! " , issueBooks[0]);
			
		}
		
		public void returnBooks(){
			System.out.println();
			System.out.println("Returning Your Issued Book...");
			System.out.println("Thank You!!");
			
		}
		
		public void showAvailableBooks(){
		 for (String Element : Books){
				System.out.println("~ " + Element);
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		
		/* 1. Create a class Library
			 2. Use methods: addBooks , issueBooks , returnBooks , showAvailableBooks
			 3. properties: array to store books , array to store the issued books
		*/
		
		Scanner input = new Scanner(System.in);
		
		Library obj = new Library();
		System.out.println("Available Books are:");
		obj.showAvailableBooks();
		
		System.out.println();
		System.out.println("*********");
		System.out.println(); 
		
		System.out.println("Enter the choice you want to proceed with:");
		System.out.println("1. Add Books");
		System.out.println("2. Issue Books");
		System.out.println("3. Return Issued Books");
		System.out.println();
		System.out.print("Your Choice:- ");
		int choice = input.nextInt();
		
			if (choice == 1){
			obj.addBooks();
			}
		  else if (choice == 2){
			obj.issueBooks();
		 }
		  else if (choice == 3){
			obj.returnBooks();
		}
		else{
		System.out.println("Enter a valid choice");
		}
		
	}
}