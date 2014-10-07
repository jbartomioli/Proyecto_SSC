/*Clase para probar la funcionalidad de gráficos*/
/*Clase temporal*/

package GráficoPrueba;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JPanel;

import org.jfree.chart.*;
import org.jfree.chart.renderer.xy.XYSplineRenderer;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.axis.*;
import org.jfree.data.xy.*;

import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class PruebaGrafico extends JDialog {

	private JPanel contentPane;
	private JTable datos;

	
	public PruebaGrafico() 
	{
		
		setTitle("Prueba Gr\u00E1fico");
		getContentPane().setLayout(null);
		this.setLocationRelativeTo(null);
		setResizable(false);
		setMinimumSize(new Dimension(1024, 668));
		getContentPane().setMinimumSize(new Dimension(1024, 668));
		getContentPane().setMaximumSize(new Dimension(1366, 668));
		setMaximumSize(new Dimension(1366, 768));
		
		datos = new JTable();
		datos.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
			},
			new String[] {
				"X", "Y"
			}
		));
		datos.setBounds(38, 33, 230, 80);
		getContentPane().add(datos);
		
		final JPanel pnlGrafico = new JPanel();
		pnlGrafico.setBounds(278, 33, 502, 314);
		getContentPane().add(pnlGrafico);
		
		JButton btnGenerar = new JButton("Generar");
		btnGenerar.setBounds(38, 160, 89, 23);
		getContentPane().add(btnGenerar);
				
		btnGenerar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				JOptionPane.showMessageDialog(null, "Entra al action performed");
				
				ChartPanel panel;
				JFreeChart chart = null;
				
				XYSplineRenderer renderer = new XYSplineRenderer();
				XYSeriesCollection dataSet = new XYSeriesCollection();
				ValueAxis x = new NumberAxis("Fecha venta");
				ValueAxis y = new NumberAxis("Monto venta");
				XYPlot plot;
				XYSeries serie = new XYSeries("Datos");
				
				JOptionPane.showMessageDialog(null, "Pasa inicialización");
				
				/*
				try
				{
					for(int i = 0; i < 6; i++)
					{
						serie.add(Float.parseFloat(String.valueOf(datos.getValueAt(i, 0).toString())), Float.parseFloat(String.valueOf(datos.getValueAt(i, 1).toString())));
					}
				}
				catch(Exception ex)
				{
					int validar =0;
				}
				
				dataSet.addSeries(serie);
				
				x.setLabel("Eje X");
				y.setLabel("Eje Y");
				plot = new XYPlot(dataSet, x, y, renderer);
				chart = new JFreeChart(plot);
				chart.setTitle("Gráfico de prueba");
				
				panel = new ChartPanel(chart);
				pnlGrafico.add(panel); */
			}
		});
	}

}
