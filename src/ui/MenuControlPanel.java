package ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

import data.command.CommandListener;
import data.command.RT4KCommands;

@SuppressWarnings("serial")
public class MenuControlPanel extends JPanel {
	
	int d = 60;
	private Dimension dim = new Dimension( d, d );
	private Dimension overall = new Dimension( 5 * d, 5 * d );
	
	public MenuControlPanel( CommandListener provider ) {
		this.setLayout( new GridLayout( 5, 5, 0, 0 ) );
		add( UIUtils.getButton( "MENU", RT4KCommands.MENU, provider, dim ) );
		add( Box.createRigidArea( dim ) );
		add( Box.createRigidArea( dim ) );
		add( Box.createRigidArea( dim ) );
		add( UIUtils.getButton( "BACK", RT4KCommands.BACK, provider, dim ) );
		
		add( Box.createRigidArea( dim ) );
		add( Box.createRigidArea( dim ) );
		add( UIUtils.getButton( "UP", RT4KCommands.UP, provider, dim ) );
		add( Box.createRigidArea( dim ) );
		add( Box.createRigidArea( dim ) );
		
		add( Box.createRigidArea( dim ) );
		add( UIUtils.getButton( "LEFT", RT4KCommands.LEFT, provider, dim ) );
		add( UIUtils.getButton( "OK", RT4KCommands.OK, provider, dim ) );
		add( UIUtils.getButton( "RIGHT", RT4KCommands.RIGHT, provider, dim ) );
		add( Box.createRigidArea( dim ) );
		
		add( Box.createRigidArea( dim ) );
		add( Box.createRigidArea( dim ) );
		add( UIUtils.getButton( "DOWN", RT4KCommands.DOWN, provider, dim ) );
		add( Box.createRigidArea( dim ) );
		add( Box.createRigidArea( dim ) );
		
		add( UIUtils.getButton( "DIAG", RT4KCommands.DIAG, provider, dim ) );
		add( Box.createRigidArea( dim ) );
		add( Box.createRigidArea( dim ) );
		add( Box.createRigidArea( dim ) );
		add( UIUtils.getButton( "STAT", RT4KCommands.STAT, provider, dim ) );
		this.setPreferredSize( overall );
		this.setMaximumSize( overall );
		this.setBorder( BorderFactory.createCompoundBorder( BorderFactory.createLineBorder( Color.BLACK, 2, true ), BorderFactory.createBevelBorder( BevelBorder.LOWERED ) ) );
	}
}