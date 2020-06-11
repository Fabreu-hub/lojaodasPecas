package br.unit.lojaodaspecas.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.unit.lojaodaspecas.Entidades.Cliente;
public class testedao {
    public void salvarCliente(Cliente cliente) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // save the student object
            session.save(cliente);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
    public List < Cliente > getStudents() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("Do cliente", Cliente.class).list();
        }
    }
}