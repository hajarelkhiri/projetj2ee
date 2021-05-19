

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
 * Servlet implementation class affichage
 */
@WebServlet("/affichage")
public class affichage extends HttpServlet {
	private static final long serialVersionUID = 1L;
	LivreManager um;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public affichage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		um=new LivreManager();
	
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out =response.getWriter();
		String NomcompletAuteur=request.getParameter("NomcompletAuteur");

		
	
			try {
				if(um.findlivre(NomcompletAuteur) != null)
				{
					out.print(" <link href=\"css/hajar.css\" rel=\"stylesheet\" type=\"text/css\"/>");
					List<Livre> us=um.findlivre(NomcompletAuteur);
					out.print("<body>");
					out.print("<div class=\"box\">");
					
						out.print("<table width='80%'  bgcolor='#FFDD99' border='2' >");
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
				
				
				else {
					
					System.out.println(" dosen't exist");
				}

			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}
	}
