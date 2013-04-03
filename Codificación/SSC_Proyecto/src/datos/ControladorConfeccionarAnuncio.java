package datos;

import java.util.Collection;

public class ControladorConfeccionarAnuncio 
{
	datos.CatalogoCategorias cctg;
	datos.CatalogoSubCategorias csctg;
	datos.CatalogoProductos cp;
	datos.CatalogoAnuncios ca;
	private Collection<datos.Producto> productos;
	private Collection<datos.SubCategoria> subCats;
	datos.Producto productoActual;
	private Collection<datos.Cliente> arrClientesInteresados;
	private Collection<datos.Producto> arrProductosPublicación;
	datos.Anuncio anuncioActual;
	datos.Producto productoModificar;
}
