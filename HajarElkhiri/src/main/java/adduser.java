

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class adduser
 */
@WebServlet("/adduser")
public class adduser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       LivreManager um;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public adduser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		um = new LivreManager();
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out =  response.getWriter();
		
		String N =request.getParameter("Nom");
		String p= request.getParameter("prenom");
	String age = request.getParameter("Age");
	
		String l=request.getParameter("log");
		String pa=request.getParameter("pass");
	
		try {
			int A=Integer.parseInt(age);
			um.addEtudiant(N, p, A, l ,pa);
		out.print(" Bienvenu "+l);
		response.sendRedirect("insertion.jsp");
				
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
		
	}


