package utilities;

import testsStationLineManagement.TestAssignStationToLine;
import BusinessDelegator.LineServicesDelegate;
import BusinessDelegator.ReadingManagementDelegate;
import BusinessDelegator.StationDelegate;
import BusinessDelegator.UserServicesDelegate;
import entities.Category;
import entities.ContentManager;
import entities.Ebook;
import entities.Line;
import entities.MeanOfTransport;
import entities.Station;
import entities.Traveler;
import entities.Type;

public class populateDB {
	public static void main(String[] args) {
		// ///////////Populating library
		Ebook ebook = new Ebook("Twilight", "Stephanie Meyer",
				"Bella est amoureuse et certaine.", Category.Fiction,
				Type.Livre, " Edward i7ab Bella , Bella ta3mel fiHom ");
		System.out.println(ReadingManagementDelegate.doAddEbook(ebook));

		Ebook ebook2 = new Ebook("Lorem Ipsum", "Sabrine Maalej",
				"Lorem Ipsum", Category.Business, Type.Article,
				" Hal PiDev chayabli rassi, jouny marre. Adieu. bisous. ok. L'animal ; ");
		System.out.println(ReadingManagementDelegate.doAddEbook(ebook2));

		// ////////Populating MOT

		MeanOfTransport meanOfTransport = new MeanOfTransport();
		meanOfTransport.setRegistrationNumber("TCV1");
		// System.out.println(MeansOfTransportDelegate.addMeanOfTransport(meanOfTransport));

		// Line line=new Line();
		// line.setLineId(1);
		// System.out.println(MeansOfTransportDelegate.doAssignMeanOfTransportToLine(meanOfTransport,
		// line.getLineId()));

		// MeanOfTransport meanOfTransport2=new MeanOfTransport();
		// meanOfTransport2.setRegistrationNumber("TCV2");
		// System.out.println(MeansOfTransportDelegate.addMeanOfTransport(meanOfTransport2));

		// //////Populate Users
		Traveler traveler = new Traveler();
		traveler.setName("houcem");
		traveler.setPassword("houcem");
		System.out.println(UserServicesDelegate.getProxy().addUser(traveler));

		Traveler traveler2 = new Traveler();
		traveler2.setName("sabrine");
		traveler2.setPassword("sabrine");
		traveler2.setNbOfWordsPerMinute(300);
		System.out.println(UserServicesDelegate.getProxy().addUser(traveler2));

		ContentManager contentManager = new ContentManager();
		contentManager.setName("yosr");
		contentManager.setPassword("yosr");
		System.out.println(UserServicesDelegate.getProxy().addUser(
				contentManager));

		// ////////Populate Stations
		Station st0 = new Station();
		st0.setName("Ariana");
		st0.setReference(0);
		st0.setX(20);
		st0.setY(50);

		Station st1 = new Station();
		st1.setName("Barcelone");
		st1.setReference(1);
		st1.setX(40);
		st1.setY(20);

		Station st2 = new Station();
		st2.setName("Hammam lif");
		st2.setReference(2);
		st2.setX(60);
		st2.setY(20);

		Station st3 = new Station();
		st3.setName("Rades");
		st3.setReference(3);
		st3.setX(80);
		st3.setY(20);

		Station st4 = new Station();
		st4.setName("La marsa");
		st4.setReference(4);
		st4.setX(20);
		st4.setY(20);

		Station st5 = new Station();
		st5.setName("Mourouj");
		st5.setReference(5);
		st5.setX(20);
		st5.setY(40);

		Station st6 = new Station();
		st6.setName("Ezzahra");
		st6.setReference(6);
		st6.setX(20);
		st6.setY(60);

		Station st7 = new Station();
		st7.setName("Le Kef");
		st7.setReference(7);
		st7.setX(20);
		st7.setY(80);


		Station st8 = new Station();
		st8.setName("Beb Alioua");
		st8.setReference(8);
		st8.setX(100);
		st8.setY(20);

		StationDelegate.DoaddStation(st8);
		StationDelegate.DoaddStation(st0);
		StationDelegate.DoaddStation(st1);
		StationDelegate.DoaddStation(st2);
		StationDelegate.DoaddStation(st3);
		StationDelegate.DoaddStation(st4);
		StationDelegate.DoaddStation(st5);
		StationDelegate.DoaddStation(st6);
		StationDelegate.DoaddStation(st7);
		// //Populating line

		Line line1 = new Line();
		line1.setName("L1");

		Line line2 = new Line();
		line2.setName("L2");

		System.out.println(LineServicesDelegate.DoaddLine(line1));
		System.out.println(LineServicesDelegate.DoaddLine(line2));
		System.out.println(LineServicesDelegate.doFindAllLines());

		TestAssignStationToLine.main(null);

	}
}
