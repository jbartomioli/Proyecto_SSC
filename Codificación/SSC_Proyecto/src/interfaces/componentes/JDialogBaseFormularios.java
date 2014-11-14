package interfaces.componentes;

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

public class JDialogBaseFormularios extends JDialog
{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6057840038900155154L;

	public JDialogBaseFormularios()
	{
		
	}
	
	
	
	public JDialogBaseFormularios(JFrame framePadre, String tituloFormulario, String nombreIcono, boolean esModal)
	{
		super(framePadre);
		seteosGenerales(tituloFormulario, nombreIcono, esModal);
	}
	
	
	public JDialogBaseFormularios(JDialog framePadre, String tituloFormulario, String nombreIcono, boolean esModal)
	{
		super(framePadre);
		seteosGenerales(tituloFormulario, nombreIcono, esModal);
	}
	

	
	
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
	
	
	/**
	 * SETEO DE TAMANIO DE VENTANA
	 */
	public void setPantallaCompleta()
	{
		setSize(Toolkit.getDefaultToolkit().getScreenSize().width, Toolkit.getDefaultToolkit().getScreenSize().height-50);
	}
	
	
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
	
	
	/**
	 * 
	 */
	protected void addF1ListenerWindowDialog() 
	{
	 ActionListener escAction = new ActionListener() 
	 {
		 @Override
		 public void actionPerformed(ActionEvent e) 
		 {
			 interfaces.Ayuda ayuda = new interfaces.Ayuda();
			 ayuda.cargarHTML();
			 ayuda.setVisible(true);
			 
		 }
	 };
	 getRootPane().registerKeyboardAction(escAction, KeyStroke.getKeyStroke(KeyEvent.VK_F1, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
	}
	
	
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
			public void actionPerformed(ActionEvent arg0) {
				interfaces.Ayuda ayuda = new interfaces.Ayuda();
				ayuda.cargarHTML();
				ayuda.setVisible(true);
			}
		});
	}
	
	
	
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

}
