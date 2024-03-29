package NYT;

public class Results {
	private String list_name;
	private String list_name_encoded;
	private String bestsellers_date;
	private String published_date;
	private String published_date_description;
	private String next_published_date;
	private String previous_published_date;
	private String display_name;
	private Integer normal_list_ends_at;
	private String updated;
	private Books[] books;

	public String getList_name() {
		return list_name;
	}

	public void setList_name(String list_name) {
		this.list_name = list_name;
	}

	public String getList_name_encoded() {
		return list_name_encoded;
	}

	public void setList_name_encoded(String list_name_encoded) {
		this.list_name_encoded = list_name_encoded;
	}

	public String getBestsellers_date() {
		return bestsellers_date;
	}

	public void setBestsellers_date(String bestsellers_date) {
		this.bestsellers_date = bestsellers_date;
	}

	public String getPublished_date() {
		return published_date;
	}

	public void setPublished_date(String published_date) {
		this.published_date = published_date;
	}

	public String getPublished_date_description() {
		return published_date_description;
	}

	public void setPublished_date_description(String published_date_description) {
		this.published_date_description = published_date_description;
	}

	public String getNext_published_date() {
		return next_published_date;
	}

	public void setNext_published_date(String next_published_date) {
		this.next_published_date = next_published_date;
	}

	public String getPrevious_published_date() {
		return previous_published_date;
	}

	public void setPrevious_published_date(String previous_published_date) {
		this.previous_published_date = previous_published_date;
	}

	public String getDisplay_name() {
		return display_name;
	}

	public void setDisplay_name(String display_name) {
		this.display_name = display_name;
	}

	public Integer getNormal_list_ends_at() {
		return normal_list_ends_at;
	}

	public void setNormal_list_ends_at(Integer normal_list_ends_at) {
		this.normal_list_ends_at = normal_list_ends_at;
	}

	public String getUpdated() {
		return updated;
	}

	public void setUpdated(String updated) {
		this.updated = updated;
	}

	public Books[] getBooks() {
		return books;
	}

	public void setBooks(Books[] books) {
		this.books = books;
	}

}
