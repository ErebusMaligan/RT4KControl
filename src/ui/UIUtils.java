package ui;

import java.awt.Dimension;
import java.awt.GridBagConstraints;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;

import data.command.CommandListener;

public class UIUtils {

	private static Dimension listBDim = new Dimension( 200, 25 );
	
	public static void addButton( JPanel panel, String text, String command, CommandListener l ) {
		JButton b = getButton( text, command, l );
		panel.add( b );
	}
	
	public static JButton getButton( String text, String command, CommandListener l ) {
		JButton b = new JButton( text );
		b.addActionListener( e -> l.commandRecieved( command ) );
		return b;
	}
	
	public static JButton getButton( String text, String command, CommandListener l, Dimension dim ) {
		JButton b = getButton( text, dim );
		if ( command != null && l != null ) {
			b.addActionListener( e -> l.commandRecieved( command ) );
		}
		return b;
	}
	
	public static JButton getButton( String text, Dimension dim ) {
		JButton b = new JButton( text );
		b.setBorder( getButtonBorder() );
		b.setPreferredSize( dim );
		b.setMaximumSize( dim );
		b.setMinimumSize( dim );
		return b;
	}
	
	public static void addButton( JPanel panel, GridBagConstraints c, String text, String command, CommandListener l, Dimension dim ) {
		JButton b = getButton( text, command, l, dim );
		panel.add( b, c );
	}
	
	public static Border getButtonBorder() {
		return BorderFactory.createBevelBorder( BevelBorder.RAISED );
	}
	
	public static Dimension getListButtonDimension() {
		return listBDim;
	}
	
}
