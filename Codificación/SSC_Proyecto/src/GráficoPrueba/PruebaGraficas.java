/*Clase para probar la funcionalidad de gráficos*/
/*Clase temporal*/

package GráficoPrueba;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;

import org.jfree.chart.*;
import org.jfree.chart.renderer.xy.XYSplineRenderer;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.axis.*;
import org.jfree.data.xy.*;

import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JLayeredPane;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class PruebaGraficas extends JFrame 
{
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JTable datos;
	private JLabel lblTipoDeGrfico;
	private JRadioButton radioLinea;
	private JRadioButton radioBarras;
	private JButton btnGenerar;
	private JLayeredPane capas = null;
	private JPanel lineas = null;
	private JPanel barras = null;

	public PruebaGraficas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 778, 376);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);		
		
		lblTipoDeGrfico = new JLabel("Tipo de Gr\u00E1fico:");
		lblTipoDeGrfico.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTipoDeGrfico.setBounds(10, 11, 104, 23);
		contentPane.add(lblTipoDeGrfico);
		
		radioLinea = new JRadioButton("Lineas");
		radioLinea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lineas.setVisible(true);
				capas.setLayer(lineas, 0, 0);
				radioBarras.setSelected(false);
			}
		});
		radioLinea.setFont(new Font("Tahoma", Font.BOLD, 11));
		radioLinea.setBounds(10, 51, 66, 23);
		contentPane.add(radioLinea);
		
		radioBarras = new JRadioButton("Barras");
		radioBarras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				barras.setVisible(true);
				capas.setLayer(barras, 0, 0);
				radioLinea.setSelected(false);
			}
		});
		radioBarras.setFont(new Font("Tahoma", Font.BOLD, 11));
		radioBarras.setBounds(88, 51, 72, 23);
		contentPane.add(radioBarras);
		
		datos = new JTable();
		datos.setToolTipText("");
		datos.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
				{null, null},
				{null, null},
				{null, null},
			},
			new String[] {
				"Y", "X"
			}
		));
		datos.setBounds(10, 92, 208, 64);
		contentPane.add(datos);
		
		btnGenerar = new JButton("Generar");
		btnGenerar.setBounds(10, 185, 89, 23);
		contentPane.add(btnGenerar);
		
		capas = new JLayeredPane();
		capas.setBorder(new LineBorder(new Color(0, 0, 0)));
		capas.setBounds(292, 11, 460, 316);
		contentPane.add(capas);
		capas.setLayout(null);
		
		lineas = new JPanel();
		lineas.setBounds(10, 11, 440, 294);
		capas.add(lineas);
		lineas.setVisible(false);
		
		barras = new JPanel();
		barras.setBounds(10, 11, 440, 294);
		capas.add(barras);
		barras.setVisible(false);
		
		setTitle("Gráficas");
		
		btnGenerar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{				
				//JOptionPane.showMessageDialog(null, "Entra al action performed");
				ChartPanel panel;
				JFreeChart chart = null;
				
				if(radioLinea.isSelected())
				{	/*				
					XYSplineRenderer renderer = new XYSplineRenderer();
					XYSeriesCollection dataSet = new XYSeriesCollection();
					ValueAxis x = new NumberAxis("Fecha venta");
					ValueAxis y = new NumberAxis("Monto venta");
					XYSeries serie = new XYSeries("Datos");
					XYPlot plot;
					
					lineas.removeAll();
					
					//JOptionPane.showMessageDialog(null, "Pasa inicialización");
					
					for(int i = 0; i < 6; i++)
					{
						serie.add(Float.parseFloat(String.valueOf(datos.getValueAt(i, 0).toString())), Float.parseFloat(String.valueOf(datos.getValueAt(i, 1).toString())));
					}
					
					dataSet.addSeries(serie);
					
					x.setLabel("Eje X");
					y.setLabel("Eje Y");
					plot = new XYPlot(dataSet, x, y, renderer);
					chart = new JFreeChart(plot);
					chart.setTitle("Gráfico de Líneas");*/
				}
				else
				{/*
					DefaultCategoryDataset data = new DefaultCategoryDataset();
					
					String prod1 = "Sopas";
					String prod2 = "Sodas";
					
					String dia1 = "Día 1";
					String dia2 = "Día 2";
					String dia3 = "Día 3";
					String dia4 = "Día 4";
					
					data.addValue(18, prod1, dia1);
					data.addValue(15, prod1, dia2);
					data.addValue(23, prod1, dia3);
					data.addValue(8, prod1, dia4);
					
					data.addValue(30, prod2, dia1);
					data.addValue(39, prod2, dia2);
					data.addValue(24, prod2, dia3);
					data.addValue(32, prod2, dia4);
					
					chart = ChartFactory.createBarChart("Gráfico de Barras", "Día", "Cantidad", data, PlotOrientation.HORIZONTAL, true, true, true);
					
					CategoryPlot plot = (CategoryPlot) chart.getPlot();
					plot.setDomainGridlinesVisible(true);*/
				}
				
				panel = new ChartPanel(chart);
				
				if(radioLinea.isSelected())
				{
					lineas.add(panel);
					lineas.repaint();
				}
				else
				{
					barras.add(panel);
					barras.repaint();
				}
			}
		});
	}
}
