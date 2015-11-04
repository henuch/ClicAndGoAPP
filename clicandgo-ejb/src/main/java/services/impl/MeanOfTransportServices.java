package services.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import services.interfaces.MeanOfTransportServicesLocal;
import services.interfaces.MeanOfTransportServicesRemote;
import entities.MeanOfTransport;

/**
 * Session Bean implementation class MeanOfTransportServices
 */
@Stateless
public class MeanOfTransportServices implements MeanOfTransportServicesRemote,
		MeanOfTransportServicesLocal {
	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public MeanOfTransportServices() {

	}

	@Override
	public Boolean addMeanOfTransport(MeanOfTransport MeanOfTransport) {
		Boolean b = false;
		try {
			entityManager.persist(MeanOfTransport);
			b = true;
		} catch (Exception e) {
			System.err.println("A problem occured while adding "
					+ MeanOfTransport);
		}
		return b;
	}

	@Override
	public Boolean deleteMeanOfTransportById(String Id) {
		Boolean b = false;
		try {
			entityManager.remove(findMeanOfTransportById(Id));
			b = true;
		} catch (Exception e) {
			System.err.println("A problem occured while deleting MoT number"
					+ Id);
		}
		return b;
	}

	@Override
	public Boolean updateMeanOfTransport(MeanOfTransport MeanOfTransport) {
		Boolean b = false;
		try {
			entityManager.merge(MeanOfTransport);
			b = true;
		} catch (Exception e) {
			System.err.println("A problem occured while updating "
					+ MeanOfTransport);
		}
		return b;
	}

	@Override
	public MeanOfTransport findMeanOfTransportById(String Id) {
		try {
			return entityManager.find(MeanOfTransport.class, Id);
		} catch (Exception e) {
			System.err
					.println("A problem occured while trying to find MoT by  "
							+ Id);

		}
		return null;

	}

	@Override
	public Boolean deleteMeanOfTransport(MeanOfTransport MeanOfTransport) {
		Boolean b = false;
		try {
			entityManager.remove(entityManager.merge(MeanOfTransport));
			b = true;
		} catch (Exception e) {
			System.err.println("A problem occured while deleting "
					+ MeanOfTransport);
		}
		return b;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<MeanOfTransport> findAllMeanOfTransports() {
		String jpql = "select m from MeanOfTransport m";
		Query query = entityManager.createQuery(jpql);
		return query.getResultList();
	}

}
