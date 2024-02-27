package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.Unit;

/**
 * @author chumb - djackson16
 * CIS175 - Spring 2024
 * Feb 26, 2024
 */
public class UnitHelper {
	static EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("JavaII_Mini_Project");
	
	public List<Unit> showAllUnits() {
		EntityManager em = emfactory.createEntityManager();
		List<Unit> allUnits = em.createQuery("SELECT u FROM Unit u").getResultList();
		return allUnits;
	}
	
	public void insertUnit(Unit u) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(u);
		em.getTransaction().commit();
		em.close();
	}
	
	public void deleteUnit(Unit toDelete) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<Unit> typedQuery = em.createQuery("select u from Unit u where u.id = :selectedId and u.unitName = :selectedUnitName", Unit.class);
		
		//Substitute parameter with actual data from the toDelete unit
		typedQuery.setParameter("selectedId", toDelete.getId());
		typedQuery.setParameter("selectedUnitName", toDelete.getUnitName());
		
		//we only want one result
		typedQuery.setMaxResults(1);
		
		//get the result and save it into a new Unit
		Unit result = typedQuery.getSingleResult();
		
		//remove it
		em.remove(result);
		em.getTransaction().commit();
		em.close();
	}
	
	public void updateItem(Unit toEdit) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.merge(toEdit);
		em.getTransaction().commit();
		em.close();
	}
	
	public Unit searchForUnitById(int idToEdit) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		Unit found = em.find(Unit.class, idToEdit);
		em.close();
		return found;
	}
}
