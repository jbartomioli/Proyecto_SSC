package interfaces;
/***************************************
 * INTERFAZ PRINCIPAL DE LA APLICACION
 ***************************************/

import interfaces.componentes.UtilidadesGUI;

import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.Cursor;
import java.awt.Dimension;

import javax.swing.JLabel;

import java.awt.Color;

import javax.swing.SwingConstants;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.KeyStroke;

import negocio.ModeloConfeccionarAnuncio;
import negocio.ModeloModificarPrecios;
import negocio.ModeloRealizarSeguimientoCliente;
import controladores.ControladorAyuda;
import controladores.ControladorConfeccionarAnuncio;
import controladores.ControladorConfiguraciones;
import controladores.ControladorImportarDatos;
import controladores.ControladorModificarPrecios;
import controladores.ControladorRealizarSeguimientoCliente;

import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;



public class Principal extends JFrame {

	//***************************************************************
	//* SERIALIZABLE												*
	//***************************************************************
	private static final long serialVersionUID = 3856238941350632345L;
	

	//***************************************************************
	//* COMPONENTES													*
	//***************************************************************
	private JPanel cntContenedor;
	private JLabel lblImagenfondo;
	private JMenuBar mnuBarraMenu;
	private JMenu mnuArchivo;
	private JMenuItem mntSalir;
	private JMenu mnuOperaciones;
	private JMenuItem mntConfeccionar;
	private JMenuItem mntSeguimiento;
	private JMenuItem mntPrecios;
	private JMenu mnuAyuda;
	private JMenuItem mntContenidoAyuda;
	private JMenuItem mntAcerca;
	private JMenu mnuOpciones;
	private JMenuItem mntImportar;
	private JMenuItem mntConfiguracion;
	private interfaces.Acerca acerca;
	/*******************************
	 * CONSTRUCTOR
	 * @param controladorAnuncios
	 * @throws Exception
	 *******************************/
	public Principal() throws Exception 
	{
		//FORMULARIO BASE
		setIconImage(UtilidadesGUI.getIcon(UtilidadesGUI.X128+"SSC.png").getImage());
		setMinimumSize(new Dimension(800, 600));
		setSize(getToolkit().getScreenSize());
		setTitle("SSC - Sistema de Seguimiento de Clientes");
        setLocationRelativeTo(null);
        setExtendedState(JFrame.MAXIMIZED_BOTH);		
        addEscapeListenerWindowDialog();
		    
        
		//CONTENEDOR
        cntContenedor = new JPanel();
        cntContenedor.setBackground(Color.WHITE);
        cntContenedor.setLayout(null);
		
		
        //IMAGEN DE FONDO
		lblImagenfondo = new JLabel("");
		lblImagenfondo.setHorizontalAlignment(SwingConstants.LEFT);
		lblImagenfondo.setVerticalTextPosition(SwingConstants.BOTTOM);
		lblImagenfondo.setVerticalAlignment(SwingConstants.BOTTOM);
		lblImagenfondo.setBounds(0, 0, 1365, 696);
		cntContenedor.add(lblImagenfondo);
		lblImagenfondo.setIcon(new ImageIcon(utilidades.Configuraciones.IMG_PRESENTACION+"imgFondo.jpg"));

		
		//BARRA DE MENU
		mnuBarraMenu = new JMenuBar();
		setJMenuBar(mnuBarraMenu);
		
		
		
		///////////////////////////////////////////////////////////////////////////////////////////
		//1. MENU ARCHIVO
		mnuArchivo = new JMenu("Archivo");
		mnuArchivo.setMnemonic('A');
		mnuBarraMenu.add(mnuArchivo);

		//ITEMS DEL MENU
			//IMPORTAR DATOS
			mntImportar = new JMenuItem("Importar Datos");
			mntImportar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I, InputEvent.CTRL_MASK));
			mntImportar.setIcon(UtilidadesGUI.getIcon(UtilidadesGUI.X16+"IMPORTAR.png"));
			mntImportar.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent arg0) 
				{
					try
					{
						click_importar_datos();
					}
					catch (Exception e)
					{
						if(e.getClass().getName().equals("com.mysql.jdbc.exceptions.jdbc4.CommunicationsException"))
						{ 
							JOptionPane.showMessageDialog(null, 
									"Se ha producido un error al intentar conectarse a la base de datos."
									+ "\nVerifique la conexi�n al servidor e int�ntelo m�s tarde.",
									"ERROR",
									JOptionPane.ERROR_MESSAGE);
							setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
						}
					}
				}
			});
			mnuArchivo.add(mntImportar);
			
			//SALIR		
			mntSalir = new JMenuItem("Salir...");
			mntSalir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F4, InputEvent.ALT_MASK));
			mntSalir.setIcon(UtilidadesGUI.getIcon(UtilidadesGUI.X16+"SALIR.png"));
			mntSalir.addActionListener(new ActionListener() 
			{
				public void actionPerformed(ActionEvent arg0)
				{
					click_salir();
				}
			});
			mnuArchivo.add(mntSalir);
		///////////////////////////////////////////////////////////////////////////////////////////
		
			
		
		///////////////////////////////////////////////////////////////////////////////////////////
		//2. MENU OPERACIONES
		mnuOperaciones = new JMenu("Operaciones");
		mnuOperaciones.setMnemonic('O');
		mnuBarraMenu.add(mnuOperaciones);	
		
		//ITEMS DEL MENU
			//CONFECCIONAR ANUNCIO
			mntConfeccionar = new JMenuItem("Confeccionar Anuncio");
			mntConfeccionar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) 
				{
					click_generar_anuncio();
				}
			});
			mntConfeccionar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_MASK));
			mntConfeccionar.setIcon(UtilidadesGUI.getIcon(UtilidadesGUI.X16+"CONFECCIONAR.png"));
			mnuOperaciones.add(mntConfeccionar);
		
			//REALIZAR SEGUIMIENTO
			mntSeguimiento = new JMenuItem("Realizar Seguimiento de Cliente");
			mntSeguimiento.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0)
				{
					click_realizar_seguimiento();
				}
			});
			mntSeguimiento.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
			mntSeguimiento.setIcon(UtilidadesGUI.getIcon(UtilidadesGUI.X16+"SEGUIMIENTO.png"));
			mnuOperaciones.add(mntSeguimiento);
			
			//MODIFICAR PRECIOS
			mntPrecios = new JMenuItem("Modificar Precios");
			mntPrecios.setIcon(UtilidadesGUI.getIcon(UtilidadesGUI.X16+"PRECIO.png"));
			mntPrecios.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent arg0) 
				{

					click_modificar_precios();
				}
			});
			mntPrecios.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, InputEvent.CTRL_MASK));
			mnuOperaciones.add(mntPrecios);
		///////////////////////////////////////////////////////////////////////////////////////////
		
			
			
			
		///////////////////////////////////////////////////////////////////////////////////////////
		//3. MENU OPCIONES
		mnuOpciones = new JMenu("Opciones");
		mnuOpciones.setMnemonic('c');
		mnuBarraMenu.add(mnuOpciones);
		
			//ITEM CONFIGURACIONES
			mntConfiguracion = new JMenuItem("Configuraci\u00F3n");
			mntConfiguracion.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_MASK));
			mntConfiguracion.setIcon(UtilidadesGUI.getIcon(UtilidadesGUI.X16+"CONFIGURACION.png"));			
			mntConfiguracion.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent arg0) 
				{
					click_configuraciones();
				}
			});
			
			mnuOpciones.add(mntConfiguracion);
		///////////////////////////////////////////////////////////////////////////////////////////

			
			
		///////////////////////////////////////////////////////////////////////////////////////////
		//4. MENU AYUDA
		mnuAyuda = new JMenu("Ayuda");
		mnuAyuda.setMnemonic('u');	
		mnuBarraMenu.add(mnuAyuda);
		
			//ITEM MANUAL DE USUARIO
			mntContenidoAyuda = new JMenuItem("Manual de Usuario");
			mntContenidoAyuda.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F1, 0));
			
			mntContenidoAyuda.addActionListener(new ActionListener() 
			{
				public void actionPerformed(ActionEvent arg0)
				{
					click_ayuda();
				}
			});
		
			mnuAyuda.add(mntContenidoAyuda);
			mntContenidoAyuda.setIcon(UtilidadesGUI.getIcon(UtilidadesGUI.X16+"AYUDA.png"));
		
			//ACERCA DEL SISTEMA
			mntAcerca = new JMenuItem("Acerca de SSC");
			mntAcerca.setIcon(UtilidadesGUI.getIcon(UtilidadesGUI.X16+"ACERCA.png"));			
			mntAcerca.addActionListener(new ActionListener() 
			{
				public void actionPerformed(ActionEvent arg0) 
				{
					click_acerca();
				}
			});
			mntAcerca.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F1, InputEvent.ALT_MASK));	
			mnuAyuda.add(mntAcerca);
		///////////////////////////////////////////////////////////////////////////////////////////

			
		setContentPane(cntContenedor);
		
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setVisible(true);
		
		addWindowListener(new WindowAdapter() 
		{
            @Override
            public void windowClosing(WindowEvent evt)
            {
            	click_salir();            	
            }
        });
	}
	

	
	
	
	//***************************************************************
	//* EVENTOS														*
	//***************************************************************
	
	protected void addEscapeListenerWindowDialog() 
	{
	 ActionListener escAction = new ActionListener() 
	 {
		 @Override
		 public void actionPerformed(ActionEvent e) 
		 {
			 click_salir();
		 }
	 };
	 getRootPane().registerKeyboardAction(escAction, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_IN_FOCUSED_WINDOW);
	}
	
	
	/**
	 * PANTALLA IMPORTAR DATOS
	 * @throws Exception 
	 */
	protected void click_importar_datos() throws Exception
	{
		setCursor(new Cursor(Cursor.WAIT_CURSOR));
		
		ImportarDatos guiImportarDatos = new ImportarDatos(this);
		new ControladorImportarDatos(guiImportarDatos);

		setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
	}
	
	
	
	/**
	 * CERRAR SISTEMA
	 */
	protected void click_salir()
	{
		int rta;
		rta = JOptionPane.showConfirmDialog(null, 
				"Esta a punto de salir de la aplicaci�n:\n�Realmente desea salir de la misma?",
				"ATENCI�N",
				JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE, 
				UtilidadesGUI.getIcon(UtilidadesGUI.X32+"SALIR.png"));
		if(rta==JOptionPane.YES_OPTION)
			System.exit(0);
	}
	
	
	
	/**
	 * PANTALLA GENERACION ANUNCIO
	 * @throws Exception 
	 */
	protected void click_generar_anuncio()
	{
		setCursor(new Cursor(Cursor.WAIT_CURSOR));
		
		GenerarAnuncio guiGenerarAnuncio = new GenerarAnuncio(this, true);
		ModeloConfeccionarAnuncio modeloConfeccionarAnuncio = new ModeloConfeccionarAnuncio();
		
		new ControladorConfeccionarAnuncio(modeloConfeccionarAnuncio, guiGenerarAnuncio);
				
		setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
	}
	
	
	
	/**
	 * REALIZAR SEGUIMIENTO DE CLIENTES
	 * @throws Exception
	 */
	protected void click_realizar_seguimiento()
	{
		setCursor(new Cursor(Cursor.WAIT_CURSOR));
			
		SeguimientoDeClientes guiSeguimiento = new SeguimientoDeClientes(this);
		ModeloRealizarSeguimientoCliente modeloSeguimiento = new ModeloRealizarSeguimientoCliente();
		
		new ControladorRealizarSeguimientoCliente(guiSeguimiento, modeloSeguimiento);
		
		setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
	}
	
	
	
	/**
	 * MODIFICAR PRECIOS
	 * @throws Exception 
	 * 
	 */
	protected void click_modificar_precios()
	{
		setCursor(new Cursor(Cursor.WAIT_CURSOR));
		
		ModificarPrecios guiModificarPrecios = new ModificarPrecios(this);
		ModeloModificarPrecios modeloModificarPrecios = new ModeloModificarPrecios();
	
		new ControladorModificarPrecios(guiModificarPrecios, modeloModificarPrecios);

		setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
	}
	
	
	
	/**
	 * CONFIGURACIONES
	 */
	protected void click_configuraciones()
	{
		setCursor(new Cursor(Cursor.WAIT_CURSOR));
		
		Configuraciones guiConfiguraciones = new Configuraciones(this);
		
		new ControladorConfiguraciones(guiConfiguraciones);
				
		setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
	}
	
	
	
	/**
	 * AYUDA DEL SISTEMA
	 */
	protected void click_ayuda()
	{
		setCursor(new Cursor(Cursor.WAIT_CURSOR));
		Ayuda guiAyuda = new Ayuda();
		
		new ControladorAyuda(guiAyuda);
		
		guiAyuda.frmAyuda.setVisible(true);	
		
		setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
	}
	
	
	
	
	/**
	 * ACERCA DEL SISTEMA
	 */
	protected void click_acerca()
	{
		setCursor(new Cursor(Cursor.WAIT_CURSOR));
		acerca = new interfaces.Acerca(this, true);
		acerca.setVisible(true);		
		setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
	}
}
