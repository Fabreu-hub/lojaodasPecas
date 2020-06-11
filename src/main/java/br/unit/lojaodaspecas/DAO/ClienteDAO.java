package br.unit.lojaodaspecas.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import br.unit.lojaodaspecas.Entidades.Cliente;



public class ClienteDAO {

	public void salvar(Cliente cliente) {
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

	public List<Cliente> listarTodos() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		String hql = "select c from Cliente c";
		Query<Cliente> query = session.createQuery(hql);
		return query.getResultList();

	}

	public Cliente findByCod(Integer codcliente) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		String hql = "select c from Cliente c where c.codcliente = :codcliente";
		Query<Cliente> query = session.createQuery(hql);
		query.setParameter("codcliente", codcliente);
		return query.getSingleResult();
	}

	public void  updateBycodcliente(Integer codcliente , Cliente cliente) {

		Cliente c = findByCod(codcliente);
		cliente.setCodcliente(codcliente);
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.update(cliente);
		transaction.commit();
	}

	public void  deleteBycodcliente(Integer codcliente) {

		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.delete(findByCod(codcliente));
		transaction.commit();
	}
	
	
	
	
	public static void main(String[] args) {
		
	Cliente c1 = new Cliente(1, 588864465, 456464566, "filipe", "endereco")	;
	Cliente c2 = new Cliente(2, 582864465, 416464566, "jair", "endereco")	;	
		
		ClienteDAO cdao = new ClienteDAO();
		cdao.salvar(c1);
		cdao.salvar(c2);
		
		
	}


}


