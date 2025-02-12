package ui;

import java.awt.GridLayout;

import javax.swing.JLabel;

import data.DataProvider;
import data.command.T4KCommands;

@SuppressWarnings("serial")
public class ResolutionListPanel extends CommonListPanel {
	
	public ResolutionListPanel( DataProvider provider ) {
		super( provider );
		this.setLayout( new GridLayout( 9, 1 ) );
		createButton( "4K", T4KCommands.RES4K );
		createButton( "1440p", T4KCommands.RES1440P );
		createButton( "1080p", T4KCommands.RES1080P );
		createButton( "480p", T4KCommands.RES480P );
		add( new JLabel() );
		createButton( "Custom Res 1", T4KCommands.RES1 );
		createButton( "Custom Res 2", T4KCommands.RES2 );
		createButton( "Custom Res 3", T4KCommands.RES3 );
		createButton( "Custom Res 4", T4KCommands.RES4 );
	}
}