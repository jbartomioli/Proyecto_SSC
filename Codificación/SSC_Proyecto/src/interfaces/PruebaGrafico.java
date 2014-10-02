/*Clase para probar la funcionalidad de gráficos*/

/*Clase temporal*/

package interfaces;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JPanel;

import org.jfree.chart.*;
import org.jfree.chart.renderer.xy.XYSplineRenderer;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.axis.*;
import org.jfree.data.xy.*;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PruebaGrafico extends JDialog
{	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTable datos;
	
	public PruebaGrafico() 
	{
		
		setTitle("Prueba Gr\u00E1fico");
		getContentPane().setLayout(null);
		this.setLocationRelativeTo(null);
		
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
				ChartPanel panel;
				JFreeChart chart = null;
				
				XYSplineRenderer renderer = new XYSplineRenderer();
				XYSeriesCollection dataSet = new XYSeriesCollection();
				ValueAxis x = new NumberAxis("Fecha venta");
				ValueAxis y = new NumberAxis("Monto venta");
				XYSeries serie = new XYSeries("Datos");
				XYPlot plot;
				
				for(int fila = 0; fila < 6; fila++)
				{
					serie.add(Float.parseFloat(String.valueOf(datos.getValueAt(fila, 0).toString())), Float.parseFloat(String.valueOf(datos.getValueAt(fila, 1).toString())));
				}
				
				dataSet.addSeries(serie);
				
				x.setLabel("Eje X");
				y.setLabel("Eje Y");
				plot = new XYPlot(dataSet, x, y, renderer);
				chart = new JFreeChart(plot);
				chart.setTitle("Gráfico de prueba");
				
				panel = new ChartPanel(chart);
				pnlGrafico.add(panel);
			}
		});
	}
}
