package GráficoPrueba;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class PruebaGraficas extends JFrame 
{
	private static final long serialVersionUID = 1L;

	public PruebaGraficas() 
	{
		JPanel chartPanel = createChartPanel();
        add(chartPanel, BorderLayout.CENTER);
 
        setSize(640, 480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);	
	}
	
	 private JPanel createChartPanel() 
	 {
		 String chartTitle = "Ventas por día";
		 String xAxisLabel = "Días";
		 String yAxisLabel = "Ventas";
		 
		 XYDataset dataset = createDataset();
		 
		 JFreeChart chart = ChartFactory.createXYLineChart(chartTitle, xAxisLabel, yAxisLabel, dataset, PlotOrientation.VERTICAL, true, true, true);
		 
		 return new ChartPanel(chart);
	 }
	 
	 private XYDataset createDataset() 
	 {
		 XYSeriesCollection dataset = new XYSeriesCollection();
	     XYSeries series1 = new XYSeries("Object 1");
	     //XYSeries series2 = new XYSeries("Object 2");
	     
	     series1.add(1, 200);
	     series1.add(2, 350);
	     series1.add(3, 125);
	     series1.add(3, 468.8);
	     series1.add(4, 600.35);
	     
	     //series2.add(2.0, 1.0);
	     //series2.add(2.5, 2.4);
	     //series2.add(3.2, 1.2);
	     //series2.add(3.9, 2.8);
	     //series2.add(4.6, 3.0);
	     //series3.add(1.2, 4.0);
	     //series3.add(2.5, 4.4);
	     //series3.add(3.8, 4.2);
	     //series3.add(4.3, 3.8);
	     //series3.add(4.5, 4.0);
	     
	     dataset.addSeries(series1);
	     //dataset.addSeries(series2);
	     
	     return dataset;
	 }
}

