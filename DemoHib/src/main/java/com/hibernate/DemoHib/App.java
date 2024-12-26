package com.hibernate.DemoHib;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class App {
    public static void main(String[] args) {
    	
//		  //insert data in table
//        Student s = new Student();
//        s.setId(103);
//        s.setName("shivam");
//        s.setMarks(72);
//
//            Configuration configuration = new Configuration().configure().addAnnotatedClass(Student.class);
//            StandardServiceRegistryBuilder serviceRegistryBuilder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
//            ServiceRegistry serviceRegistry = serviceRegistryBuilder.build();
//            SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
//            Session session = sessionFactory.openSession();
//            Transaction transaction = session.beginTransaction();
//            session.save(s);//save data in database.
//            transaction.commit();
//            sessionFactory.close();
            
    	
    		//Fetch data from database table
    		Student s = new Student();
            Configuration configuration = new Configuration().configure().addAnnotatedClass(Student.class);
            StandardServiceRegistryBuilder serviceRegistryBuilder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
            ServiceRegistry serviceRegistry = serviceRegistryBuilder.build();
            SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
            Session session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();
            s = session.get(Student.class, 102);//fetching data from student table for id= 102
            transaction.commit();
            sessionFactory.close();
            System.out.println(s);
     }  
}