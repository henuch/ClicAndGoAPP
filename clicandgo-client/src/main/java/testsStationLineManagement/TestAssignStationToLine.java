package testsStationLineManagement;

import BusinessDelegator.StationLineManagementDelegate;
import entities.Station;

public class TestAssignStationToLine {
	public static void main(String[] args) {
		Station station = new Station();
		station.setStationId(3);

		System.out.println(StationLineManagementDelegate.doAssignStationToLine(
				station, 2, 3, 4, 2));
	}

}
