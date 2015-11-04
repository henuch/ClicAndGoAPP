package utilities;

import entities.Ebook;
import BusinessDelegator.ReadingManagementDelegate;


public class populateDB {
	public static void main(String[] args) {

		Ebook ebook = new Ebook();
		ebook.setTitle("Twilight");
		ebook.setAuthor("Stephanie King");
		ebook.setCategory("Fiction");
		ebook.setDescription("Lorem Ipsum");
		ebook.setType("Roman");
		ebook.setNbOfWords(30);
		ReadingManagementDelegate.doAddEbook(ebook);
		
		Ebook ebook2 = new Ebook();
		ebook2.setTitle("Lorem Ipsum");
		ebook2.setAuthor("Sabrine Maalej");
		ebook2.setCategory("Business");
		ebook2.setDescription("Lorem Ipsum");
		ebook2.setType("Article");
		ebook2.setNbOfWords(20);
		ReadingManagementDelegate.doAddEbook(ebook2);
		

		
	}
}
