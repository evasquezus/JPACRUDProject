package com.skilldistillery.leaders.data;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.skilldistillery.leadersdata.entities.Leaders;

@Transactional
@Service
public class LeadersDAOImpl implements LeadersDAO {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Leaders create(Leaders leader) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("VideoStore");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(leader);
		em.flush();
		em.getTransaction().commit();
		return leader;
	}

	@Override
	public Leaders update(int id, Leaders leader) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("VideoStore");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Leaders managed = em.find(Leaders.class, id);
		managed.setFirstName(leader.getFirstName());
		managed.setLastName(leader.getLastName());
		managed.setGender(leader.getGender());
		managed.setCountry(leader.getCountry());
		managed.setDateOfBirth(leader.getDateOfBirth());
		managed.setBirthPlace(leader.getBirthPlace());

		em.getTransaction().commit();
		return managed;
	}
	
	

	@Override
	public boolean destroy(int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("VideoStore");
		EntityManager em = emf.createEntityManager();
		Leaders toBeDeleted = em.find(Leaders.class, id);
		em.getTransaction().begin();
		em.remove(toBeDeleted); // performs the delete on the managed entity
		em.getTransaction().commit();
		System.out.println(toBeDeleted.getId());
		Boolean result = !em.contains(toBeDeleted);
		return result;
	}

	@Override
	public Leaders findById(int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("VideoStore");
		EntityManager em = emf.createEntityManager();
		Leaders leaderFound = em.find(Leaders.class, id);
		return leaderFound;
	}

	@Override
	public List<Leaders> findAll() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("VideoStore");
		EntityManager em = emf.createEntityManager();
		String query = "SELECT f FROM leaders f";
		List<Leaders> allLeaders = new ArrayList<Leaders>();
		allLeaders = em.createQuery(query, Leaders.class).getResultList();
		return allLeaders;
	}

	@Override
	public boolean destroy(Leaders leaderId, int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("VideoStore");
		EntityManager em = emf.createEntityManager();
		Leaders toBeDeleted = em.find(Leaders.class, id);
		em.getTransaction().commit();
		System.out.println(toBeDeleted.getId());
		Boolean result = !em.contains(toBeDeleted);
		return result;
	}

	@Override
	public boolean editFilm(Leaders leadersID, int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("VideoStore");
		EntityManager em = emf.createEntityManager();
		Leaders toBeEdited = em.find(Leaders.class, id);
		em.getTransaction().commit();
		System.out.println(toBeEdited.getId());
		return false;
	}


}
