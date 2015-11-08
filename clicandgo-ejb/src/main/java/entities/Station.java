package entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: Station
 *
 */
@Entity
public class Station implements Serializable {

	private Integer stationId;
	private String name;
	private Integer reference;
	private static final long serialVersionUID = 1L;

	private List<StationLine> stationLines;

	public Station(){}
	
	
	public Station(String name, Integer reference) {
		super();
		this.name = name;
		this.reference = reference;
	}
	
	

	public Station(String name, Integer reference,
			List<StationLine> stationLines) {
		super();
		this.name = name;
		this.reference = reference;
		this.stationLines = stationLines;
	}



	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getStationId() {
		return stationId;
	}

	public void setStationId(Integer stationId) {
		this.stationId = stationId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@OneToMany(mappedBy = "station")
	public List<StationLine> getStationItineraries() {
		return stationLines;
	}

	public void setStationItineraries(List<StationLine> stationLines) {
		this.stationLines = stationLines;
	}

	@Override
	public String toString() {
		return "Station [stationId=" + stationId + ", name=" + name + "]";
	}

	public Integer getReference() {
		return reference;
	}

	public void setReference(Integer reference) {
		this.reference = reference;
	}

}
