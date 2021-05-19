import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class jetest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
LivreManager um = new LivreManager() ;

  List<Livre> us =um.findCategorie("Mathématique");
  System.out.println(us.toString());

}
}