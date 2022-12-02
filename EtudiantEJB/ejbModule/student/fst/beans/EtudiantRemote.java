package student.fst.beans;

import java.util.List;

import jakarta.ejb.Remote;
import student.fst.entites.student;

@Remote
    public interface EtudiantRemote {
	public void save(student student);
	public void update(student student);
	public void delete(student student);
	public student getById(int idstudent);
	public List<student> list();
}
