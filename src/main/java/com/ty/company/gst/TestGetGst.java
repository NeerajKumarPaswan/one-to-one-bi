package com.ty.company.gst;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetGst {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	
	Gst gst=entityManager.find(Gst.class, 2);
	System.out.println("Gst number "+gst.getGstNumber());
	System.out.println("Gst state "+gst.getState());
	System.out.println("-----------------------------------------------------------");
	
	Company company=gst.getCompany();
	System.out.println("Company name  "+company.getName());
	System.out.println("Company website  "+company.getWebsite());
}
}
