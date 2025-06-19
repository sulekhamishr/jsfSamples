package com.java.cms.util;

import java.text.Annotation;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class SessionHelper {
	
	public static SessionFactory getConnection(){
		
		return new AnnotationConfiguration().configure().buildSessionFactory();
		
	}

}
