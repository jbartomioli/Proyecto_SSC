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

	public ComboCategorias(Collection<negocio.Categoria> categorias)
	{		
		DefaultComboBoxModel<negocio.Categoria> modeloCombo = new DefaultComboBoxModel<negocio.Categoria>();
		
		for(negocio.Categoria categoriaNegocio : categorias)
		{
			modeloCombo.addElement(categoriaNegocio);
		}
		
		setModel(modeloCombo);
	}

}
