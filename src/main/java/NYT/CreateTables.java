package NYT;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTables {

	static void createAuthorTable() throws Throwable {
		// Creating the connection using Oracle DB
		// Note: url syntax is standard, so do grasp
		String DB_URL = "jdbc:sqlserver://localhost:1433;databaseName=MavenApi;encrypt=true;trustServerCertificate=true";

		// Username and password to access DB
		// Custom initialization
		String USER = "sa";
		String PASS = "root";
		try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
				Statement stmt = conn.createStatement();) {
			// Create Table in SQL
			String createTabelAuthorSQL = "CREATE TABLE AuthorT " + "(Id INTEGER PRIMARY KEY IDENTITY(1,1), "
					+ " num_results Integer, " + " display_name VARCHAR(50), " + " list_name_encoded VARCHAR(50), "
					+ " published_date VARCHAR(50), " + "published_date_description TEXT, "
					+ " publisher VARCHAR(50), " + "description TEXT, " + " price VARCHAR(10), "
					+ "title TEXT, " + "author TEXT)";

			stmt.executeUpdate(createTabelAuthorSQL);
			System.out.println("API Table Created Successfully in Database ... :)");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}// close createAuthorTable Function
}// End of Class CreateAuthorTable
