package com.example;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main 
{
    public static void main( String[] args ){
    	ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
    	Jio obj= ac.getBean(Jio.class);
    	obj.TypeOfSim();
    	obj.DataType();
    	System.out.println("|");
    	System.out.println("V");
    	System.out.println(obj.getSignal());
    	
    	System.out.println("==================");
    	
    	Aircel obj1=ac.getBean(Aircel.class);
    	obj1.TypeOfSim();
    	obj1.DataType();
    	System.out.println("|");
    	System.out.println("V");
    	System.out.println(obj1.getSignal());
    }
}
