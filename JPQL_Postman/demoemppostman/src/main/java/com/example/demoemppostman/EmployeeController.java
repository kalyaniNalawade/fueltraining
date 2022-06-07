package com.example.demoemppostman;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeRepository em;
	@GetMapping("/employee")
	public List<Employee> getAllEmployees()
	{
		return em.findAll();
	}
	
	@GetMapping("/employee/{emid}")
	public Employee getEmployeeById(@PathVariable("emid") Integer empid)
	{
		Optional<Employee> op=em.findById(empid);
		Employee em1=op.get();
		return em1;
	}
	
	@PostMapping("/save")
	public Employee createEmployee(@RequestBody Employee e)
	{
		return em.save(e);
	}
	
	@PutMapping("/updateemp/{emid}")
	public boolean updateEmp(@PathVariable(value="emid")Integer ed,@RequestBody Employee EmployeeDetails) throws Exception
	{
		boolean f=true;
		try {
			Optional<Employee>op=em.findById(ed);
			Employee em2=op.get();
			em2.setName(EmployeeDetails.getName());
			em2.setAdd(EmployeeDetails.getAdd());
			em2.setEmail(EmployeeDetails.getEmail());
			em2.setPhone(EmployeeDetails.getPhone());
			em2.setSal(EmployeeDetails.getSal());
			
			final Employee updateEmp=em.save(em2);
		} catch (Exception e) {
			f=false;
		}
		return f;
	}
	
	
	@DeleteMapping("/deleteemp/{emid}")
	public boolean deleteEmp(@PathVariable(value="emid")Integer emd,@RequestBody Employee employeeDetails) throws Exception
	{
		Optional<Employee> op=em.findById(emd);
		Employee em1=op.get();
		em.delete(em1);
		return true;
		
	}

}
