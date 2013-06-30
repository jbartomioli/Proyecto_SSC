package negocio;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CatalogoCategorias 
{
	//ATRIBUTOS
	private Collection<negocio.Categoria> categorias;

	
	//CONSTRUCTOR
	public CatalogoCategorias() 
	{
		categorias = new ArrayList<negocio.Categoria>();
		this.obtenerCategorias();
	}
	
	
	//GETTERS & SETTERS
	public Collection<negocio.Categoria> getCategorias()
	{
		return categorias;
	}


	public void setCategorias(Collection<negocio.Categoria> categorias) 
	{
		this.categorias = categorias;
	}
	
	
	
	//METODOS
	//------------------------------------------------------------------------
	//Seteo del array de categorias a partir de la capa de datos
	public void obtenerCategorias()
	{
		//se crea un objeto catalogocategorias de datos
		datos.OLD.CatalogoCategorias ctgDatos = new datos.OLD.CatalogoCategorias();
		
		//se inicializa el array de clientes del catalogo
		categorias = new ArrayList<negocio.Categoria>();
			
		
		Iterator <datos.OLD.Categoria> it = ctgDatos.getCategorias().iterator();
		
		while(it.hasNext())
		{
			datos.OLD.Categoria datosCategoria = it.next();
			
			negocio.Categoria categoriaNegocio = new negocio.Categoria();			
			
			categoriaNegocio.setIdCategoria(datosCategoria.getIdCategoria());
			categoriaNegocio.setDescripcion(datosCategoria.getDescripcion());
			//producto
			
			Collection<negocio.Producto> productos = new ArrayList<negocio.Producto>();
			
			for(datos.OLD.Categoria dc: ctgDatos.getCategorias())
			{
				if(datosCategoria.getIdCategoria() == dc.getIdCategoria())
				{
					negocio.Producto productoNegocio = new negocio.Producto();
					
					productoNegocio.setIdProducto(datosCategoria.getProducto());
				
					productos.add(productoNegocio);
				}
			}
			
			categoriaNegocio.setProducto(productos);
			
			//subcat
			
		
		/*
			if(categoriaNegocio.getIdCategoria() != datosCategoria.getIdCategoria())
			{	
			//for(datos.Categoria datosCategoria: ctgDatos.getCategorias())
			
				negocio.Categoria categoriaNegocio1 = new negocio.Categoria();			
				
				categoriaNegocio1.setIdCategoria(datosCategoria.getIdCategoria());
				categoriaNegocio1.setDescripcion(datosCategoria.getDescripcion());
				//producto
				
				Collection<negocio.Producto> productos1 = new ArrayList<negocio.Producto>();
				
				for(datos.Categoria dc: ctgDatos.getCategorias())
				{
					if(datosCategoria.getIdCategoria() == dc.getIdCategoria())
					{
						negocio.Producto productoNegocio = new negocio.Producto();
						
						productoNegocio.setIdProducto(datosCategoria.getProducto());
					
						productos1.add(productoNegocio);
					}
				}
				
				categoriaNegocio1.setProducto(productos1);
			}
			//subcat
				*/
			categorias.add(categoriaNegocio);
		}
	}
	//*************************************************************************


	//Busca una categoria por su idCategoria
	public negocio.Categoria buscarCategoria(int idCategoria)
	{
		return null;
	}
	//*************************************************************************
}
