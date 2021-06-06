package com.Beginner.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args )
    {
    	
    	BenName_Embeddable benNm_Emb = new BenName_Embeddable();
    	benNm_Emb.setFirstName("Saloni");
    	benNm_Emb.setLastNmae("Jain");
    	
    	
        Remittance rem = new Remittance();
        
        rem.setPayment_id(3);
        rem.setDbtrAcnt("25000715"); 
        rem.setAmt(2000);
        rem.setBenAcnt("AE278000023");
        rem.setBenNm(benNm_Emb);
        rem.setBIC("CITIUS33");
        
        
        Configuration con = new Configuration().configure().addAnnotatedClass(Remittance.class);
        
        // configure() is used to connect our app with hibernate.cfg.xml file else we will get error while running
        SessionFactory sf =con.buildSessionFactory();
        Session s = sf.openSession();
        
        Transaction tx =s.beginTransaction(); // to maintain ACID properties
        s.save(rem);
        tx.commit();
    }
}
