package studentassignment.dao;
import java.util.List;

import studentassignment.exceptions.DataNotPresentException;
import studentassignment.exceptions.StudentNotFoundException;
import studentassignment.model.Student;
public interface StudentDAO {
	public String addStudent(Student student) throws DataNotPresentException;
	public List<Student> getAllStudents();
	public List<Student> getStudentByCity(String city);
	public List<Student> sortStudentsByName();
	public List<Student> sortStudentsByCity();
	public Student displayStudent(Integer id) throws StudentNotFoundException;
}
