package in.sp.main.controller;

import java.security.interfaces.RSAMultiPrimePrivateCrtKey;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.sp.main.entity.Student;
import in.sp.main.service.StudentServiceInterface;

@RestController
public class StudentController
{
	
	@Autowired
	private StudentServiceInterface service;
	
	@GetMapping("/getAllStud")
	public List<Student> getAllEmpData()
	{
		List<Student> list=service.findEmployeeAllData();
		return list;
	}
	
	@GetMapping("/getStud/{id}")
	public Student getEmpDataById(@PathVariable("id") int id1)
	{
		Student employee=service.findEmployeeData(id1);
		return employee;
	}
	
	@PostMapping("/saveStud")
	public boolean saveEmpData(@RequestBody Student emp)
	{
		boolean b=service.saveEmployeeData(emp);
		return b;
	}
	
	@DeleteMapping("/deleteStud/{id}")
	public boolean deleteEmpById(@PathVariable("id") int id1)
	{
		boolean b=service.deleteEmployeeDataById(id1);
		return b;
	}
	
	@PutMapping("/updateStud")
	public boolean updateEmpData(@RequestBody Student emp)
	{
		boolean b=service.updateEmployeeData(emp);
		return b;
	}
	
	
	
	
}
