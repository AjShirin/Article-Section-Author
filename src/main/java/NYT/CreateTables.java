package NYT;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTables {

	static void createAuthorTable() throws Throwable {
		// Creating the connection using Oracle DB
		// Note: url syntax is standard, so do grasp
		String databaseUrl = "jdbc:sqlserver://localhost:1433;databaseName=MavenApi;encrypt=true;trustServerCertificate=true";

		// Username and password to access DB
		// Custom initialization
		String user = "sa";
		String pass = "root";
		try (Connection conn = DriverManager.getConnection(databaseUrl, user, pass);
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
	static void createArticleTable() throws Throwable {
		// Creating the connection using Oracle DB
		// Note: url syntax is standard, so do grasp
		String databaseUrl = "jdbc:sqlserver://localhost:1433;databaseName=MavenApi;encrypt=true;trustServerCertificate=true";

		// Username and password to access DB
		// Custom initialization
		String user = "sa";
		String pass = "root";
		try (Connection conn = DriverManager.getConnection(databaseUrl, user, pass);
				Statement stmt = conn.createStatement();) {
			// Create Table in SQL
			String createTabelArticleSQL = "CREATE TABLE ArticleT " + "(Id INTEGER PRIMARY KEY IDENTITY(1,1), "
					+ " num_results Integer, " + " source VARCHAR(100), " + " published_date TEXT, "
					+ " section VARCHAR(100), " + "byline TEXT, "
					+ "type VARCHAR(100), " + "title TEXT)";

			stmt.executeUpdate(createTabelArticleSQL);
			System.out.println("API Table Created Successfully in Database ... :)");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}// close createArticleTable Function
	static void createSectionTable() throws Throwable {
		// Creating the connection using Oracle DB
		// Note: url syntax is standard, so do grasp
		String databaseUrl = "jdbc:sqlserver://localhost:1433;databaseName=MavenApi;encrypt=true;trustServerCertificate=true";

		// Username and password to access DB
		// Custom initialization
		String user = "sa";
		String pass = "root";
		try (Connection conn = DriverManager.getConnection(databaseUrl, user, pass);
				Statement stmt = conn.createStatement();) {
			// Create Table in SQL

			String createTabelSectionSQL = "CREATE TABLE SectionT " + "(Id INTEGER PRIMARY KEY IDENTITY(1,1), "
					+ " lead_paragraph TEXT, " + " source VARCHAR(100), " + " pub_date VARCHAR(100), "
					+ " document_type VARCHAR(100), " + "section_name TEXT, "
					+ " type_of_material TEXT, " + "word_count INTEGER)";
			

			stmt.executeUpdate(createTabelSectionSQL);
			System.out.println("API Table Created Successfully in Database ... :)");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}// close createSectionTable Function




}// End of Class CreateAuthorTable
