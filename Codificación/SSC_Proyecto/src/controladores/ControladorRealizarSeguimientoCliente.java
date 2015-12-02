//CLASE LISTA

package controladores;

import interfaces.SeguimientoDeClientes;

import java.awt.BorderLayout;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.swing.table.DefaultTableModel;

import negocio.ModeloRealizarSeguimientoCliente;
import negocio.Venta;




//INICIO IMPORTS PARA GRAFICAR
import org.jfree.chart.*;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.time.Day;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;
import org.jfree.data.xy.*;
//FIN IMPORTS PARA GRAFICAR

/**
 * CONTROLADOR SEGUIMIENTO DE CLIENTES
 * 
 * @author Javier Bartomioli- Rodrigo Naredo
 *
 */
public class ControladorRealizarSeguimientoCliente implements ActionListener, MouseListener, WindowListener, ItemListener, KeyListener
{
	//ATRIBUTOS
	private ModeloRealizarSeguimientoCliente modeloSeguimiento;
	private SeguimientoDeClientes guiSeguimiento;
	
	

	/**
	 * CONSTRUCTOR
	 * @param modeloSeguimiento
	 * @param guiSeguimiento
	 * @throws Exception 
	 */
	public ControladorRealizarSeguimientoCliente(SeguimientoDeClientes guiSeguimiento, ModeloRealizarSeguimientoCliente modeloSeguimiento) throws Exception
	{
		this.modeloSeguimiento = modeloSeguimiento;
		this.guiSeguimiento = guiSeguimiento;
		
		this.guiSeguimiento.btnAceptar.addActionListener(this);
		this.guiSeguimiento.btnBuscarCliente.addActionListener(this);
		this.guiSeguimiento.txtBuscarCliente.addMouseListener(this);
		this.guiSeguimiento.txtBuscarCliente.addKeyListener(this);
		this.guiSeguimiento.cmbEspecialidad.addItemListener(this);
		this.guiSeguimiento.tblClientesBuscados.addMouseListener(this);
		this.guiSeguimiento.frmSeguimiento.addWindowListener(this);
		
		this.modeloSeguimiento.inicializarCatalogos();
	}
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	

	
	/**
	 * REESCRITURA WINDOWS LISTENERS
	 */
	@Override
	public void windowActivated(WindowEvent evento)
	{		
	}

	@Override
	public void windowClosed(WindowEvent evento)
	{
		if(evento.getSource().equals(guiSeguimiento.frmSeguimiento))
		{
			cerrar_salir();
		}
	}

	@Override
	public void windowClosing(WindowEvent evento)
	{		
	}

	@Override
	public void windowDeactivated(WindowEvent evento)
	{
	}

	@Override
	public void windowDeiconified(WindowEvent evento)
	{		
	}

	@Override
	public void windowIconified(WindowEvent evento)
	{		
	}

