package in.sp.main.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.sp.main.dao.StudentRepository;
import in.sp.main.entity.Student;

@Service
public class StudentServiceImp implements StudentServiceInterface
{
	@Autowired
	private StudentRepository dao;

	@Override
	public boolean saveEmployeeData(Student emp)
	{
		boolean b=false;
		try 
		{
			dao.save(emp);
			b=true;
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return b;
	}

	@Override
	public boolean updateEmployeeData(Student emp) 
	{
		boolean b=false;
		try 
		{
			dao.save(emp);
			b=true;
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return b;
	}

	@Override
	public boolean deleteEmployeeDataById(int id) 
	{
		boolean b=false;
		try 
		{
			dao.deleteById(id);
			b=true;
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return b;
	}

	@Override
	public Student findEmployeeData(int id)
	{
		Student emp=null;
		try
		{
			Optional<Student> employee=dao.findById(id);
			
			emp=employee.get();
		} 
		catch (Exception e)
		{
			e.printStackTrace();	
		}
		return emp;
	}

	@Override
	public List<Student> findEmployeeAllData() 
	{
		List<Student> emp=null;
		try
		{
		    emp=dao.findAll();
		} 
		catch (Exception e)
		{
			e.printStackTrace();	
		}
		return emp;
	}

}
