package crud.dao;

import entity.Ticket;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import util.HibernateUtil;

public class TicketDao {
    private SessionFactory sessionFactory = HibernateUtil.getInstance().getSessionFactory();

    //Create
    public void save(Ticket ticket) {
        try (Session session = sessionFactory.openSession()) {
            Transaction tx = session.beginTransaction();
            session.persist(ticket);
            tx.commit();
        }
    }

    //Read
    public Ticket findById(long id) {
        try (Session session = sessionFactory.openSession()) {
            return session.get(Ticket.class, id);
        }
    }

    //Update
    public void update(Ticket ticket) {
        try (Session session = sessionFactory.openSession()) {
            Transaction tx = session.beginTransaction();
            session.update(ticket);
            tx.commit();
        }
    }

    //Delete
    public void delete(Ticket ticket) {
        try (Session session = sessionFactory.openSession()) {
            Transaction tx = session.beginTransaction();
            session.delete(ticket);
            tx.commit();
        }
    }
}
