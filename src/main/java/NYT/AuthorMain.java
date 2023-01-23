package NYT;

public class AuthorMain {
	private String copyright;
	private Integer num_results;
	private String last_modified;
	private Results results;

	public String getCopyright() {
		return copyright;
	}

	public void setCopyright(String copyright) {
		this.copyright = copyright;
	}

	public Integer getNum_results() {
		return num_results;
	}

	public void setNum_results(Integer num_results) {
		this.num_results = num_results;
	}

	public String getLast_modified() {
		return last_modified;
	}

	public void setLast_modified(String last_modified) {
		this.last_modified = last_modified;
	}

	public Results getResults() {
		return results;
	}

	public void setResults(Results results) {
		this.results = results;
	}

}