package services.interfaces;

import java.util.List;

import javax.ejb.Remote;

import entities.Line;
import entities.Station;

@Remote
public interface StationLineManagementRemote {
	public Boolean assignNewStationToLine(Station newStation, Integer lineId,
			Integer position, Integer duration, Integer distance);

	public Boolean assignStationToLine(Station station, Integer lineId,
			Integer position, Integer duration, Integer distance);

	public Station findStationById(Integer id);

	public Object findStationByName(String name);

	public Line findLineById(Integer id);

	public Object findLineByName(String name);

	public List<Station> findAllStations();

	public List<Line> findAllLines();

	public List<Station> findAllStationsByLineId(Integer id);
}
