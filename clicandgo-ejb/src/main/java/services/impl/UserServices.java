package services.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import entities.MeanOfTransport;
import entities.User;
import services.interfaces.UserServicesLocal;
import services.interfaces.UserServicesRemote;

/**
 * Session Bean implementation class UserServices
 */
@Stateless
public class UserServices implements UserServicesRemote, UserServicesLocal {

	@PersistenceContext
	EntityManager entityManager;
    /**
     * Default constructor. 
     */
    public UserServices() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public Boolean addUser(User u) {
		Boolean b = false;
		try {
			entityManager.persist(u);
			b = true;
		} catch (Exception e) {
			System.err.println("A problem occured while adding "
					+ u);
		}
		return b;
	}

	@Override
	public Boolean deleteUserById(int id) {
		Boolean b = false;
		try {
			entityManager.remove(findUserById(id));
			b = true;
		} catch (Exception e) {
			System.err.println("A problem occured while deleting MoT number"
					+ id);
		}
		return b;
	}

	@Override
	public User updateUser(int id) {
		User u=findUserById(id);
		try {
			
			entityManager.merge(u);
		
		} catch (Exception e) {
			System.err.println("A problem occured while updating "+u);
		}
		return u;
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> findAllUsers() {
		String jpql = "select u from User u";
		Query query = entityManager.createQuery(jpql);
		return query.getResultList();
	}

	@Override
	public User findUserById(int id) {
		try {
			return entityManager.find(User.class, id);
		} catch (Exception e) {
			System.err
					.println("A problem occured while trying to find MoT by  "
							+ id);

	}
		return null;

}
}