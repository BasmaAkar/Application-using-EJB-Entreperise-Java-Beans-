package student.fst.beans;

import java.util.List;


import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import student.fst.entites.student;
@Stateless(name="GEtudiant")
public class StudentBeans implements EtudiantRemote{
	@PersistenceContext(unitName="Etudiant")
	private EntityManager entityManager;
	
	public StudentBeans() {
	}

	@Override
	public void save(student student) {
		System.out.println("Save : " + student.toString());		
		entityManager.persist(student);
	}

	@Override
	public void update(student student) {
		System.out.println("Update : " + student.toString());
		entityManager.refresh(student);
		
	}

	@Override
	public void delete(student student) {
		System.out.println("Delete : " + student.toString());
		entityManager.remove(student);
		
	}

	@Override
	public student getById(int idstudent) {
		System.out.println("idEtudiant : " + idstudent);
		student  etudiant = entityManager.find(student.class, idstudent);
		if(etudiant == null)
			throw new RuntimeException("Etudiant introuvale !");
		return etudiant;
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<student> list() {
		System.out.println(" list os students ");
		Query qry = entityManager.createQuery("Select e from Etudiant e");
		return qry.getResultList();
	}

}
