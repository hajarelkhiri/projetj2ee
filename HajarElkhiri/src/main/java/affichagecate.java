

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class affichagecate
 */
@WebServlet("/affichagecate")
public class affichagecate extends HttpServlet {
	private static final long serialVersionUID = 1L;
	LivreManager um;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public affichagecate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		um= new LivreManager();
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out =response.getWriter();
		String Cat=request.getParameter("Categorie");
		out.print(" <link href=\"css/hajar.css\" rel=\"stylesheet\" type=\"text/css\"/>");
		out.print("<p> if you encounter any prb try running my code in eclipse caus css </p>");
		try {
			if(um.findlivre(Cat) != null)
			{
			
				List<Livre> us= um.findCategorie(Cat);
				
				out.print("<body>");
				out.print("<div class=\"box\">");
					out.print("<table  class=\"table table-dark table-hover\" width='80%'  bgcolor='#FFD500' border='2' >");
					out.print("<thead><th>id</th> <th>Titre</th> <th>Nom complet de Auteur</th><th>Catégorie</th><th>Date edution</th></thead>");
					for(Livre u:us)
					{
					out.print("<tr>");
					out.print("<td>"+u.getId()+"</td>");
					out.print("<td>"+u.getTitre()+"</td>");
					out.print("<td>"+u.getNomcompletAuteur()+"</td>");
					out.print("<td>"+u.getCategorie()+"</td>");
					out.print("<td>"+u.getDatedeedution()+"</td>");
					out.print("</tr>");
					out.print("</div>");
					out.print("</body>");
				}
					
				}
			else
			{
				out.print(" categorie not found");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
