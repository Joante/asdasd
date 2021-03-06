package dao;

import java.util.List;
import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import datos.TarifaColectivo;

public class TarifaColectivoDao {
	private static Session session;
	private Transaction tx;

	private void iniciaOperacion() throws HibernateException {
		session = HibernateUtil.getSessionFactory().openSession();
		tx = session.beginTransaction();
	}

	private void manejaExcepcion(HibernateException he) throws HibernateException {
		tx.rollback();
		throw new HibernateException("ERROR en la capa de acceso a datos", he);
	}

	public int agregar(TarifaColectivo objeto) {
		int id = 0;
		try {
			iniciaOperacion();
			id = Integer.parseInt(session.save(objeto).toString());
			tx.commit();
		}
		catch (HibernateException he) {
			manejaExcepcion(he);
			throw he;
		}
		finally {
			session.close();
		}
		return id;
	}

	public void actualizar(TarifaColectivo objeto) throws HibernateException {
		try {
			iniciaOperacion();
			session.update(objeto);
			tx.commit();
		}
		catch (HibernateException he) {
			manejaExcepcion(he);
			throw he;
		}
		finally {
			session.close();
		}
	}

	public void eliminar(TarifaColectivo objeto) throws HibernateException {
		try {
			iniciaOperacion();
			session.delete(objeto);
			tx.commit();
		}
		catch (HibernateException he) {
			manejaExcepcion(he);
			throw he;
		}
		finally {
			session.close();
		}
	}

	public TarifaColectivo traerTarifaColectivo(long idTarifaColectivo) throws HibernateException {
		TarifaColectivo objeto = null;
		try {
			iniciaOperacion();
			objeto = (TarifaColectivo) session.get(TarifaColectivo.class, idTarifaColectivo);
		}
		finally {
			session.close();
		}
		return objeto;
	}
	
	@SuppressWarnings ( "unchecked" )
	public List<TarifaColectivo> traerTarifaColectivo() throws HibernateException {
		List<TarifaColectivo> lista= null;
		try {
		iniciaOperacion();
		lista=session.createQuery("from TarifaColectivo").list();
			
		} finally {
		session .close();
		}
		return lista;
		}

}
