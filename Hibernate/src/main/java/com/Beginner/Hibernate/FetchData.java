package com.Beginner.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */

public class FetchData 
{
    public static void main( String[] args )
    {
        Remittance rem = new Remittance();
              
        Configuration con = new Configuration().configure().addAnnotatedClass(Remittance.class);
        
        // configure() is used to connect our app with hibernate.cfg.xml file else we will get error while running
        SessionFactory sf =con.buildSessionFactory();
        Session s = sf.openSession();      
        Transaction tx =s.beginTransaction(); // to maintain ACID properties
        tx.commit();
        
     //   rem=(Remittance)s.get(Remittance.class, 2);
       // System.out.println(rem);
    }
}
