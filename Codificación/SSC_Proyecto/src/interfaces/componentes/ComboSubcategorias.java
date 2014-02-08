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

	public ComboSubcategorias(Collection<negocio.SubCategoria> subcategorias)
	{		
		DefaultComboBoxModel<negocio.SubCategoria> modeloCombo = new DefaultComboBoxModel<negocio.SubCategoria>();
		
		for(negocio.SubCategoria subcategoriaNegocio : subcategorias)
		{
			modeloCombo.addElement(subcategoriaNegocio);
		}
		
		setModel(modeloCombo);
	}
	
	
	public void actualizarModelo(Collection<negocio.SubCategoria> subcategorias)
	{	
		DefaultComboBoxModel<negocio.SubCategoria> modeloCombo = new DefaultComboBoxModel<negocio.SubCategoria>();
		
		for(negocio.SubCategoria subcategoriaNegocio : subcategorias)
		{
			modeloCombo.addElement(subcategoriaNegocio);
		}
		
		setModel(modeloCombo);
	}
}
