package NYT;

import java.util.Scanner;

public class MainMenue {

	
	static void menue() {
	System.out.println("__________________________________________________________________________________________");
	System.out.println("Welcome!! To the Article Search API Please Select one of the following options :) :       |");
	System.out.println(" 1. Create Author Table in database                                                       |");
	System.out.println(" 2. Fetch Author API and Read                                                             |");
	System.out.println(" 3. Insert Author API to database table                                                   |");
	System.out.println("*********Articles*********                                                                |");
	System.out.println(" 4. Create Articles Table in database                                                     |");
	System.out.println(" 5. Fetch Articles API and Read                                                           |");
	System.out.println(" 6. Insert Articles API to database table                                                 |");
	System.out.println("*********Sections*********                                                                |");
	System.out.println(" 7. Create Sections Table in database                                                     |");
	System.out.println(" 8. Fetch Sections API and Read                                                           |");
	System.out.println(" 9. Insert Sections API to database table                                                 |");
	System.out.println(" 19. Exit System                                                                          |");
	System.out.println("__________________________________________________________________________________________|");
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
				System.out.println("Fetching the Author API and Reading Please Wait ......!");
				FetchAPIRead.readAuthorApi();

				menue();
				break;

			// Insert Author API to database table
			case 3:
				InsertValues.insertAuthorData();
				
				menue();
				break;

				
				// Create Articles Table in database
			case 4:
				CreateTables.createArticleTable();
				
				menue();
				break;

			// Fetch Articles API and Read
			case 5:
				System.out.println("Fetching the Articles API and Reading Please Wait ......!");
				FetchAPIRead.readArticalsApi();
				

				menue();
				break;

			// Insert Articles API to database table
			case 6:
				InsertValues.insertArticleData();
				
				menue();
				break;
			
				// Create Sections Table in database
			case 7:
				CreateTables.createSectionTable();
				
				menue();
				break;

			// Fetch Section API and Read
			case 8:
				System.out.println("Fetching the Sections API and Reading ......!");
				FetchAPIRead.readSectionsApi();

				menue();
				break;

			// Insert Articles API to database table
			case 9:
				InsertValues.insertSectionData();
				

				menue();
				break;


			// Exit the System
			case 19:
				System.out.println("Exiting The System Bye See you Again :)!...");
				System.exit(0);

			}

		} while (true);

	}

}
