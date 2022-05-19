package com.example.demomethods2;

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
public class EmployController {
@Autowired
private EmployRepository em;
@GetMapping("/employ")
public List<Employ> getAllEmploys()
{
return em.findAll();
}

@GetMapping("/employ/{emid}")
public Employ getEmployById(@PathVariable("emid") Integer empid)
{
Optional<Employ> op=em.findById(empid);
Employ em1=op.get();
return em1;
}

@PostMapping("/save")
public Employ createEmploy(@RequestBody Employ e)
{
return em.save(e);
}

@PutMapping("/updateemp/{emid}")
public boolean updateEmp(@PathVariable(value="emid")Integer ed,@RequestBody Employ EmployDetails) throws Exception
{
boolean f=true;
try {
Optional<Employ>op=em.findById(ed);
Employ em2=op.get();
em2.setName(EmployDetails.getName());
em2.setAddress(EmployDetails.getAddress());
em2.setEmail(EmployDetails.getEmail());
em2.setPhone(EmployDetails.getPhone());
em2.setSalary(EmployDetails.getSalary());

final Employ updateEmp=em.save(em2);
} catch (Exception e) {
f=false;
}
return f;
}


@DeleteMapping("/deleteemp/{emid}")
public boolean deleteEmp(@PathVariable(value="emid")Integer emd,@RequestBody Employ employDetails) throws Exception
{
Optional<Employ> op=em.findById(emd);
Employ em1=op.get();
em.delete(em1);
return true;

}

}



