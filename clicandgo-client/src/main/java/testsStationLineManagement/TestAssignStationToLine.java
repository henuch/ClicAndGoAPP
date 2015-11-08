package testsStationLineManagement;

import BusinessDelegator.StationLineManagementDelegate;
import entities.Station;

public class TestAssignStationToLine {
	public static void main(String[] args) {
		Station station = new Station();
		station.setStationId(1);

		System.out.println(StationLineManagementDelegate.doAssignStationToLine(
				station, 1, 3, 4, 2));

		Station station2 = new Station();
		station2.setStationId(2);

		System.out.println(StationLineManagementDelegate.doAssignStationToLine(
				station2, 1, 3, 4, 2));

		Station station3 = new Station();
		station3.setStationId(3);

		System.out.println(StationLineManagementDelegate.doAssignStationToLine(
				station3, 1, 3, 4, 2));

		Station station4 = new Station();
		station4.setStationId(4);

		System.out.println(StationLineManagementDelegate.doAssignStationToLine(
				station4, 1, 3, 4, 2));
	}

}
