package interfaces.componentes;

import java.util.Collection;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

public class ComboCategorias extends JComboBox<negocio.Categoria>
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2776846341907269710L;
	private DefaultComboBoxModel<negocio.Categoria> modeloCombo; 
	
	
	public ComboCategorias()
	{
		
	}
	
	public void completarDatos(Collection<negocio.Categoria> categorias)
	{		
		
		if(modeloCombo != null)
			modeloCombo.removeAllElements();
		
		modeloCombo = new DefaultComboBoxModel<negocio.Categoria>();
		
		for(negocio.Categoria categoriaNegocio : categorias)
		{
			modeloCombo.addElement(categoriaNegocio);
		}
		
		setModel(modeloCombo);
	}

}
