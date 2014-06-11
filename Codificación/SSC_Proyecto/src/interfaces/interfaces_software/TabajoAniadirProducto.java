package interfaces.interfaces_software;



public class TabajoAniadirProducto implements Runnable{
    
    public static boolean band=false;
    

    
    public TabajoAniadirProducto(int idProducto)
    {
    }
    
    @Override
    public void run()
    {
        band=false;
		
        try
        {		
        	//controlador.seleccionarProducto(producto.getIdProducto());		
        	
        	Thread.sleep( 1000 );
        }
        catch (InterruptedException e)
        {
            System.err.println( e.getMessage() );
        }
        finally
        {
        	band=true;
        }
    }
    
}
