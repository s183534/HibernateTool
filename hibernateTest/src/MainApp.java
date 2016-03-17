

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.user.dto.UserProfile;

public class MainApp {

	public static void main(String[] args) {
		
		 UserProfile u1=new UserProfile();
		 u1.setUserId(1);
		 u1.setEmail("vahid@marconi.it");
		 u1.setFirstName("vahid");
		 u1.setLastName("Khosh");
		 u1.setDateJoined(new Date());
		
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
         Session session = sessionFactory.openSession();
		 session.beginTransaction();
		 session.save(u1);
		 session.getTransaction().commit();
		
		//		

//		
//		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(
//				configuration.getProperties()).build();
//		
//		sessionFactory=configuration.buildSessionFactory(serviceRegistry);

	}

}
