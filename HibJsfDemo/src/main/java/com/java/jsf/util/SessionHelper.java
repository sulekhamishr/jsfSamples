package com.java.jsf.util;

import org.hibernate.cfg.AnnotationConfiguration;

public class SessionHelper {

       public static SessionHelper getConnection() {
		return (SessionHelper) new AnnotationConfiguration().configure().buildSessionFactory();
    	   
       }
}
