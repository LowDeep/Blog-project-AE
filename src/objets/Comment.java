package objets;

public class Comment {

	/**
	 * The comment's author user.
	 */
	private int idA;
	
	/**
	 * The post's author user.
	 */
	private int idP;
	
	/**
	 * The comment's date.
	 */
	private int datecomment;
	
	/**
	 * The comment's content.
	 */
	private String contentcomment;
	
	public Comment() {
		
	}

	public Comment(int idA, int idP, int datecomment, String contentcomment) {

		this.idA = idA;
		this.idP = idP;
		this.datecomment = datecomment;
		this.contentcomment = contentcomment;
	}

	public int getIdA() {
		return idA;
	}

	public void setIdA(int idA) {
		this.idA = idA;
	}

	public int getIdP() {
		return idP;
	}

	public void setIdP(int idP) {
		this.idP = idP;
	}

	public int getDatecomment() {
		return datecomment;
	}

	public void setDatecomment(int datecomment) {
		this.datecomment = datecomment;
	}

	public String getContentcomment() {
		return contentcomment;
	}

	public void setContentcomment(String contentcomment) {
		this.contentcomment = contentcomment;
	}
	
	
	
}
