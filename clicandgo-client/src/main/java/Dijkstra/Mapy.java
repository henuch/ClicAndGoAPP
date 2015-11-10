package Dijkstra;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.List;

import javax.swing.JPanel;

import BusinessDelegator.LineServicesDelegate;
import BusinessDelegator.StationDelegate;
import BusinessDelegator.StationLineManagementDelegate;
import entities.Line;
import entities.Station;

public class Mapy extends JPanel {
	@Override
	protected void paintComponent(Graphics g) {
		Graphics2D gr = (Graphics2D) g;
		
		
	//gr.setColor(Color.red);
		List<Line> lines = LineServicesDelegate.doFindAllLines();
		
		for (Line l : lines) {
			//setBackground(getBackground());
			
			List<Station> stations = StationLineManagementDelegate.doFindAllStationsByLineId(l.getLineId());
			
			for (Station s : stations) {
				System.out.println("" + l.getName() + "" + s.getName()+" ");
			}

			for (Station station : stations) {
				
				if (station.getX() != null && station.getY() != null) {
					gr.setColor(Color.red);
					gr.fillOval(station.getX(), station.getY(), 13, 13);
					gr.setColor(Color.BLUE);
		
					gr.drawString(station.getName(), station.getX(), station.getY()-10);
                     
				}

			}
			for (int i = 0; i < stations.size()-1; i++) {
				gr.setColor(Color.black);
				gr.setStroke(new BasicStroke( (float) 1.5 ));
				gr.drawLine(stations.get(i).getX()+5, stations.get(i).getY()+5,
						stations.get(i+1).getX()+5, stations.get(i+1).getY()+5);
			}
			

		}

	

	}
}