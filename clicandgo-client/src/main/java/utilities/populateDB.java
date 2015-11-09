package utilities;

import BusinessDelegator.ReadingManagementDelegate;
import BusinessDelegator.StationDelegate;
import BusinessDelegator.UserServicesDelegate;
import entities.Category;
import entities.Ebook;
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
		// ////////Populate Stations
		Station st0 = new Station();
		st0.setName("Ariana");
		st0.setReference(0);
		StationDelegate.DoaddStation(st0);

		Station st1 = new Station();
		st1.setName("Barcelone");
		st1.setReference(1);
		StationDelegate.DoaddStation(st1);

		Station st2 = new Station();
		st2.setName("Hammam lif");
		st2.setReference(2);
		StationDelegate.DoaddStation(st2);

		Station st3 = new Station();
		st3.setName("Rades");
		st3.setReference(3);
		StationDelegate.DoaddStation(st3);

		Station st4 = new Station();
		st4.setName("La marsa");
		st4.setReference(4);
		StationDelegate.DoaddStation(st4);

		Station st5 = new Station();
		st5.setName("Mourouj");
		st5.setReference(5);
		StationDelegate.DoaddStation(st5);

		Station st6 = new Station();
		st6.setName("Ezzahra");
		st6.setReference(6);
		StationDelegate.DoaddStation(st6);

		Station st7 = new Station();
		st7.setName("Le Kef");
		st7.setReference(7);
		StationDelegate.DoaddStation(st7);

	}
}
