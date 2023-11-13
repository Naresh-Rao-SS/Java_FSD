package mphasis.product;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class ProductMain {

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

		Product p=new Product();


		System.out.println("enter the Product id "); 
		p.setProductid(sc.nextInt());
		System.out.println("enter the Product name "); 
		p.setProductname(sc.next());
		s.save(p);
		t.commit();
		s.close();
		sf.close();
	}
}
