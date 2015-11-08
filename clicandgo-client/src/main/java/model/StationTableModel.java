package model;



import java.util.List;

import javax.swing.table.AbstractTableModel;

import BusinessDelegator.ReadingManagementDelegate;
import BusinessDelegator.StationDelegate;
import entities.Ebook;
import entities.Station;

public class StationTableModel extends AbstractTableModel{
	
	List<Station> stations ;
	String[] entete = { "Name", "Reference" };


	public StationTableModel() {
	stations = StationDelegate.doFindAllStations();
	}
//	public StationTableModel(String search ) {
//		stations = StationDelegate.
//		}

	@Override
	public int getRowCount() {
		return stations.size();
	}

	@Override
	public int getColumnCount() {
		return entete.length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		switch (columnIndex) {
		case 0: {
			return stations.get(rowIndex).getName();
		}
		case 1: {
			return stations.get(rowIndex).getReference();
		}
		

		
		default:
			throw new IllegalArgumentException();

		}
	}

	@Override
	public String getColumnName(int column) {

		return entete[column];

	}

	
}
