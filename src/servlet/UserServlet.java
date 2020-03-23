package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dbconnect.DbConnection;
import dbconnect.UserMySQLDao;
import objets.User;

/**
 * Servlet implementation class User
 */
@WebServlet("/User")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		request.setAttribute("title", "Create An Account");
		this.getServletContext().getRequestDispatcher("/WEB-INF/pagesJSP/EntryForm.jsp").forward(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
				
		String username =(String) request.getParameter("username");
		String firstname =(String) request.getParameter("firstname");
		String lastname = (String)request.getParameter("lastname");
		int age =Integer.parseInt(request.getParameter("age"));
		String city = (String)request.getParameter("city");
		String sexe =(String) request.getParameter("sexe");
		String password = (String)request.getParameter("password");
		
		User user=new User(username, firstname, lastname, age, city, sexe, password);
		
		HttpSession session =request.getSession();
		
		UserMySQLDao dao = new UserMySQLDao();
		boolean insertUser=dao.insertUser(user);
		DbConnection.close();	
		if (insertUser) {
			session.setAttribute("username", username);
			response.sendRedirect("Connexion");
		}else {
			response.sendRedirect("UserServlet");
		}
	
	}
	
}
