package persistence;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;


import model.Conseiller;

public class ConseillerDao implements IDao {
	
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
	private List<Conseiller> list = new ArrayList<Conseiller>();
	
	@Override
	public boolean add(Conseiller c) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		
		try {
			txn.begin();
			em.persist(c);
			txn.commit();
		} catch (Exception e) {
			if (txn != null) {
				txn.rollback();
			}
			e.printStackTrace();
			return false;
		} finally {
			if (em != null) {
				em.close();
			}
			if (emf != null) {
				emf.close();
			}
		}
		return false;
	}

	@Override
	public Conseiller findById(int id) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		Conseiller result = new Conseiller();
		try {
			txn.begin();
			Conseiller find = em.find(Conseiller.class, id);
			result = find;
			txn.commit();
		} catch (Exception e) {
			if (txn != null) {
				txn.rollback();
			}
			e.printStackTrace();
		} finally {
			if (em != null) {
				em.close();
			}
			if (emf != null) {
				emf.close();
			}
		}
		return result;
	}

	@Override
	public boolean update(Conseiller c, int id) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		try {
			txn.begin();
			Conseiller cFind = em.find(Conseiller.class, id);
			cFind.setName(c.getName());
			cFind.setFirstName(c.getFirstName());
			cFind.setDob(c.getDob());
			cFind.setSalary(c.getSalary());;
			txn.commit();
		} catch (Exception e) {
			if (txn != null) {
				txn.rollback();
			}
			e.printStackTrace();
			return false;
		} finally {
			if (em != null) {
				em.close();
			}
			if (emf != null) {
				emf.close();
			}
		}
		return true;
	}

	@Override
	public boolean delete(int id) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		try {
			txn.begin();
			Conseiller find = em.find(Conseiller.class, id);
			em.remove(find);
			txn.commit();
		} catch (Exception e) {
			if (txn != null) {
				txn.rollback();
			}
			e.printStackTrace();
			return false;
		} finally {
			if (em != null) {
				em.close();
			}
			if (emf != null) {
				emf.close();
			}
		}
		return true;
	}

	@Override
	public List<Conseiller> findAll() {
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		TypedQuery<Conseiller> query = em.createQuery("from Conseiller", Conseiller.class);
		list = query.getResultList();
		return list;
	}

}
