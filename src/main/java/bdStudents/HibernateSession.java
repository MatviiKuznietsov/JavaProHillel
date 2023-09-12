package bdStudents;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class HibernateSession {
    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            Configuration configuration = new Configuration();
            configuration.configure("hibernate.cfg.xml");
            configuration.addAnnotatedClass(Student.class);

            sessionFactory = configuration.buildSessionFactory();
        }
        return sessionFactory;
    }
}
