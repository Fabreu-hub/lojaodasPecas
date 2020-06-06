package br.unit.lojaodaspecas.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import br.unit.lojaodaspecas.Entidades.Vendedor;



public class VendedorDAO {

	public void  salvar(Vendedor vendedor) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.save(vendedor);
		transaction.commit();

	}

	public List<Vendedor> listarTodos() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		String hql = "select c from Vendedor c";
		Query<Vendedor> query = session.createQuery(hql);
		return query.getResultList();

	}

	public Vendedor findByCod(Integer codvendedor) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		String hql = "select v from Vendedor v where v.codvendedor = :codvendedor";
		Query<Vendedor> query = session.createQuery(hql);
		query.setParameter("codvendedor", codvendedor);
		return query.getSingleResult();
	}

	public void  updateBycodvendedor(Integer codvendedor , Vendedor vendedor) {

		Vendedor v = findByCod(codvendedor);
		vendedor.setCodvendedor(codvendedor);
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.update(vendedor);
		transaction.commit();
	}

	public void  deleteBycodvendedor(Integer codvendedor) {

		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.delete(findByCod(codvendedor));
		transaction.commit();
	}
	
	
	
	
	public static void main(String[] args) {
		
	Vendedor v1 = new Vendedor(1, 654654656, 6546588, "Carlos", "endereco");
	Vendedor v2 = new Vendedor(2, 887898987, 5589764, "Sergio", "aeasdasdasdas");	
		
		VendedorDAO vdao = new VendedorDAO();
		v1.setCodvendedor(null);
		v1.setCodvendedor(null);
		vdao.salvar(v1);
		vdao.salvar(v2);
		
		
	}


}


