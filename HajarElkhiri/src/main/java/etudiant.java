
public class etudiant {
	 int idEtudiant ,Age;
	 String Nom ,prenom ,log ,pass;

	
	
	public String getLog() {
		return log ;
	}
	public void setLog(String log) {
		this.log = log;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getNom()
	 {
		 return Nom;
	 }
	 public void setNom(String Nom)
	 {
		 this.Nom=Nom;
	 }
	 public String getprenom()
	 {
		 return prenom;
	 }
	 public void setprenom(String prenom)
	 {
		 this.prenom=prenom;
	 }
	 public int getidEtudiant()
	 {
		 return  idEtudiant;
	 }
	 public void setidEtudiant(int  idEtudiant)
	 {
		 this.idEtudiant=idEtudiant;
	 }
	 public int getAge()
	 {
		 return  Age;
	 }
	 public void setAge(int  Age)
	 {
		 this.Age=Age;
	 }
	 @Override
	 public String toString() {
		return "etudiant [idEtudiant=" + idEtudiant + ", Age=" + Age + ", Nom=" + Nom + ", prenom=" + prenom + ", log="
				+ log + ", pass=" + pass + "]";
	}
}
