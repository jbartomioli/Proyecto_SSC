package interfaces.interfaces_software;
import java.awt.Cursor;

import javax.swing.JDialog;
import javax.swing.JProgressBar;


public class HiloBarraAniadir implements Runnable
{

    private JProgressBar jProgressBar;
    private int i = 1;
    private int value = 0;
    private JDialog dialog;
    private Thread trabajo;

   
    public HiloBarraAniadir(Thread trabajo, JDialog dialog, JProgressBar jProgressBar , int value )
    {
        this.jProgressBar = jProgressBar;
        this.value = value;
        this.dialog = dialog;
        this.trabajo = trabajo;
    }

    @Override
    public void run()
    {
        i=1;        
        //mientra el trabajo en paralelo no finalice el jProgressBar continuara su animacion una y otra vez
        while( trabajo.isAlive() )
        {
            //si llega al limite 100 comienza otra vez desde 1, sino incrementa i en +1
            i = (i > 100) ? 1 : i+1;
            
            jProgressBar.setValue(i);
            jProgressBar.repaint();  
            //retardo en milisegundos
            try
            {
            	Thread.sleep( this.value );
            }            
            catch (InterruptedException e)
            { 
            	System.err.println( e.getMessage() ); 
            }            
            //si el trabajo en paralelo a terminado
            if( !trabajo.isAlive() )
            {
                jProgressBar.setValue(100);
                jProgressBar.repaint();
                //dialog.dispose();
                dialog.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
                break;//rompe ciclo
            }            
        }
    }

}
