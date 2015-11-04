package entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: Line
 *
 */
@Entity
public class Line implements Serializable {

	private Integer lineId;
	private String name;
	private Integer nbStations;
	private static final long serialVersionUID = 1L;

	private List<StationLine> stationLines;
	private List<MeanOfTransport> meansOftransport;
	//private List<Ticket> tickets;

	@Id
	public Integer getLineId() {
		return lineId;
	}

	public void setLineId(Integer lineId) {
		this.lineId = lineId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getNbStations() {
		return nbStations;
	}

	public void setNbStations(Integer nbStations) {
		this.nbStations = nbStations;
	}

	@OneToMany(mappedBy = "line")
	public List<StationLine> getStationLines() {
		return stationLines;
	}

	public void setStationLines(List<StationLine> stationLines) {
		this.stationLines = stationLines;
	}


	 @OneToMany(mappedBy = "line")
	 public List<MeanOfTransport> getMeansOftransport() {
	 return meansOftransport;
	 }
	
	 public void setMeansOftransport(List<MeanOfTransport> meansOftransport) {
	 this.meansOftransport = meansOftransport;
	 }
	

	


}
