package app;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import data.DataProvider;
import ui.PrimaryFrame;

public class RT4KControl {

	public static void main( String[] args ) {
		try {
			UIManager.setLookAndFeel( UIManager.getSystemLookAndFeelClassName() );
		} catch ( ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e ) {
			e.printStackTrace();
		}
		new PrimaryFrame( new DataProvider() ).setVisible( true );
	}	
}