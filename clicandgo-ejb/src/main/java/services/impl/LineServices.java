package services.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import entities.Line;
import services.interfaces.LineServicesLocal;
import services.interfaces.LineServicesRemote;

/**
 * Session Bean implementation class LineServices
 */
@Stateless
public class LineServices implements LineServicesRemote, LineServicesLocal {

	@PersistenceContext
	private EntityManager entityManager;
    /**
     * Default constructor. 
     */
    public LineServices() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public Boolean addLine(Line line) {
		Boolean b = false;
		try {
			entityManager.persist(line);
			b = true;
		} catch (Exception e) {
			System.err.println("A problem occured while adding " + line);
		}
		return b;
	}

	@Override
	public List<Line> findAllLines() {
		String jpql = "select s from Line s";
		Query query = entityManager.createQuery(jpql);
		return query.getResultList();
	}

}
