package in.sp.main.service;

import java.util.List;

import in.sp.main.entity.Student;

public interface StudentServiceInterface
{
	public boolean saveEmployeeData(Student emp);
	
	public boolean updateEmployeeData(Student emp);
	
	public boolean deleteEmployeeDataById(int id);
	
	public Student findEmployeeData(int id);
	
	public List<Student> findEmployeeAllData();
}
