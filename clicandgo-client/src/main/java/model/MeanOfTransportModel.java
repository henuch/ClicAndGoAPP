package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import BusinessDelegator.MeansOfTransportDelegate;
import entities.MeanOfTransport;



public class MeanOfTransportModel extends AbstractTableModel {

    List<MeanOfTransport> means;
    String[] entete = {"Registration Number","Number of wagons", "Capacity","Line"};

    public MeanOfTransportModel(String registrationNumber) {
   MeanOfTransport mean = MeansOfTransportDelegate.doFindMeanOfTransportById(registrationNumber);
    }
 public MeanOfTransportModel(){
    means = MeansOfTransportDelegate.doFindAllMeanOfTransports();
 }
 

    @Override
    public int getRowCount() {
        return means.size();
    }

    @Override
    public int getColumnCount() {
        return entete.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0: {
                return means.get(rowIndex).getRegistrationNumber();
            }
            case 1: {
                return means.get(rowIndex).getNbOfWagons();
            }
            case 2: {
                return means.get(rowIndex).getCapacity();

            }
            case 3: {
                return means.get(rowIndex).getLine();
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
