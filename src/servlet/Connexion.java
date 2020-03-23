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
 * Servlet implementation class Connexion
 */
@WebServlet("/Connexion")
public class Connexion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Connexion() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		request.setAttribute("title", "Connexion An Account");
		this.getServletContext().getRequestDispatcher("/WEB-INF/pagesJSP/Connexion.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String username =(String) request.getParameter("username");
		String password = (String)request.getParameter("password");
		
		
		
		HttpSession session =request.getSession();
		
		UserMySQLDao dao = new UserMySQLDao();
		User user=dao.findUser(username, password);
		DbConnection.close();	
		if (user==null) {

			response.sendRedirect("Connexion");
		}else {
			session.setAttribute("User", user);
			response.sendRedirect("Home");
		}
	}

}
