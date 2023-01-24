package NYT;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;



public class FetchAPIRead {
	static void readAuthorApi() throws Throwable {

		// Creating the connection using Oracle DB
		// Note: url syntax is standard, so do grasp
		String databaseUrl = "jdbc:sqlserver://localhost:1433;databaseName=MavenApi;encrypt=true;trustServerCertificate=true";

		// Username and password to access DB
		// Custom initialization
		String user = "sa";
		String pass = "root";

		try (Connection conn = DriverManager.getConnection(databaseUrl, user, pass);
				Statement stmt = conn.createStatement();) {
			HttpClient client = HttpClient.newHttpClient();
			HttpRequest request = HttpRequest.newBuilder()
					.uri(URI.create("https://api.nytimes.com/svc/books/v3/lists/current/hardcover-fiction.json?api-key=dD7hVCpoHahSk3JjnY2uYvDigiRvyniM")).build();
			HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
			String jsonString = response.body();

			Gson gson = new GsonBuilder().setPrettyPrinting().create();
			JsonParser jasonParserNew = new JsonParser();
			JsonElement jasonElementNew = jasonParserNew.parse(jsonString);
			String jsonData = gson.toJson(jasonElementNew); // prettyJson
			System.out.println(jsonData);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}// End of readAuthorApi Function
	static void readSectionsApi() throws Throwable{
		// Creating the connection using Oracle DB
		// Note: url syntax is standard, so do grasp
		String databaseUrl = "jdbc:sqlserver://localhost:1433;databaseName=MavenApi;encrypt=true;trustServerCertificate=true";

		// Username and password to access DB
		// Custom initialization
		String user = "sa";
		String pass = "root";

		try (Connection conn = DriverManager.getConnection(databaseUrl, user, pass);
				Statement stmt = conn.createStatement();) {
			HttpClient client = HttpClient.newHttpClient();
			HttpRequest request = HttpRequest.newBuilder()
					.uri(URI.create("https://api.nytimes.com/svc/search/v2/articlesearch.json?q=election&api-key=dD7hVCpoHahSk3JjnY2uYvDigiRvyniM")).build();
			HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
			String jsonString = response.body();

			Gson gson = new GsonBuilder().setPrettyPrinting().create();
			JsonParser jasonParserNew = new JsonParser();
			JsonElement jasonElementNew = jasonParserNew.parse(jsonString);
			String jsonData = gson.toJson(jasonElementNew); // prettyJson
			System.out.println(jsonData);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	} // End of function readSectionsApi
	static void readArticalsApi() throws Throwable{
		// Creating the connection using Oracle DB
		// Note: url syntax is standard, so do grasp
		String databaseUrl = "jdbc:sqlserver://localhost:1433;databaseName=MavenApi;encrypt=true;trustServerCertificate=true";

		// Username and password to access DB
		// Custom initialization
		String user = "sa";
		String pass = "root";

		try (Connection conn = DriverManager.getConnection(databaseUrl, user, pass);
				Statement stmt = conn.createStatement();) {
			HttpClient client = HttpClient.newHttpClient();
			HttpRequest request = HttpRequest.newBuilder()
					.uri(URI.create("https://api.nytimes.com/svc/mostpopular/v2/shared/1/facebook.json?api-key=dD7hVCpoHahSk3JjnY2uYvDigiRvyniM")).build();
			HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
			String jsonString = response.body();

			Gson gson = new GsonBuilder().setPrettyPrinting().create();
			JsonParser jasonParserNew = new JsonParser();
			JsonElement jasonElementNew = jasonParserNew.parse(jsonString);
			String jsonData = gson.toJson(jasonElementNew); // prettyJson
			System.out.println(jsonData);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	} // End of function readSectionsApi

} // End of Class FetchauthorsAPI

