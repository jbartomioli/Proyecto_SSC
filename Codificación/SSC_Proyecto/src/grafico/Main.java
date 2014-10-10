package grafico;

import java.awt.EventQueue;

public class Main 
{
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PruebaGraficas frame = new PruebaGraficas();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
