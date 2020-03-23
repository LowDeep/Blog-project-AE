package dbconnect;

import java.sql.ResultSet;
import java.sql.SQLException;

import dbconnect.DbConnection;
import objets.User;

import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserMySQLDao {

	/**
	 * SQL query used to fetch users
	 */
	private static String FETCH_USERS_SQL = "SELECT id, firstname, lastname FROM user";
	/**
	 * SQL query used to insert user
	 */
	private static String INSERT_USER ;
	
	/**
	 * SQL query used to find user
	 */
	private static String FETCH_USER ;
	
	/**
	 * Fetch all users from the database
	 * 
	 * @return A list of Users
	 */
	public List<User> findAll()
	{
		List<User> users = new ArrayList<User>();
		Connection connection = DbConnection.getInstance();
		Statement stmt;

		try {
			stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(FETCH_USERS_SQL);
			// Loop over the database result set and create the
			// user objects.
			while (rs.next()) {
				User u = new User();
				u.setId(rs.getInt("id"));
				u.setFirstname(rs.getString("firstname"));
				u.setLastname(rs.getString("lastname"));
				users.add(u);
			}
			// Free resources
			rs.close();
			stmt.close();
		}catch (SQLException e) {
			e.printStackTrace();
		} 
		return users;
	}
	
	/**
	 * Insert one user into the database
	 * 
	 * @return A boolean
	 */
	public boolean insertUser(User u) {
		Connection connection = DbConnection.getInstance();
		Statement stmt;
		INSERT_USER="INSERT INTO `user` (`username`, `firstname`, `lastname`, `age`, `city`, `sexe`,`password` ) VALUES ( '"+ 
				u.getUsername()+"','"+ u.getFirstname()+"','"+u.getLastname()+"',"+u.getAge()+",'"+u.getCity()+"','"+u.getSexe()+"','"+u.getPassword()+"');";
		
		//System.out.println(INSERT_USER);
		try {
			stmt = connection.createStatement();
			int rs = stmt.executeUpdate(INSERT_USER);
			stmt.close();
			
				if (rs==0) return false;
				else return true;
			
		}catch (SQLException e) {
			e.printStackTrace();
			
		} 
		return false;	
	}
	
	/**
	 * Insert one user into the database
	 * 
	 * @return A boolean
	 */
	public User findUser(String username, String password) {
		Connection connection = DbConnection.getInstance();
		Statement stmt;
		FETCH_USER="SELECT * FROM `user` where `username`='"+username+"' and `password`='"+password+"';";
		System.out.println(FETCH_USER);
		User user=new User();
		try {
			stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(FETCH_USER);
			
			while(rs.next()) {
				user.setId(rs.getInt("id"));
				user.setUsername(rs.getString("username"));
				user.setFirstname(rs.getString("firstname"));
				user.setLastname(rs.getString("lastname"));
				user.setAge(rs.getInt("age"));
				user.setCity(rs.getString("city"));
				user.setSexe(rs.getString("sexe"));
				return user;
				
			}
			rs.close();
			stmt.close();
		}catch (SQLException e) {
			e.printStackTrace();
		} 
		return null;
		
	}
}
