

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
 * Servlet implementation class addlivre
 */
@WebServlet("/addlivre")
public class addlivre extends HttpServlet {
	private static final long serialVersionUID = 1L;
	  LivreManager um;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addlivre() {
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
		String T=request.getParameter("Titre");
		String N= request.getParameter("NomcompletAuteur");
		String C=request.getParameter("categorie");
		String D=request.getParameter("Datedeedution");
		
		try {
			um.addbook(T, N, C, D);
			out.print(" "+T+"are added");
			response.sendRedirect("insertion.jsp");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	

}
