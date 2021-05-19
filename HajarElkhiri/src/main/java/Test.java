

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Test
 */
@WebServlet("/Test")
public class Test extends HttpServlet {
	private static final long serialVersionUID = 1L;
      LivreManager um;
      etudiant u;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Test() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		um=new LivreManager();
		u = new etudiant();
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		
		   String lg=request.getParameter("log");
		   String ps=request.getParameter("pass");
		   try {
			u=um.authentification(lg, ps);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   if(u!=null)
		   {
			   HttpSession ses = request.getSession(true);
               ses.setAttribute("etudiant", u);
			   etudiant ut=(etudiant) ses.getAttribute("etudiant");
				out.print("<h1>Bonjour Mr. "+u.getLog()+" vous ete connecté ");
				response.sendRedirect("insertion.jsp");
			
		   }else
			  
			   {
			 
			   response.sendRedirect("index.jsp?res=err");
			   	
			   	
			   }
		   
			
	}

}
