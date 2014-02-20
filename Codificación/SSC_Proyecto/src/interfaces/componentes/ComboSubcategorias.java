package interfaces.componentes;

import java.util.Collection;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

public class ComboSubcategorias extends JComboBox<negocio.SubCategoria> 
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5584165282006221671L;

	private DefaultComboBoxModel<negocio.SubCategoria> modeloCombo;
	
	
	public ComboSubcategorias()
	{
		
	}
	
	
	public void completarDatos(Collection<negocio.SubCategoria> subcategorias)
	{		
		if(modeloCombo != null)
			modeloCombo.removeAllElements();
		
		modeloCombo = new DefaultComboBoxModel<negocio.SubCategoria>();
		
		for(negocio.SubCategoria subcategoriaNegocio : subcategorias)
		{
			modeloCombo.addElement(subcategoriaNegocio);
		}
		
		setModel(modeloCombo);
	}
}
