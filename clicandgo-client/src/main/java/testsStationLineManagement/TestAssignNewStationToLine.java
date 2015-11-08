package testsStationLineManagement;

import BusinessDelegator.StationLineManagementDelegate;
import entities.Station;

public class TestAssignNewStationToLine {

	public static void main(String[] args) {

		Station newStation = new Station();
		newStation.setStationId(14);
		newStation.setName("Kef");

		System.out.println(StationLineManagementDelegate
				.doAssignNewStationToLine(newStation, 1, 1, 1, 2));

	}
}