	@Override
	public void windowOpened(WindowEvent evento)
	{
	}
	/////////////////////////////////////////////


	
	/**
	 * REESCRITURA MOUSELISTENERS
	 */
	@Override
	public void mouseClicked(MouseEvent evento)
	{
		if(evento.getSource().equals(guiSeguimiento.txtBuscarCliente))
		{
			guiSeguimiento.txtBuscarCliente.setText("");
			guiSeguimiento.txtBuscarCliente.setForeground(SystemColor.black);
		}
		
		if(evento.getSource().equals(guiSeguimiento.tblClientesBuscados))
		{
			if(guiSeguimiento.tblClientesBuscados.columnAtPoint(evento.getPoint())==4)
			{
				try
				{
					click_seleccionar_cliente();
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		}
	}

	@Override
	public void mouseEntered(MouseEvent evento)
	{
	}

	@Override
	public void mouseExited(MouseEvent evento)
	{		
	}

	@Override
	public void mousePressed(MouseEvent evento)
	{		
	}

	@Override
	public void mouseReleased(MouseEvent evento)
	{
	}
	/////////////////////////////////////////////
	
	
	
	/**
	 * REESCRITURA ACTION PERFORMED
	 */
	@Override
	public void actionPerformed(ActionEvent evento)
	{
		if(evento.getSource().equals(guiSeguimiento.btnAceptar))
		{
			click_boton_aceptar();
		}
		
		if(evento.getSource().equals(guiSeguimiento.btnBuscarCliente))
		{
			buscar_cliente(modeloSeguimiento);
		}
	}
	////////////////////////////////////////////////
	
	
	
	/**
	 * REESCRITURA ITEMLISTENERS
	 */
	@Override
	public void itemStateChanged(ItemEvent evento)
	{
		if(evento.getSource().equals(guiSeguimiento.cmbEspecialidad))
		{
			click_combo_especialidad(modeloSeguimiento, evento);
		}
	}
	///////////////////////////////////////////////

		
	
	/**
	 * REESCRITURA KEYLISTENERS	
	 */
	@Override
	public void keyPressed(KeyEvent evento)
	{
		if(evento.getSource().equals(guiSeguimiento.txtBuscarCliente))
		{
			if(evento.getKeyCode() == KeyEvent.VK_ENTER)
			{
				buscar_cliente(modeloSeguimiento);
			}
		}
	}

	@Override
	public void keyReleased(KeyEvent e)
	{
	}

	@Override
	public void keyTyped(KeyEvent e)
	{
	}
	/////////////////////////////////
	
	
	
	/**
	 * CIERRA LA PANTALLA
	 */
	protected void cerrar_salir()
	{			
		guiSeguimiento.frmSeguimiento.dispose();
	}
	//////////////////////////////
		
		
		
	/**
	 * COMPLETA LA TABLA EN BASE A LA ESPECIALIDAD SELECCIONADA
	 * @param modeloSeguimiento
	 * @param evento
	 */
	protected void click_combo_especialidad(ModeloRealizarSeguimientoCliente modeloSeguimiento, ItemEvent evento)
	{		
		if(evento.getStateChange() == ItemEvent.SELECTED)
		{			
			Object esp = guiSeguimiento.cmbEspecialidad.getSelectedItem();
			String especialidad = String.valueOf(esp);
					
			guiSeguimiento.tblClientesBuscados.completarTabla(
					modeloSeguimiento.getCatalogoClientes().buscarClientesPorEspecialidad(especialidad));
			
			guiSeguimiento.tblClientesBuscados.definirTablaDestinatariosBuscados();
		}
	}
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	
	/**
	 * BUSCA EL CLIENTE INGRESADO POR SU DESCRIPCION PARCIAL
	 * @param modeloSeguimiento
	 */
	protected void buscar_cliente(ModeloRealizarSeguimientoCliente modeloSeguimiento)
	{
		guiSeguimiento.tblClientesBuscados.completarTabla(
				modeloSeguimiento.buscarCliente(guiSeguimiento.txtBuscarCliente.getText()));
		guiSeguimiento.tblClientesBuscados.definirTablaDestinatariosBuscados();
	}
	////////////////////////////////////////////////////////////////////////////////////////////
	
	
	
//	/**
//	 * BUSCA EL 
//	 * @param modeloSeguimiento
//	 */
//	protected void buscar_cliente_boton(ModeloRealizarSeguimientoCliente modeloSeguimiento)
//	{
//		guiSeguimiento.tblClientesBuscados.completarTabla(
//				modeloSeguimiento.buscarCliente(guiSeguimiento.txtBuscarCliente.getText()));
//		guiSeguimiento.tblClientesBuscados.definirTablaDestinatariosBuscados();
//	}
//	////////////////////////////////////////////////////////////////////////////////////////
	
	
	
	/**
	 * ACCION BOTON ACEPTAR
	 */
	protected void click_boton_aceptar()
	{				
		guiSeguimiento.frmSeguimiento.dispose();
	}
	/////////////////////////////////////
	
	
	
	/**
	 * MUESTRA LOS DATOS DEL CLIENTE Y DE SUS COMPRAS
	 * SEGUN LA SELECCION DEL MISMO
	 * @throws Exception
	 */
	@SuppressWarnings("rawtypes")
	protected void click_seleccionar_cliente() throws Exception
	{
		int idClienteSeleccionado = 0;
		Date fechaActual;
		Date fechaMaxCompra;
		long diference;
		long days;
		
		DefaultTableModel modeloClientesBuscados = (DefaultTableModel) guiSeguimiento.tblClientesBuscados.getModel();
		
		int filaSeleccionada = guiSeguimiento.tblClientesBuscados.getSelectedRow();
		java.util.Vector fila;
		fila = (java.util.Vector) modeloClientesBuscados.getDataVector().elementAt(filaSeleccionada);
		  
	    if(filaSeleccionada >= 0)
		{
	    	int idCliente = Integer.parseInt(fila.elementAt(0).toString());
	    	
	    	if(idCliente != idClienteSeleccionado)
	    	{
	    		negocio.Cliente cliente = this.modeloSeguimiento.buscarCliente(idCliente);
		    	
		    	cliente.obtenerVentas();
		    	
		    	fechaActual = new Date();
		    	fechaMaxCompra = new Date();
		    	
		    	DateFormat outputFormatter = new SimpleDateFormat("dd/MM/yyyy");
	    		
		    	try
		    	{
					fechaMaxCompra = outputFormatter.parse(cliente.obtenerMaxFechaVenta());
				}
		    	catch (ParseException e)
				{
					e.printStackTrace();
				}
	    		
	    		diference = fechaActual.getTime() - fechaMaxCompra.getTime();
	    		
	    		days = diference / (24 * 60 * 60 * 1000);
		    	
	    		guiSeguimiento.txtApNomSelec.setText(cliente.getApellido() + ", " + cliente.getNombre());
	    		guiSeguimiento.txtEspecSelec.setText(cliente.getEspecialidad());
	    		guiSeguimiento.txtMailSelec.setText(cliente.getEmail());
	    		guiSeguimiento.txtDirSelec.setText(cliente.getDireccion());
	    		guiSeguimiento.txtTelSelec.setText(cliente.getTelefono());
	    		guiSeguimiento.txtTotVtasSelec.setText(String.valueOf(DecimalFormat.getCurrencyInstance().format(cliente.obtenerTotalVentas())));
				
				
				// INICIO GRAFICO DE LINEAS //
				String chartTitle = "Ventas por día";
				String xAxisLabel = "Fecha";
				String yAxisLabel = "Monto de Ventas ($)";
				double saltoYAxis = 5000.00;
				 
				XYDataset dataset = createDataset(cliente);
				 
				JFreeChart chart = ChartFactory.createTimeSeriesChart(chartTitle, xAxisLabel, yAxisLabel, dataset, true, true, false);
				XYPlot xyPlot = chart.getXYPlot();
				ValueAxis yAxis = xyPlot.getRangeAxis();
				yAxis.setRange(0.00, cliente.obtenerVentaMaxima() + saltoYAxis);

				ChartPanel chartPanel = new ChartPanel(chart);
				 
				guiSeguimiento.pnlGrafico.removeAll();
				guiSeguimiento.pnlGrafico.setVisible(true);
				guiSeguimiento.pnlGrafico.add(chartPanel, BorderLayout.CENTER);
				// FIN GRAFICO DE LINEAS //		
				
				guiSeguimiento.lblInfo.setText("La última compra del cliente ha sido el: " + cliente.obtenerMaxFechaVenta() + ".");
				
				if(days > 90)
				{
					guiSeguimiento.lblWarning.setText("El cliente lleva más de 3 (tres) meses sin realizar una compra.");
					guiSeguimiento.lblWarning.setVisible(true);
					guiSeguimiento.lblInfo.setVisible(false);
				}
				else
				{
					guiSeguimiento.lblWarning.setText("");
					guiSeguimiento.lblWarning.setVisible(false);
					guiSeguimiento.lblInfo.setVisible(true);
				}
				
				idClienteSeleccionado = idCliente;
	    	}
			 
		}
	}
	////////////////////////////////////////////////////////////		
	
	
	
	/**
	 * 
	 * @param cliente
	 * @return
	 */
	protected XYDataset createDataset(negocio.Cliente cliente)
	{
		TimeSeriesCollection dataset = new TimeSeriesCollection();
	    TimeSeries serie2 = new TimeSeries("Ventas por día");
	    
	    Collection<Venta> ventasCliente = new ArrayList<Venta>();
	   
	    ventasCliente = cliente.getVentas();
	    
	    for(Venta ventaCliente : ventasCliente)
	    {
	    	serie2.addOrUpdate(new Day(ventaCliente.getFechaVenta()), ventaCliente.getTotal());
	    }
	     
	    dataset.addSeries(serie2);
	     
	    return dataset;
	}
	///////////////////////////////////////////////////////////
}
