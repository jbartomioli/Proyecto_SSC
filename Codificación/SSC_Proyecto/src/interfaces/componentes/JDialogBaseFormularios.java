package interfaces.componentes;

import interfaces.Ayuda;

import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.KeyStroke;

import controladores.ControladorAyuda;
/**
 * CLASE FORMULARIO BASE PARA UTILIZAR EN EL RESTO
 * @author Javier Bartomioli - Rodrigo Naredo
 *
 */
public class JDialogBaseFormularios extends JDialog
{

	//SERIALIZABLE
	private static final long serialVersionUID = -6057840038900155154L;

	
	
	/**
	 * CONSTRUCTOR
	 */
	public JDialogBaseFormularios()
	{
		
	}
	////////////////////////////////
	
	
	
	/**
	 * CONSTRUCTOR
	 * @param framePadre
	 * @param tituloFormulario
	 * @param nombreIcono
	 * @param esModal
	 */
	public JDialogBaseFormularios(JFrame framePadre, String tituloFormulario, String nombreIcono, boolean esModal)
	{
		super(framePadre);
		seteosGenerales(tituloFormulario, nombreIcono, esModal);
	}
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	
	/**
	 * CONSTRUCTOR
	 * @param framePadre
	 * @param tituloFormulario
	 * @param nombreIcono
	 * @param esModal
	 */
	public JDialogBaseFormularios(JDialog framePadre, String tituloFormulario, String nombreIcono, boolean esModal)
	{
		super(framePadre);
		seteosGenerales(tituloFormulario, nombreIcono, esModal);
	}
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	
	
	/**
	 * SETEOS GENERALES DEL FORMULARIO
	 * @param tituloFormulario
	 * @param nombreIcono
	 * @param esModal
	 */
	public void seteosGenerales(String tituloFormulario, String nombreIcono, boolean esModal)
	{
		setResizable(false);
		setTitle(tituloFormulario);
		setIconImage(UtilidadesGUI.obtenerIcono(UtilidadesGUI.X32,nombreIcono).getImage());
		setModal(esModal);
		setModalityType(ModalityType.DOCUMENT_MODAL);

		setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
		
		getContentPane().setLayout(null);
		
		setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
		
		addEscapeListenerWindowDialog();
		addF1ListenerWindowDialog();
		
		
		addWindowListener(new WindowAdapter() {
    	public void windowClosing(WindowEvent arg0) {
    		cerrar_salir();
    	}
    });
	}
	//////////////////////////////////////////////////////////////////////////////////////////
	
	
	
	/**
	 * SETEO DE TAMANIO DE VENTANA
	 */
	public void setPantallaCompleta()
	{
		setSize(Toolkit.getDefaultToolkit().getScreenSize().width, Toolkit.getDefaultToolkit().getScreenSize().height-50);
	}
	//////////////////////////////////
	
	
	
	/**
	 * SETEO DE TAMANIO DE VENTANA
	 * @param ancho
	 * @param alto
	 */
	public void setDimensionFormulario(int ancho, int alto)
	{
		setMinimumSize(new Dimension(ancho,alto));
		getContentPane().setMinimumSize(new Dimension(ancho,alto));
		getContentPane().setMaximumSize(new Dimension(ancho,alto));
		setMaximumSize(new Dimension(ancho, alto));
		
		setLocationRelativeTo(null);
	}
	////////////////////////////////////////////////////////
	
	
	
	/**
	 * ACCION TECLA ESCAPE
	 */
	protected void addEscapeListenerWindowDialog()
	{
	 ActionListener escAction = new ActionListener() 
	 {
		 @Override
		 public void actionPerformed(ActionEvent e) 
		 {
			 cerrar_salir();
		 }
	 };
	 getRootPane().registerKeyboardAction(escAction, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_IN_FOCUSED_WINDOW);
	}
	///////////////////////////////////////////////
	
	
	
	/**
	 * ACCION TECLA F1
	 */
	protected void addF1ListenerWindowDialog()
	{
	 ActionListener escAction = new ActionListener() 
	 {
		 @Override
		 public void actionPerformed(ActionEvent e) 
		 {
			 Ayuda guiAyuda = new Ayuda();
			 new ControladorAyuda(guiAyuda);
			 guiAyuda.frmAyuda.setVisible(true);	 
		 }
	 };
	 getRootPane().registerKeyboardAction(escAction, KeyStroke.getKeyStroke(KeyEvent.VK_F1, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
	}
	///////////////////////////////////////////
	
	
	
	/**
	 * BOTON AYUDA
	 */
	public void setBotonAyuda(int x, int y)
	{
		BotonesIconos btnAyuda = new BotonesIconos("AYUDA.PNG");
		btnAyuda.setLocation(x, y);
		btnAyuda.setToolTipText("Ayuda");
		btnAyuda.setFocusPainted(false);
		getContentPane().add(btnAyuda);
	
		btnAyuda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				 Ayuda guiAyuda = new Ayuda();
				 new ControladorAyuda(guiAyuda);
				 guiAyuda.frmAyuda.setVisible(true);
			}
		});
	}
	////////////////////////////////////////
	
	
	
	/**
	 * ACCION AL SALIR DEL FORMULARIO
	 * @throws Throwable 
	 */
	protected void cerrar_salir()
	{
		setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
//		finalize();		
		dispose();	
	}
	//////////////////////////////
}
