package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.Weapon;

/**
 * @author chumb - djackson16
 * CIS175 - Spring 2024
 * Feb 26, 2024
 */
public class WeaponHelper {
	static EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("JavaII_Mini_Project");
	
	public List<Weapon> showAllWeapons() {
		EntityManager em = emfactory.createEntityManager();
		List<Weapon> allWeapons = em.createQuery("SELECT w FROM Weapon w").getResultList();
		return allWeapons;
	}
	
	public void insertWeapon(Weapon w ) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(w);
		em.getTransaction().commit();
		em.close();
	}
	
	public void deleteWeapon(Weapon toDelete) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<Weapon> typedQuery = em.createQuery("select wp from Weapon wp where wp.id = :selectedId and wp.weaponName = :selectedWeaponName", Weapon.class);
		
		//Substitute parameter with actual data from the toDelete Weapon
		typedQuery.setParameter("selectedId", toDelete.getId());
		typedQuery.setParameter("selectedWeaponName", toDelete.getWeaponName());
		
		//we only want one result
		typedQuery.setMaxResults(1);
		
		//get the result and save it into a new Weapon
		Weapon result = typedQuery.getSingleResult();
		
		//remove it
		em.remove(result);
		em.getTransaction().commit();
		em.close();
	}
	
	public void updateWeapon(Weapon toEdit) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.merge(toEdit);
		em.getTransaction().commit();
		em.close();
	}
	
	public Weapon searchForWeaponById(int idToEdit) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		Weapon found = em.find(Weapon.class, idToEdit);
		em.close();
		return found;
	}
	
	public void cleanUp() {
		emfactory.close();
	}
}
