package testsStationLineManagement;

import BusinessDelegator.StationLineManagementDelegate;

public class TestAssignStationToLine {
	public static void main(String[] args) {

		System.out.println(StationLineManagementDelegate.doAssignStationToLine(
				1, 1, 1, 0, 0));
		System.out.println(StationLineManagementDelegate.doAssignStationToLine(
				2, 1, 2, 2, 2));

		System.out.println(StationLineManagementDelegate.doAssignStationToLine(
				3, 1, 3, 3, 3));

		System.out.println(StationLineManagementDelegate.doAssignStationToLine(
				4, 1, 4, 4, 4));

		System.out.println(StationLineManagementDelegate.doAssignStationToLine(
				5, 2, 1, 0, 0));

		System.out.println(StationLineManagementDelegate.doAssignStationToLine(
				6, 2, 3, 3, 3));

		System.out.println(StationLineManagementDelegate.doAssignStationToLine(
				7, 2, 4, 4, 4));

		System.out.println(StationLineManagementDelegate.doAssignStationToLine(
				8, 2, 5, 5, 5));

		System.out.println(StationLineManagementDelegate.doAssignStationToLine(
				2, 2, 2, 2, 2));

	}

}
