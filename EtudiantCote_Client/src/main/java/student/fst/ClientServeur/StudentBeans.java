package student.fst.ClientServeur;
import javax.faces.bean.ManagedBean;
import jakarta.ejb.EJB;
import student.fst.beans.EtudiantRemote;
import student.fst.entites.student;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "StudentBeans")
	public class StudentBeans {
	     @EJB
	      EtudiantRemote remote;
	     private int idEtudiant = 0;
	 	private String nomEtudiant;
	 	private String prenomEtudiant;
	 	private String cneEtudiant;
	 	private String adresseEtudiant;
	 	private String niveauEtudiant;

	 	private student etudiant;

	 	public String addEtudiant(StudentBeans etudiantBean) {
	 		student etudiant = new student(0, etudiantBean.nomEtudiant, etudiantBean.prenomEtudiant,
	 				etudiantBean.cneEtudiant, etudiantBean.adresseEtudiant, etudiantBean.niveauEtudiant);
	 		remote.save(etudiant);
	 		return "listEtudiants.xhtml?faces-redirect=true";
	 	}

	 	// --- Getters & Setters ---
	 	public int getIdEtudiant() {
	 		return idEtudiant;
	 	}

	 	public void setIdEtudiant(int idEtudiant) {
	 		this.idEtudiant = idEtudiant;
	 	}

	 	public String getNomEtudiant() {
	 		return nomEtudiant;
	 	}

	 	public void setNomEtudiant(String nomEtudiant) {
	 		this.nomEtudiant = nomEtudiant;
	 	}

	 	public String getPrenomEtudiant() {
	 		return prenomEtudiant;
	 	}

	 	public void setPrenomEtudiant(String prenomEtudiant) {
	 		this.prenomEtudiant = prenomEtudiant;
	 	}

	 	public String getCneEtudiant() {
	 		return cneEtudiant;
	 	}

	 	public void setCneEtudiant(String cneEtudiant) {
	 		this.cneEtudiant = cneEtudiant;
	 	}

	 	public String getAdresseEtudiant() {
	 		return adresseEtudiant;
	 	}

	 	public void setAdresseEtudiant(String adresseEtudiant) {
	 		this.adresseEtudiant = adresseEtudiant;
	 	}

	 	public String getNiveauEtudiant() {
	 		return niveauEtudiant;
	 	}

	 	public void setNiveauEtudiant(String niveauEtudiant) {
	 		this.niveauEtudiant = niveauEtudiant;
	 	}

	 	public student getEtudiant() {
	 		return etudiant;
	 	}

	 	public void setEtudiant(student etudiant) {
	 		this.etudiant = etudiant;
	 	}

		}
	
