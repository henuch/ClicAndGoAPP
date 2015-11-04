package BusinessDelegator;

import java.util.List;

import entities.Ebook;
import entities.StationLine;
import entities.Traveler;
import ServiceLocator.ServiceLocator;
import services.interfaces.ReadingManagementRemote;

public class ReadingManagementDelegate {

	public static final String jndiName = "/clicandgo-ejb/ReadingManagement!services.interfaces.ReadingManagementRemote";

	public static ReadingManagementRemote getProxy() {
		return (ReadingManagementRemote) ServiceLocator.getInstance().getProxy(
				jndiName);
	}

	public static Boolean doAddEbook(Ebook ebook){
		return getProxy().addEbook(ebook);
	}
	
	public static List<Ebook> doSuggestEbooks(StationLine stationLine, Traveler traveler ){
		return getProxy().suggestEbooks(stationLine, traveler);
	}
	
	public static List<Ebook> doLookUpEbook(String search){
		return getProxy().lookUpEbook(search);
	}
}
