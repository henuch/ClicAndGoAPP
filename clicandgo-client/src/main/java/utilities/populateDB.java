package utilities;

import entities.Category;
import entities.Ebook;
import entities.Type;
import BusinessDelegator.ReadingManagementDelegate;


public class populateDB {
	public static void main(String[] args) {

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
		

		
		
	}
}
