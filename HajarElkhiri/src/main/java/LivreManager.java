import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LivreManager {
	
		public  int addEtudiant( String Nom ,String prenom, int Age,String log , String pass) throws ClassNotFoundException, SQLException
		{
			DBinteraction.connect();
			
			int nb=DBinteraction.maj("insert into  etudiant(Nom,prenom,Age,log,pass) values (' "+Nom+" ',' "+prenom+" ',' "+Age+" ',' "+log+" ',' "+pass+" ' )");
			DBinteraction.disconnect();
					
				return nb;
			
		}
		
		public int deleteuser(int idEtudiant ) throws ClassNotFoundException,SQLException
	    {
	    	DBinteraction.connect();
	   	
	   	int nb=DBinteraction.maj("delete  from etudiant where idEtudiant ="+idEtudiant);
	   	DBinteraction.disconnect();
		 return nb;
	  
	    }
		
		 public int addbook( String Titre,String NomcompletAuteur, String Categorie,String Datedeedution) throws ClassNotFoundException, SQLException
		 
		 {
			 DBinteraction.connect();
			 int nb=DBinteraction.maj("insert into  livres (Titre,NomcompletAuteur,Categorie,Datedeedution) values (' "+Titre+" ',' "+NomcompletAuteur+" ',' "+Categorie+" ',' "+Datedeedution+" ' )");
			 DBinteraction.disconnect();
			 return nb;
		 }
		
		
		  public etudiant finduser(String Nom) throws ClassNotFoundException, SQLException
		     {etudiant u= new etudiant();;
		     DBinteraction.connect();
		     String sql ="select * from etudiant where Nom= '"+Nom+ "' ";
		     System.out.println(sql);
		     ResultSet rs =DBinteraction.Select(sql);
		  while(rs.next())
		   {
			    
			   u.setidEtudiant(rs.getInt(1));
			   u.setNom(rs.getString(2));
			   u.setprenom(rs.getString(3));
			   u.setAge(rs.getInt(4));
			   u.setLog(rs.getString(5));
			   u.setPass(rs.getString(6));
			   
		   }
		     
				return u;
		    	 
		     }

		  public List<Livre> findlivre(String NomcompletAuteur )throws ClassNotFoundException, SQLException
		     {	
		     List<Livre> us=new ArrayList<Livre>();
		     DBinteraction.connect();
		     String sql=" select * from livres where NomcompletAuteur = '"+NomcompletAuteur+"' ";
		     ResultSet rs =DBinteraction.Select(sql);
		   while (rs.next())
		   {
			   Livre u=new Livre();
			 u.setId(rs.getInt(1));   
			u.setTitre(rs.getString(2));    
			u.setNomcompletAuteur(rs.getString(3));
			u.setCategorie(rs.getString(4));
			u.setDatedeedution(rs.getString(5));
			us.add(u);
			
		   }
		   
			
			return us;
		    	 
		     }
		  public List<Livre>findCategorie(String Categorie) throws ClassNotFoundException, SQLException
		  {
			  List<Livre> us=new ArrayList<Livre>();
					  DBinteraction.connect();
					  String sql=" select * from livres where Categorie  like '%"+Categorie+"%'";
					  ResultSet rs =DBinteraction.Select(sql);
					  while (rs.next())
					   {
						  Livre u = new Livre();
						 
						u.setId(rs.getInt(1));   
						u.setTitre(rs.getString(2));    
						u.setNomcompletAuteur(rs.getString(3));
						u.setCategorie(rs.getString(4));
						u.setDatedeedution(rs.getString(5));
						us.add(u);
						
					   }
					   
					   
						
					return us;
			  
		  }
		 


			public etudiant authentification(String log, String pass) throws ClassNotFoundException, SQLException
			{
				etudiant u = null;
				DBinteraction.connect();
				ResultSet rs = DBinteraction.Select("select * from etudiant where log=' "+log+" ' and pass=' "+pass+" ' ");
				try {
					if(rs.next())
					{
						u=new etudiant();
						
						u.setidEtudiant(rs.getInt(1));   
						u.setNom(rs.getString(2));    
						u.setprenom(rs.getString(3));
						u.setLog(rs.getString(4));
						
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return u;
				
			}
		  
				
				
			}
