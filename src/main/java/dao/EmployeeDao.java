package dao;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import dto.ContractEmployee;
import dto.Employee;
import dto.PermanantEmployee;

public class EmployeeDao 
{
	public Session getSession()
	{
		return new Configuration().configure("cfgs/hibernate.cfg.xml").buildSessionFactory().openSession();
	}
	public void saveEmployee(Object object)
	{
		if(object instanceof Employee)
		{
			Employee employee=(Employee)object;
			Session session=getSession();
			session.getTransaction().begin();
			session.persist(employee);
			session.getTransaction().commit();
		}
		else if(object instanceof PermanantEmployee)
		{
			PermanantEmployee employee=(PermanantEmployee)object;
			Session session=getSession();
			session.getTransaction().begin();
			session.persist(employee);
			session.getTransaction().commit();
		}
		else if(object instanceof ContractEmployee )
		{
			ContractEmployee contractEmployee=(ContractEmployee)object;
			Session session=getSession();
			session.getTransaction().begin();
			session.persist(contractEmployee);
			session.getTransaction().commit();
			
		}
		else
		{
			System.out.println("Invalid Object");
		}
	}
}
