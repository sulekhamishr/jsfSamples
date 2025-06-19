package com.java.jsf.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.java.jsf.model.Employ;

public class EmployDaoImp implements EmployDao {
	
	
	SessionFactory sessionFactory;
	Session session;
	private String localCode;
	public String getLocalCode() {
		return localCode;
	}
	public void setLocalCode(String localCode) {
		this.localCode = localCode;
	}
	@Override
	public List<Employ> showEmployDao() {
		// TODO Auto-generated method stub
		session
		return null;
	}
	

}
