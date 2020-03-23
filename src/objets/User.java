package objets;

/**
 * Represent a user as stored in the database.
 */
public class User
{
	/**
	 * The user's identifier.
	 * 
	 * Primary key autoincrement.
	 */
	private int id;
	
	/**
	 * The user's username.
	 */
	private String username;
	
	/**
	 * The user's firstname.
	 */
	private String firstname;
	
	/**
	 * The user's lastname.
	 */
	private String lastname;
	
	/**
	 * The user's age.
	 */
	private int age;
	
	/**
	 * The user's city.
	 */
	private String city;
	
	/**
	 * The user's sexe.
	 */
	private String sexe;
	
	/**
	 * The user's password.
	 */
	private String password;
	
	public User() {
		
	}

	public User(String username, String firstname, String lastname, int age, String city, String sexe,
			String password) {
		
		this.username = username;
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		this.city = city;
		this.sexe = sexe;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	

	
	
}
