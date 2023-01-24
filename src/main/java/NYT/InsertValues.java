package NYT;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public class InsertValues {

	static void insertAuthorData() throws Throwable {
		// Creating the connection using Oracle DB
		// Note: url syntax is standard, so do grasp
		String databaseUrl = "jdbc:sqlserver://localhost:1433;databaseName=MavenApi;encrypt=true;trustServerCertificate=true";

		// Username and password to access DB
		// Custom initialization
		String user = "sa";
		String pass = "root";

		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder().uri(URI.create(
				"https://api.nytimes.com/svc/books/v3/lists/current/hardcover-fiction.json?api-key=dD7hVCpoHahSk3JjnY2uYvDigiRvyniM"))
				.build();
		HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
		String jsonString = response.body();

		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		JsonParser jasonParserNew = new JsonParser();
		JsonElement jasonElementNew = jasonParserNew.parse(jsonString);
		String jsonData = gson.toJson(jasonElementNew); // prettyJson
		// System.out.println(jsonData);
		AuthorMain randomAPIVAriable = gson.fromJson(jsonData, AuthorMain.class);

		// for (Integer i = 0; i < jsonString.length(); i++) { // has length more than
		// its range // This was an error and it is fixed now

		for (Integer i = 0; i < randomAPIVAriable.getResults().getBooks().length; i++) {

			Integer num_results = randomAPIVAriable.getNum_results();
			String display_name = randomAPIVAriable.getResults().getDisplay_name();
			String list_name_encoded = randomAPIVAriable.getResults().getList_name_encoded();
			String published_date = randomAPIVAriable.getResults().getPublished_date();
			String published_date_description = randomAPIVAriable.getResults().getPublished_date_description();
			String publisher = randomAPIVAriable.getResults().getBooks()[i].getPublisher();
			String description = randomAPIVAriable.getResults().getBooks()[i].getDescription();
			String price = randomAPIVAriable.getResults().getBooks()[i].getPrice();
			String title = randomAPIVAriable.getResults().getBooks()[i].getTitle();
			String author = randomAPIVAriable.getResults().getBooks()[i].getAuthor();

			// Inserting data using SQL query
			String sqlInsertAuthor = "insert into AuthorT (num_results,display_name, list_name_encoded,	published_date,	published_date_description,	publisher,description, price,	title,	author)"
					+ " values('" + num_results + "' ,'" + display_name + "', '" + list_name_encoded + "','"
					+ published_date + "' ,' " + published_date_description + "','" + publisher + "','" + description
					+ "','" + price + "','" + title + "','" + author + "')";

			// Connection class object
			Connection con = null;

			// Try block to check for exceptions
			try {

				Driver driver = (Driver) Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
				DriverManager.registerDriver(driver);
				con = DriverManager.getConnection(databaseUrl, user, pass);

				// Creating a statement
				Statement st = con.createStatement();

				// Executing query
				int s = st.executeUpdate(sqlInsertAuthor);
				if (s >= 1)
					System.out.println("Inserted successfully : " + sqlInsertAuthor);
				else
					System.out.println("Insertion failed");

				// Closing the connections
				con.close();
			}

			// Catch block to handle exceptions
			catch (Exception ex) {
				// Display message when exceptions occurs
				System.err.println(ex);
			}

		}
	}// End of Function insertAuthorData
	
	static void insertArticleData() throws Throwable {
		// Creating the connection using Oracle DB
		// Note: url syntax is standard, so do grasp
		String databaseUrl = "jdbc:sqlserver://localhost:1433;databaseName=MavenApi;encrypt=true;trustServerCertificate=true";

		// Username and password to access DB
		// Custom initialization
		String user = "sa";
		String pass = "root";

		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder().uri(URI.create(
				"https://api.nytimes.com/svc/mostpopular/v2/shared/1/facebook.json?api-key=dD7hVCpoHahSk3JjnY2uYvDigiRvyniM"))
				.build();
		HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
		String jsonString = response.body();

		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		JsonParser jasonParserNew = new JsonParser();
		JsonElement jasonElementNew = jasonParserNew.parse(jsonString);
		String jsonData = gson.toJson(jasonElementNew); // prettyJson
		// System.out.println(jsonData);
		ArticleMain randomAPIVAriable = gson.fromJson(jsonData, ArticleMain.class);

		 //for (Integer i = 0; i < jsonString.length(); i++) { // has length more than
		// its range // This was an error and it is fixed now
       int x = randomAPIVAriable.getResults().length;
		for (Integer i = 0; i <x; i++) {
						
			Integer num_results = randomAPIVAriable.getNum_results();
			String source = randomAPIVAriable.getResults()[i].getSource();
			String published_date = randomAPIVAriable.getResults()[i].getPublished_date();
			String section = randomAPIVAriable.getResults()[i].getSection();
			String byline = randomAPIVAriable.getResults()[i].getByline();
			String type =  randomAPIVAriable.getResults()[i].getType();
			String title =  randomAPIVAriable.getResults()[i].getTitle();

			// Inserting data using SQL query
			String sqlInsertArticle = "insert into ArticleT (num_results,source, published_date, section, byline, type,title)"
					+ " values('" + num_results + "' ,'" + source + "', '" + published_date + "','"
					+ section + "' ,' " + byline + "','" + type + "','" + title + "')";

			// Connection class object
			Connection con = null;

			// Try block to check for exceptions
			try {

				Driver driver = (Driver) Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
				DriverManager.registerDriver(driver);
				con = DriverManager.getConnection(databaseUrl, user, pass);

				// Creating a statement
				Statement st = con.createStatement();

				// Executing query
				int s = st.executeUpdate(sqlInsertArticle);
				if (s >= 1)
					System.out.println("Inserted successfully : " + sqlInsertArticle);
				else
					System.out.println("Insertion failed");

				// Closing the connections
				con.close();
			}

			// Catch block to handle exceptions
			catch (Exception ex) {
				// Display message when exceptions occurs
				System.err.println(ex);
			}

		}
	}// End of Function insertArticleData
	
	
	
	
	
	
	
	
	
	
	
} // End of Class InsertValues
