import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class TestSavePersonPan {
public static void main(String[] args) {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	Person person=new Person();
	person.setName("Dimple");
	person.setEmail("dimpl@mail.com");
	person.setPhone("7799556684");
	
	
	Pan pan=new Pan();
	pan.setPan_num("DIM123TY");
	pan.setAddress("basavanagudi,banglore");
	pan.setName("Dimple");

	
	person.setPan(pan);
	pan.setPerson(person);
	

	entityTransaction.begin();
	entityManager.persist(person);
	entityManager.persist(pan);
	entityTransaction.commit();

}
}
