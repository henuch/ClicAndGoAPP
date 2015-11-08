package BusinessDelegator;

import java.lang.reflect.Proxy;
import java.util.List;

import javax.swing.text.StyledEditorKit.BoldAction;

import services.interfaces.MeanOfTransportServicesRemote;
import ServiceLocator.ServiceLocator;
import entities.MeanOfTransport;

public class MeansOfTransportDelegate {

	public static final String jndiName = "/clicandgo-ejb/MeanOfTransportServices!services.interfaces.MeanOfTransportServicesRemote";

	public static MeanOfTransportServicesRemote getProxy() {
		return (MeanOfTransportServicesRemote) ServiceLocator.getInstance()
				.getProxy(jndiName);
	}

	public static Boolean addMeanOfTransport(MeanOfTransport MeanOfTransport) {
		return getProxy().addMeanOfTransport(MeanOfTransport);

	}

	public static Boolean doAssignMeanOfTransportToLine(
			MeanOfTransport newMeanOfTransport, Integer lineId) {
		return getProxy().assignMeanOfTransportToLine(newMeanOfTransport,
				lineId);

	}
	public static MeanOfTransport doFindMeanOfTransportById(String Id) {
		return getProxy().findMeanOfTransportById(Id);
	}
	public static List<MeanOfTransport> doFindAllMeanOfTransports() 
	{
	return getProxy().findAllMeanOfTransports();
	}
	public static Boolean DoDeleteMeanOfTransportById(String Id)
	{
		return getProxy().deleteMeanOfTransportById(Id);
	}
}
