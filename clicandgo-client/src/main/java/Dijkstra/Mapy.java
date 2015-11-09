package Dijkstra;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.List;

import javax.swing.JPanel;

import BusinessDelegator.LineServicesDelegate;
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
			
			List<Station> stations = StationLineManagementDelegate
					.doFindAllStationsByLineId(l.getLineId());
			
			for (Station s : stations) {
				System.out.println("" + l.getName() + "" + s.getName()+" ");
			}

			for (Station station : stations) {
				
				if (station.getX() != null && station.getY() != null) {
					gr.setColor(Color.red);
					gr.fillOval(station.getX(), station.getY(), 10, 10);
					gr.setColor(Color.BLUE);
					gr.drawString(station.getName(), station.getX(), station.getY()-10);

				}

			}
			for (int i = 0; i < stations.size()-1; i++) {
				gr.setColor(Color.black);
				gr.drawLine(stations.get(i).getX()+5, stations.get(i).getY()+5,
						stations.get(i+1).getX()+5, stations.get(i+1).getY()+5);
			}
			

		}

		// for (Station s : stations) {
		// gr.fillOval(s.getX(), s.getY(), 10, 10);
		// // }
		// gr.fillOval(stations.get(1).getX(), stations.get(1).getY(), 10, 10);
		// gr.fillOval(stations.get(2).getX(), stations.get(2).getY(), 10, 10);
		//
		// gr.setColor(Color.black);
		// gr.drawLine(stations.get(1).getX(), stations.get(1).getY(), stations
		// .get(2).getX(), stations.get(2).getY());
		// gr.fillOval(10, 120, 10, 10);
		// gr.fillOval(100, 60, 10, 10);
		// gr.fillOval(150, 20, 10, 10);
		// gr.fillOval(200, 60, 10, 10);
		// gr.fillOval(280, 10, 10, 10);

		// gr.setColor(Color.black);
		// gr.drawLine(15, 125, 105, 65);
		// gr.drawLine(105, 65, 155, 25);
		// gr.drawLine(155, 25, 205, 65);
		// gr.drawLine(155, 25, 285, 15);

	}
}