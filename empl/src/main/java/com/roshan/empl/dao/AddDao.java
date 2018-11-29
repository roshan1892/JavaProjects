package com.roshan.empl.dao;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.roshan.empl.entity.AddEmployee;

import antlr.collections.List;

@Component
public class AddDao {
 
	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	public void addEmployee(AddEmployee ad) {
		
	System.out.println("in addemployee" +ad);	
		
    Session session = sessionFactory.getCurrentSession(); 
    session.save(ad);
	
	}
 
	//public AddEmployee getEmployee(String firstname) {
		
	//	return(AddEmployee) sessionFactory.getCurrentSession().get(AddEmployee.class,firstname);
	//}
	
	public List  getAllEmployee(AddEmployee firstname) {
		
		String hql ="FROM EMPLOYEE E WHERE E.firstname = firstname";
		return (List) sessionFactory.getCurrentSession().createQuery("from Employee").list();
		
	}
	
}
