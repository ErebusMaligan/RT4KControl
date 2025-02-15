package ui;

import java.awt.GridLayout;

import data.DataProvider;
import data.command.RT4KCommands;

@SuppressWarnings("serial")
public class ProfileListPanel extends CommonListPanel {

	public ProfileListPanel( DataProvider provider ) {
		super( provider );
		this.setLayout( new GridLayout( 12, 1 ) );
		createButton( getText( "P1" ), RT4KCommands.PROF1 );
		createButton( getText( "P2" ), RT4KCommands.PROF2 );
		createButton( getText( "P3" ), RT4KCommands.PROF3 );
		createButton( getText( "P4" ), RT4KCommands.PROF4 );
		createButton( getText( "P5" ), RT4KCommands.PROF5 );
		createButton( getText( "P6" ), RT4KCommands.PROF6 );
		createButton( getText( "P7" ), RT4KCommands.PROF7 );
		createButton( getText( "P8" ), RT4KCommands.PROF8 );
		createButton( getText( "P9" ), RT4KCommands.PROF9 );
		createButton( getText( "P10" ), RT4KCommands.PROF10 );
		createButton( getText( "P11" ), RT4KCommands.PROF11 );
		createButton( getText( "P12" ), RT4KCommands.PROF12 );
	}
	
	private String getText( String text ) {
		return text + ": " + (String)provider.getProps().getProps().getOrDefault( text, "Unknown" ); 
	}
}