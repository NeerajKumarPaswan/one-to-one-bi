package com.ty.company.gst;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetCompanyById {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Company company=entityManager.find(Company.class, 1);
		System.out.println("Company name"+company.getName());
		System.out.println("Website of the company "+company.getWebsite());
		
		Gst gst=company.getGst();
		
		System.out.println("Gst number is "+gst.getGstNumber());
		System.out.println("State of the gst registration is  "+gst.getState());
		
	}
}
