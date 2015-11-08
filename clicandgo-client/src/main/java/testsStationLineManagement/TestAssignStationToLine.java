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
	}

}
