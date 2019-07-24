package com.daoImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dao.Empdao;
import com.entities.Emp;

@Repository
@Transactional

public class Empdaoimpl implements Empdao {
	
@Autowired
SessionFactory session;

public java.util.List<Emp> List() {
	// TODO Auto-generated method stub
	
	return session.getCurrentSession().createQuery("from Emp").list();
}

public boolean delete(Emp Emp) {
	// TODO Auto-generated method stub
	try {
		session.getCurrentSession().delete(Emp);
	}catch(Exception ex) {
	return false; 
	}
	return true;
}

	

public boolean saveOrUpdate(Emp Emp) {
	// TODO Auto-generated method stub
	session.getCurrentSession().saveOrUpdate(Emp);
	return true;
}

	/*
	 * public boolean saveOrUpdate (Emp emp) {
	 * session.getCurrentSession().saveOrUpdate(emp); return true; }
	 * 
	 * public List<Emp> list() { return
	 * session.getCurrentSession().createQuery("from Emp").list(); } public boolean
	 * delete (Emp emp) { try { session. getCurrentSession().delete(Emp); } catch
	 * (Exception ex) { return false; } return true; }
	 * 
	 * public java.util.List<Emp> List() { // TODO Auto-generated method stub return
	 * null; }
	 * 
	 * public boolean delete(Emp Emp) { // TODO Auto-generated method stub return
	 * false; }
	 * 
	 * public boolean saveOrUpdate(Emp Emp) { // TODO Auto-generated method stub
	 * return false; }
	 */


}
