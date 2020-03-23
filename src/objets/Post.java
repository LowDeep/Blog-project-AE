package objets;

public class Post {

	/**
	 * The post's identifier.
	 * 
	 * Primary key autoincrement.
	 */
	private int idP;
	
	/**
	 * The post's author id.
	 */
	private int idU;
	
	/**
	 * The post's title.
	 */
	private String title;
	
	/**
	 * The post's content.
	 */
	private String content;
	
	/**
	 * The post's date.
	 */
	private int date;
	
	/**
	 * The post's city.
	 */
	private String cityPost;
	
	public Post() {
		
	}

	public Post(int idU, String title, String content, int date, String cityPost) {
		this.idU = idU;
		this.title = title;
		this.content = content;
		this.date = date;
		this.cityPost = cityPost;
	}

	public int getIdP() {
		return idP;
	}

	public void setIdP(int idP) {
		this.idP = idP;
	}

	public int getIdU() {
		return idU;
	}

	public void setIdU(int idU) {
		this.idU = idU;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public String getCityPost() {
		return cityPost;
	}

	public void setCityPost(String cityPost) {
		this.cityPost = cityPost;
	}
	
}
