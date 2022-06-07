package com.example.otouserdefined;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import javax.persistence.RollbackException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
@SpringBootApplication
public class OtouserdefinedApplication {

	public static void main(String[] args) {
		SpringApplication.run(OtouserdefinedApplication.class, args);
		ApplicationContext context;
		context=SpringApplication.run(OtouserdefinedApplication.class, args);
		RoleRepository role;
		role=context.getBean(RoleRepository.class);
		EmpRepository emp;
		emp=context.getBean(EmpRepository.class);
		
		do
		{
			Scanner sc=new Scanner(System.in);
			int ch;
			System.out.println("*************************************************************************");
			System.out.println("*************************************************************************");
			System.out.println("Select the operations from following");
			System.out.println("1 - Select ");
			System.out.println("2 - Update ");
			System.out.println("3 - Delete");
			System.out.println("4 - Save");
			System.out.println("5 - Exit");
			System.out.println("*************************************************************************");
			System.out.println("*************************************************************************");
			System.out.println("Which operation do you want to perform?");
			ch=sc.nextInt();
			Optional<Emp> emp1;
			Optional<Role> rol1;	
			switch (ch)
			{
			case 1:
				System.out.println("Firing SElECT Queury");
				List<Role> rolelist;
				rolelist=role.findAll();
				System.out.println("Record selected from Role Table: ");
				for(Role rl1:rolelist)
				{
					System.out.println("Id is: "+rl1.getRoll_id()+" Position is : "+rl1.getRoll_desc());
				}
				System.out.println("Record selected from Employee Table: ");
				List<Emp> emplist;
				emplist=emp.findAll();
				for(Emp em1:emplist)
				{
					System.out.println("Employee Id: "+em1.getEmp_id()+" Employee name: "+em1.getName());
				}
				break;
				
			case 2:
				try {
					System.out.println("Which table data you want to UPDDATE?: ");
					System.out.println("press 1 for ROLE table");
					System.out.println("Press  2 for EMPLOYEE table");
					System.out.println("Enter your choice: ");
					int cs=sc.nextInt();
					switch(cs)
					{
					case 1:
					
						System.out.println("Firing UPDATE Queury in role table");
						System.out.println();
						System.out.println("Enter Id which data do you want to Update?: ");
						int f1=sc.nextInt();
						rol1=role.findById(f1);
						System.out.println("Enter Description to be edited?: ");
						String dsc=sc.next();
						Role rl2=rol1.get();
						System.out.println("Data before UPDATE: ");
						System.out.println(rl2.getRoll_id());
						System.out.println(rl2.getRoll_desc());
						rl2.setRoll_desc(dsc);
						role.save(rl2);
						System.out.println("Record int role table UPDATED successfully!!!!");
						break;
					
					case 2:
						System.out.println("Firing UPDATE Queury in employee table");
						System.out.println("Enter ID which data do you want to UPDATE:");
						int f2=sc.nextInt();
						System.out.println("Enter Name to be edited: ");
						String name=sc.next();
						emp1=emp.findById(f2);
						Emp em2=emp1.get();
						System.out.println("Data before UPDATE: ");
						System.out.println(em2.getEmp_id());
						System.out.println(em2.getName());
						em2.setName(name);
						emp.save(em2);
						System.out.println("Record in employee table UPDATED successfully!!!!");
						break;
						
					default:
						System.out.println("You have entered Invalid choise");
					}
					
				} catch (Exception e) {
					System.out.println("Sorry!! Entered ID is invalid or not present in current table!!!!");
				}
				
				break;
				
			case 3:
				try {
					System.out.println("Firing DELETE Query in role table: ");
					System.out.println("Enter ID whose data you want to DELETE?:");
					int id=sc.nextInt();
					System.out.println("Enter Employee Id");
					int id1=sc.nextInt();
					emp1=emp.findById(id1);
					Emp em3=emp1.get();
					emp.delete(em3);
					rol1=role.findById(id);
					Role rl3=rol1.get();
					role.delete(rl3);
					System.out.println("Rocord with ID is DELETED!!!!");
					
				} catch (Exception e) {
					System.out.println("Sorry!! No such record found!!!!");
				}
				
				break;
				
			case 4:
				System.out.println("Firing SAVE Query");
				System.out.println("Enter ID for Role table");
				int id11=sc.nextInt();
				System.out.println("Enter Job Description ");
				String d11=sc.next();
				Role r11=new Role(id11,d11);
				role.save(r11);
				System.out.println("Enter Employee ID");
				int ed11=sc.nextInt();
				System.out.println("Enter Employee name: ");
				String en11=sc.next();
				Emp e11=new Emp(ed11,en11,r11);
				emp.save(e11);
				System.out.println("Record saved successfully!!!!");
				break;
				
				
			case 5:
				System.out.println("You have Exit from Application");
				System.exit(0);
				break;
				
			default:
				System.out.println("You have Enter wrong choice");
				break;
			}
			System.out.println("*************************************************************************");
			System.out.println("*************************************************************************");
			
		}while(true);
	}

}
