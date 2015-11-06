package utilities;

import entities.Category;
import entities.Ebook;
import entities.Line;
import entities.MeanOfTransport;
import entities.Type;
import BusinessDelegator.MeansOfTransportDelegate;
import BusinessDelegator.ReadingManagementDelegate;


public class populateDB {
	public static void main(String[] args) {
/////////////Populating library
		Ebook ebook = new Ebook("Twilight",
								"Stephanie Meyer",
								"Bella est amoureuse et certaine.",
								Category.Fiction,
								Type.Livre,
								" Edward i7ab Bella , Bella ta3mel fiHom ");
		System.out.println(ReadingManagementDelegate.doAddEbook(ebook));
		
		Ebook ebook2 = new Ebook("Lorem Ipsum",
								 "Sabrine Maalej",
								 "Lorem Ipsum",
								 Category.Business,
								 Type.Article,
								 " Hal PiDev chayabli rassi, jouny marre. Adieu. bisous. ok. L'animal ; ");
		System.out.println(ReadingManagementDelegate.doAddEbook(ebook2));
		
//////////Populating MOT
		
		MeanOfTransport meanOfTransport=new MeanOfTransport();
		meanOfTransport.setRegistrationNumber("TCV1");
		//System.out.println(MeansOfTransportDelegate.addMeanOfTransport(meanOfTransport));
		
		Line line=new Line();
		line.setLineId(1);
		System.out.println(MeansOfTransportDelegate.doAssignMeanOfTransportToLine(meanOfTransport, line.getLineId()));
		
//		MeanOfTransport meanOfTransport2=new MeanOfTransport();
//		meanOfTransport2.setRegistrationNumber("TCV2");
//		System.out.println(MeansOfTransportDelegate.addMeanOfTransport(meanOfTransport2));
		
		
	}
}
