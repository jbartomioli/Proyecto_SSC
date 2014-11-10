package interfaces;
/***************************************
 * INTERFAZ PRINCIPAL DE LA APLICACION
 ***************************************/

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

import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.KeyStroke;

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
	private interfaces.GenerarAnuncio generarAnuncio;
	private interfaces.ModificarPrecios modificarPrecios;
	private interfaces.Configuraciones configuraciones;
	private interfaces.SeguimientoDeClientes seguimientoClientes;
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
	private interfaces.Ayuda ayuda;
	private interfaces.ImportarDatos importarDatos;
	

	/*******************************
	 * CONSTRUCTOR
	 * @param controladorAnuncios
	 * @throws Exception
	 *******************************/
	public Principal() throws Exception 
	{
		//FORMULARIO BASE
		setIconImage(Toolkit.getDefaultToolkit().getImage(utilidades.Configuraciones.IMG_ICONOS+"SSC_128.png"));
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
			mntImportar.setIcon(new ImageIcon(utilidades.Configuraciones.IMG_ICONOS+"IMPORTAR_16.png"));
			mntImportar.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent arg0) 
				{
					click_importar_datos();
				}
			});
			mnuArchivo.add(mntImportar);
			
			//SALIR		
			mntSalir = new JMenuItem("Salir...");
			mntSalir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F4, InputEvent.ALT_MASK));
			mntSalir.setIcon(new ImageIcon(utilidades.Configuraciones.IMG_ICONOS+"SALIR_16.png"));
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
					try
					{
						click_generar_anuncio();
					} 
					catch(Exception e)
					{						
						if (e.getClass().getName().equals("java.lang.NullPointerException"))
						{
							JOptionPane.showMessageDialog(null, 
									"No existen datos almacenados en la Base de Datos. Debe importar el contenido desde el importador de datos\n"
									+ "en Menú Archivo.",
									"ATENCIÓN",
									JOptionPane.INFORMATION_MESSAGE);
							setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
						}
						if(e.getClass().getName().equals("org.hibernate.exception.JDBCConnectionException"))
						{
							JOptionPane.showMessageDialog(null, 
								"Se ha producido un error al intentar conectarse a la base de datos."
								+ "\nVerifique la conexión al servidor e inténtelo más tarde.",
								"ERROR",
								JOptionPane.ERROR_MESSAGE);
							setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
						}
					}
				}
			});
			mntConfeccionar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_MASK));
			mntConfeccionar.setIcon(new ImageIcon(utilidades.Configuraciones.IMG_ICONOS+"CONFECCIONAR_16.png"));
			mnuOperaciones.add(mntConfeccionar);
		
			//REALIZAR SEGUIMIENTO
			mntSeguimiento = new JMenuItem("Realizar Seguimiento de Cliente");
			mntSeguimiento.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0)
				{
					try 
					{
						click_realizar_seguimiento();
					} 
					catch (Exception e)
					{
						if (e.getClass().getName().equals("java.lang.NullPointerException"))
						{
							JOptionPane.showMessageDialog(null, 
									"No existen datos almacenados en la Base de Datos. Debe importar el contenido desde el importador de datos\n"
									+ "en Menú Archivo.",
									"ATENCIÓN",
									JOptionPane.INFORMATION_MESSAGE);
							setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
						}
						if(e.getClass().getName().equals("org.hibernate.exception.JDBCConnectionException"))
						{
							JOptionPane.showMessageDialog(null, 
								"Se ha producido un error al intentar conectarse a la base de datos."
								+ "\nVerifique la conexión al servidor e inténtelo más tarde.",
								"ERROR",
								JOptionPane.ERROR_MESSAGE);
							setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
						}
					}
				}
			});
			mntSeguimiento.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
			mntSeguimiento.setIcon(new ImageIcon(utilidades.Configuraciones.IMG_ICONOS+"SEGUIMIENTO_16.png"));
			mnuOperaciones.add(mntSeguimiento);
			
			//MODIFICAR PRECIOS
			mntPrecios = new JMenuItem("Modificar Precios");
			mntPrecios.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent arg0) 
				{
					try
					{
						click_modificar_precios();
					}
					catch (Exception e) 
					{
						if (e.getClass().getName().equals("java.lang.NullPointerException"))
						{
							JOptionPane.showMessageDialog(null, 
									"No existen datos almacenados en la Base de Datos. Debe importar el contenido desde el importador de datos\n"
									+ "en Menú Archivo.",
									"ATENCIÓN",
									JOptionPane.INFORMATION_MESSAGE);
							setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
						}
						if(e.getClass().getName().equals("org.hibernate.exception.JDBCConnectionException"))
						{
							JOptionPane.showMessageDialog(null, 
								"Se ha producido un error al intentar conectarse a la base de datos."
								+ "\nVerifique la conexión al servidor e inténtelo más tarde.",
								"ERROR",
								JOptionPane.ERROR_MESSAGE);
							setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
						}
					}
				}
			});
			mntPrecios.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, InputEvent.CTRL_MASK));
			mntPrecios.setIcon(new ImageIcon(utilidades.Configuraciones.IMG_ICONOS+"PRECIO_16.png"));
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
			mntConfiguracion.setIcon(new ImageIcon(utilidades.Configuraciones.IMG_ICONOS+"CONFIGURACION_16.png"));
		
			configuraciones = new interfaces.Configuraciones(this);
			
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
			mntContenidoAyuda.setIcon(new ImageIcon(utilidades.Configuraciones.IMG_ICONOS+"AYUDA_16.png"));
		
			//ACERCA DEL SISTEMA
			mntAcerca = new JMenuItem("Acerca de SSC");
			mntAcerca.setIcon(new ImageIcon(utilidades.Configuraciones.IMG_ICONOS+"ACERCA_16.png"));			
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
	 */
	protected void click_importar_datos()
	{
		importarDatos = new interfaces.ImportarDatos(this);
		importarDatos.setVisible(true);
	}
	
	
	
	/**
	 * CERRAR SISTEMA
	 */
	protected void click_salir()
	{
		int rta;
		rta = JOptionPane.showConfirmDialog(null, 
				"Esta a punto de salir de la aplicación:\n¿Realmente desea salir de la misma?",
				"ATENCIÓN",
				JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE, 
				new ImageIcon(utilidades.Configuraciones.IMG_ICONOS+"SALIR_32.png"));
		if(rta==JOptionPane.YES_OPTION)
			System.exit(0);
	}
	
	
	
	/**
	 * PANTALLA GENERACIO ANUNCIO
	 * @throws Exception 
	 */
	protected void click_generar_anuncio() throws Exception
	{
		setCursor(new Cursor(Cursor.WAIT_CURSOR));
		generarAnuncio = new interfaces.GenerarAnuncio(this, true);
		generarAnuncio.actualizar();
		generarAnuncio.setVisible(true);
		setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
	}
	
	
	
	/**
	 * REALIZAR SEGUIMIENTO DE CLIENTES
	 * @throws Exception
	 */
	protected void click_realizar_seguimiento() throws Exception
	{
		seguimientoClientes = new interfaces.SeguimientoDeClientes(this);
		seguimientoClientes.setVisible(true);		
	}
	
	
	
	/**
	 * MODIFICAR PRECIOS
	 * @throws Exception 
	 * 
	 */
	protected void click_modificar_precios() throws Exception
	{
		modificarPrecios = new interfaces.ModificarPrecios(this);
		modificarPrecios.setVisible(true);
		modificarPrecios.inicializar_componentes();
	}
	
	
	
	/**
	 * CONFIGURACIONES
	 */
	protected void click_configuraciones()
	{
		configuraciones.setVisible(true);
	}
	
	
	
	/**
	 * AYUDA DEL SISTEMA
	 */
	protected void click_ayuda()
	{
		ayuda = new interfaces.Ayuda();
		ayuda.cargarHTML();
		ayuda.setVisible(true);		
	}
	
	
	
	
	/**
	 * ACERCA DEL SISTEMA
	 */
	protected void click_acerca()
	{
		acerca = new interfaces.Acerca(this, true);
		acerca.setVisible(true);		
	}
}
