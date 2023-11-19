package mphasishibernate;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/*StandardServiceRegistry 
Metadata
SessionFactory
Session 
Transaction 
Close the connection 
 */
public class EmployeeMain {

	public static void main(String[] args) {
		//loads the hibernate.cfg.xml file
		StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		//in the file start reading the tags 		
		Metadata md=new MetadataSources(ssr).getMetadataBuilder().build();	
		//go to session factory and read the tags 		
		SessionFactory sf=md.getSessionFactoryBuilder().build();
		//all the crud operations need to be done in session 
		Session s=sf.openSession();

		//what ever the operation of crud happening it need to get saved 
		Transaction t=s.beginTransaction();

		Scanner sc=new Scanner(System.in);

		Employee e=new Employee();


		System.out.println("enter the employee id "); 
		e.setId(sc.nextInt());
		System.out.println("enter the employee name ");
		e.setName(sc.next());
		System.out.println("enter the salary "); 
		e.setSalary(sc.nextDouble());

		//insert operation
		s.save(e);	

		//update
		//s.saveOrUpdate(e);

		//Delete
		//s.delete(e);

		//reterive
		//System.out.println(s.get(Employee.class,3));


		//HQL
		/*for(int i=1;i<10;i++) {
			Employee e=new Employee();
			e.setId(i);
			e.setName("name"+i);
			e.setEmail("name"+i+"@c.c");
			e.setSalary(i*1000);
			s.save(e);*/
	t.commit();
	s.close();
	sf.close();



}

}

