package services.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import services.interfaces.StationLineManagementLocal;
import services.interfaces.StationLineManagementRemote;
import entities.Line;
import entities.Station;
import entities.StationLine;

/**
 * Session Bean implementation class StationLineManagement
 */
@Stateless
public class StationLineManagement implements StationLineManagementRemote,
		StationLineManagementLocal {

	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public StationLineManagement() {
	}

	@Override
	public Boolean assignNewStationToLine(Station newStation, Integer lineId,
			Integer position, Integer duration, Integer distance) {

		Boolean b = false;
		try {
			Line line = (Line) entityManager.find(Line.class, lineId);
			entityManager.merge(newStation);
			StationLine stationLine = new StationLine(newStation, line,
					position, duration, distance);
			entityManager.merge(stationLine);
			b = true;

		} catch (Exception e) {
			System.out.println("errooor new station to line");
		}
		return b;

	}

	@Override
	public Boolean assignStationToLine(Station station, Integer lineId,
			Integer position, Integer duration, Integer distance) {
		Boolean b = false;
		try {
			Line line = (Line) entityManager.find(Line.class, lineId);
			StationLine stationLine = new StationLine(station, line, position,
					duration, distance);
			entityManager.merge(stationLine);
			b = true;

		} catch (Exception e) {
			System.out.println("errooor station to line");
		}
		return b;

	}

	@Override
	public Station findStationById(Integer id) {
		try {
			return entityManager.find(Station.class, id);
		} catch (Exception e) {
			System.err
					.println("A problem occured while trying to find Station by  "
							+ id);

		}
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Object findStationByName(String name) {
		try {
			String jpql = "select s from Station s where s.name=:param";
			Query query = entityManager.createQuery(jpql);
			query.setParameter("param", name);
			return query.getSingleResult();

		} catch (Exception e) {
			return null;
		}

	}

	@Override
	public Line findLineById(Integer id) {
		try {
			return entityManager.find(Line.class, id);
		} catch (Exception e) {
			System.err
					.println("A problem occured while trying to find Line by  "
							+ id);

		}
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Object findLineByName(String name) {
		try {
			String jpql = "select l from Line l where l.name=:param";
			Query query = entityManager.createQuery(jpql);
			query.setParameter("param", name);
			return query.getSingleResult();

		} catch (Exception e) {
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Station> findAllStations() {
		String jpql = "select s from Station s";
		Query query = entityManager.createQuery(jpql);
		return query.getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Line> findAllLines() {
		String jpql = "select i from Line i";
		Query query = entityManager.createQuery(jpql);
		return query.getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Station> findAllStationsByLineId(Integer id) {
		try {
			String jpql = "select s from Station s join s.stationLines sls where sls.line.lineId=:param";
			Query query = entityManager.createQuery(jpql);
			query.setParameter("param", id);
			return query.getResultList();

		} catch (Exception e) {
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public Line findLineOfTwoStations(Station station, Station station1) {
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public StationLine findStationLineByLineAndStation(Line line,
			Station station) {
		try {
			String jpql = "select sl from StationLine sl where sl.line.lineId=:param";
			Query query = entityManager.createQuery(jpql);
			query.setParameter("param", line.getLineId());
			return (StationLine) query.getSingleResult();

		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public StationLine findStationLineOfOneStationInTheSameLineOfAnotherStation(
			Station station, Station station1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean AntecedentInTheSameLine(Station station, Station station1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean addLine(Line line) {
		Boolean b = false;
		try {
			entityManager.merge(line);
			b = true;
		} catch (Exception e) {
			System.err.println("A problem occured while adding " + line);
		}
		return b;
	}

}
