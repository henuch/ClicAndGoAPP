package BusinessDelegator;

import java.util.List;

import services.interfaces.StationLineManagementRemote;
import ServiceLocator.ServiceLocator;
import entities.Line;
import entities.Station;
import entities.StationLine;

public class StationLineManagementDelegate {

	public static final String jndiName = "/clicandgo-ejb/StationLineManagement!services.interfaces.StationLineManagementRemote";

	public static StationLineManagementRemote getProxy() {
		return (StationLineManagementRemote) ServiceLocator.getInstance()
				.getProxy(jndiName);
	}

	public static Boolean doAssignNewStationToLine(Station newStation,
			Integer lineId, Integer position, Integer duration, Integer distance) {
		return getProxy().assignNewStationToLine(newStation, lineId, position,
				duration, distance);
	}

	public static Boolean doAssignStationToLine(Station station,
			Integer lineId, Integer position, Integer duration, Integer distance) {
		return getProxy().assignStationToLine(station, lineId, position,
				duration, distance);
	}

	public static Station doFindStationById(Integer id) {
		return getProxy().findStationById(id);
	}

	public static Object doFindStationByName(String name) {
		return getProxy().findStationByName(name);
	}

	public static Object doFindLineByName(String name) {
		return getProxy().findLineByName(name);
	}

	public static Line doFindLineById(Integer id) {
		return getProxy().findLineById(id);
	}

	public static List<Station> doFindAllStations() {
		return getProxy().findAllStations();
	}

	public static List<Line> doFindAllLines() {
		return getProxy().findAllLines();
	}

	public static List<Station> doFindAllStationsByLineId(Integer id) {
		return getProxy().findAllStationsByLineId(id);
	}

	public static StationLine doFindStationLineByLineAndStation(Line line,
			Station station) {
		return getProxy().findStationLineByLineAndStation(line, station);
	}

}
