package com.ty.company.gst;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveCompanyGst {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	
	Company company=new Company();
	company.setName("Tata");
	company.setWebsite("www.tata.com");
	
	Gst gst =new Gst();
	gst.setGstNumber("TATAPJSP123456");
	gst.setState("Delhi");
	
	company.setGst(gst);
	gst.setCompany(company);
	

	entityTransaction.begin();
	entityManager.persist(company);
	entityManager.persist(gst);
	entityTransaction.commit();
	
}
}
