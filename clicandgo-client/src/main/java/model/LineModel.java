package model;



import java.util.List;

import javax.swing.table.AbstractTableModel;

import BusinessDelegator.StationLineManagementDelegate;

import entities.Line;

public class LineModel extends AbstractTableModel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	List<Line> lines ;
	String[] entete = { "Reference", "Name","Number of stations" };


	public LineModel() {
	lines = StationLineManagementDelegate.doFindAllLines();
	}
	public LineModel(String search ) {		
	lines= (List<Line>) StationLineManagementDelegate.doFindLineByName(search);
	}

	@Override
	public int getRowCount() {
		return lines.size();
	}

	@Override
	public int getColumnCount() {
		return entete.length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		switch (columnIndex) {
		case 0: {
			return lines.get(rowIndex).getLineId();
		}
		case 1: {
			return lines.get(rowIndex).getName();
		}
		case 2: {
			return lines.get(rowIndex).getNbStations();
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
