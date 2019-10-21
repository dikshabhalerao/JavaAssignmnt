package com.diksha.employe;

import org.hibernate.Transaction;
import org.hibernate.Session;

import com.diksha.employe.model.Employee;
import com.diksha.employe.util.HibernateUtil;

class EmployeeDemo {
	public static void main(String[] args) {
		
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		
		Employee employee = new Employee("Diksha", "Analyast", 14000);
		session.save(employee);
		
		tx.commit();
		session.close();
		HibernateUtil.closeSessionFactory();
		
		
//		Session session = HibernateUtil.getSession();
//		
//		Employee employee = (Employee) session.load(Employee.class, 1);
//		System.out.println("emp");
//		System.out.println(employee);
//		
//		session.close();
//		HibernateUtil.closeSessionFactory();
		
//		Session session = HibernateUtil.getSession();
//		Transaction tx = session.beginTransaction();
//		
//	    Employee employee = (Employee) session.get(Employee.class, 1);
//		if(employee != null)
//			employee.setEmployeeSalary(45000);
//		
//		tx.commit();
//		session.close();
//		HibernateUtil.closeSessionFactory();
		
		/*Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		
		Employee employee = (Employee) session.get(Employee.class, 1);
		if(employee != null)
			session.delete(employee);
		
		tx.commit();
		session.close();
		HibernateUtil.closeSessionFactory();*/
	}
}









