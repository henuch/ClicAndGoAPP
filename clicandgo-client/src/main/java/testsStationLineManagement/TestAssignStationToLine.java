package testsStationLineManagement;

import BusinessDelegator.StationLineManagementDelegate;

public class TestAssignStationToLine {
	public static void main(String[] args) {

		System.out.println(StationLineManagementDelegate.doAssignStationToLine(
				1, 1, 1, 0, 4));

		System.out.println(StationLineManagementDelegate.doAssignStationToLine(
				2, 1, 3, 4, 2));

		System.out.println(StationLineManagementDelegate.doAssignStationToLine(
				3, 1, 3, 4, 2));

		System.out.println(StationLineManagementDelegate.doAssignStationToLine(
				4, 1, 3, 4, 2));

		System.out.println(StationLineManagementDelegate.doAssignStationToLine(
				5, 2, 1, 0, 4));

		System.out.println(StationLineManagementDelegate.doAssignStationToLine(
				6, 2, 3, 4, 2));

		System.out.println(StationLineManagementDelegate.doAssignStationToLine(
				7, 2, 3, 4, 2));

		System.out.println(StationLineManagementDelegate.doAssignStationToLine(
				8, 2, 3, 4, 2));

		System.out.println(StationLineManagementDelegate.doAssignStationToLine(
				1, 2, 1, 0, 4));

		System.out.println(StationLineManagementDelegate.doAssignStationToLine(
				2, 2, 3, 4, 2));

		System.out.println(StationLineManagementDelegate.doAssignStationToLine(
				7, 1, 3, 4, 2));

		System.out.println(StationLineManagementDelegate.doAssignStationToLine(
				8, 1, 3, 4, 2));
	}

}
