package services.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import entities.Ebook;
import entities.StationLine;
import entities.Traveler;
import services.interfaces.ReadingManagementLocal;
import services.interfaces.ReadingManagementRemote;

/**
 * Session Bean implementation class ReadingManagement
 */
@Stateless
public class ReadingManagement implements ReadingManagementRemote, ReadingManagementLocal {

	@PersistenceContext
	private EntityManager entityManager;
	
    public ReadingManagement() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public Boolean addEbook(Ebook ebook) {
		Boolean b = false;
		try {
			entityManager.merge(ebook);
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

	//je recupere l'utilisateur connecté et son trajet actuel
	@SuppressWarnings("unchecked")
	@Override
	public List<Ebook> suggestEbooks(StationLine stationLine,
			Traveler traveler) {
		try {
			//Traveler travelerFound=entityManager.find(Traveler.class, traveler.getUserId());
			//StationItinerary stationItineraryFound=entityManager.find(StationItinerary.class, stationItinerary.getStationItineraryId());
			//Double duration=stationItineraryFound.getDuration();//supposant que c'est en minute
			//entityManager.merge(travelerFound);
			//entityManager.merge(stationItineraryFound);
			Integer MaxNbOfWords = 22 ; //MaxNbOfWords = duration/ReaderSpeed
			String jpql = "select m from Ebook m where m.nbOfWords <= ?1";
			Query query = entityManager.createQuery(jpql);
			query.setParameter(1, MaxNbOfWords);
			return query.getResultList();
			
		} catch (Exception e) {
			return null;
		}
		
		
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Ebook> viewLibrary() {
		try {
			String jpql = "select m from Ebook m";
			Query query = entityManager.createQuery(jpql);
			return query.getResultList();
			
		} catch (Exception e) {
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Ebook> viewLibraryByCategory(String category) {
		try {
			String jpql = "select m from Ebook m where m.category:=param";
			Query query = entityManager.createQuery(jpql);
			query.setParameter("param", category);
			return query.getResultList();
			
		} catch (Exception e) {
			return null;
		}

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Ebook> lookUpEbook(String search) {
		try {
			String jpql = "select m from Ebook m where m.author LIKE '%:param%'";
			Query query = entityManager.createQuery(jpql);
			query.setParameter("param", search);
			return query.getResultList();
			
		} catch (Exception e) {
			return null;
		}
		}

}
