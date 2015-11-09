package testsStationLineManagement;

import BusinessDelegator.StationLineManagementDelegate;

public class TestFindLineOfTwoStations {
	public static void main(String[] args) {
		System.out.println(StationLineManagementDelegate
				.doFindLineOfTwoStations(2,5));
	}

}
