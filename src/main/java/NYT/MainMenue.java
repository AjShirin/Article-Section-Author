package NYT;

import java.util.Scanner;

public class MainMenue {

	
	static void menue() {
	System.out.println("__________________________________________________________________________________________");
	System.out.println("Welcome!! To the Article Search API Please Select one of the following options :) :      |");
	System.out.println(" [1] Create Author Table in database                                                       |");
	System.out.println(" [2] Fetch Author API and Read                                                             |");
	System.out.println(" [3] Insert Author API to database table                                                   |");
	System.out.println(" [4] Update Author Table Record                                                            |");
	System.out.println(" [5] Delete Author Table Record                                                            |");
	System.out.println(" [6]  Print Author Record by user input                                                     |");
	System.out.println("*********Articles*********                                                               |");
	System.out.println(" [7] Create Author Table in database                                                       |");
	System.out.println(" [8] Fetch Articles API and Read                                                           |");
	System.out.println(" [9] Insert Articles API to database table                                                 |");
	System.out.println(" [10]  Update Articles Table Record                                                         |");
	System.out.println(" [11] Delete Articles Table Record                                                         |");
	System.out.println(" [12]  Print Articles Record by user input                                                  |");
	System.out.println("*********Sections*********                                                               |");
	System.out.println(" [13] Create Sections Table in database                                                    |");
	System.out.println(" [14] Fetch Sections API and Read                                                          |");
	System.out.println(" [15] Insert Sections API to database table                                                |");
	System.out.println(" [16] Update Sections Table Record                                                         |");
	System.out.println(" [17] Delete Sections Table Record                                                         |");
	System.out.println(" [18] Print Sections Record by user input                                                  |");
	System.out.println(" [19] Exit System                                                                          |");
	System.out.println("_________________________________________________________________________________________|");
}

	public static void main(String[] args) throws Throwable {

		Scanner sc = new Scanner(System.in);

		menue();
		do {

			int Menue = sc.nextInt();
			switch (Menue) {

			// Since The function is Static no need to create new object
			// Create Author Table in database
			case 1:
				CreateTables.createAuthorTable();
				
				menue();
				break;

			// Fetch Author API and Read
			case 2:
				System.out.println("Fetching the Author API and Reading ......!");
				FetchAPIRead.readAuthorApi();

				menue();
				break;

			// Insert Author API to database table
			case 3:
				InsertValues.insertAuthorData();
				
				menue();
				break;

			// Update Author Table Record By ID
			case 4:
			

				//menue();
				break;

			// Delete Author Table Record By ID
			case 5:
				

				//menue();
				break;

			// Print Author Record by user input
			case 6:
			

				//menue();
				break;
				
				// Create Articles Table in database
			case 7:
				

				//menue();
				break;

			// Fetch Articles API and Read
			case 8:
				System.out.println("Fetching the Articles API and Reading ......!");
				FetchAPIRead.readArticalsApi();
				

				menue();
				break;

			// Insert Articles API to database table
			case 9:
				

				//menue();
				break;

			// Update Articles Table Record By ID
			case 10:
			

				//menue();
				break;

			// Delete Articles Table Record By ID
			case 11:
				

				//menue();
				break;

			// Print Articles Record by user input
			case 12:
			

				//menue();
				break;
				
				// Create Sections Table in database
			case 13:
				
				//menue();
				break;

			// Fetch Articles API and Read
			case 14:
				System.out.println("Fetching the Sections API and Reading ......!");
				FetchAPIRead.readSectionsApi();

				

				menue();
				break;

			// Insert Articles API to database table
			case 15:
				

				//menue();
				break;

			// Update Articles Table Record By ID
			case 16:
			

				//menue();
				break;

			// Delete Articles Table Record By ID
			case 17:
				

				//menue();
				break;

			// Print Articles Record by user input
			case 18:
			

				//menue();
				break;


			// Exit the System
			case 19:
				System.out.println("Exiting The System Bye See you Again :)!...");
				System.exit(0);

			}

		} while (true);

	}

}
