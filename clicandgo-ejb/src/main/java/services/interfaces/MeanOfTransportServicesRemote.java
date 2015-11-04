package services.interfaces;

import java.util.List;

import javax.ejb.Remote;

import entities.MeanOfTransport;

@Remote
public interface MeanOfTransportServicesRemote {
	Boolean addMeanOfTransport(MeanOfTransport MeanOfTransport);

	Boolean deleteMeanOfTransportById(String Id);

	Boolean updateMeanOfTransport(MeanOfTransport MeanOfTransport);

	MeanOfTransport findMeanOfTransportById(String Id);

	Boolean deleteMeanOfTransport(MeanOfTransport MeanOfTransport);

	List<MeanOfTransport> findAllMeanOfTransports();

}
