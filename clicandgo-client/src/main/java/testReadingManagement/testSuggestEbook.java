package testReadingManagement;

import BusinessDelegator.ReadingManagementDelegate;
import entities.StationLine;
import entities.Traveler;

public class testSuggestEbook {

	public static void main(String[] args) {
		Traveler traveler = new Traveler();
		traveler.setName("Houcem");
		
		StationLine stationLine = new StationLine();
		stationLine.setDuration(33);
		
		System.out.println(ReadingManagementDelegate.doSuggestEbooks(stationLine, traveler));
	}
}
