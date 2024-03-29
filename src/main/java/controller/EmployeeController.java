package controller;

import dao.EmployeeDao;
import dto.ContractEmployee;
import dto.Employee;
import dto.PermanantEmployee;

public class EmployeeController 
{
	public static void main(String[] args) 
	{
		Employee employee=new Employee();
		employee.setEmpName("Shrikant");
		employee.setEmpNo(1);
		
		PermanantEmployee employee2=new PermanantEmployee();
		employee2.setEmpName("Shubham");
		employee2.setEmpNo(2);
		employee2.setSalary(980000);
		employee2.setBonus(60000);
		
		ContractEmployee contractEmployee=new ContractEmployee();
		contractEmployee.setEmpName("Omkar");
		contractEmployee.setEmpNo(3);
		contractEmployee.setPayPerHour(1000);
		contractEmployee.setContractPeriod(6);
		
		EmployeeDao dao=new EmployeeDao();
		dao.saveEmployee(employee);
		dao.saveEmployee(employee2);
		dao.saveEmployee(contractEmployee);
	}
}
