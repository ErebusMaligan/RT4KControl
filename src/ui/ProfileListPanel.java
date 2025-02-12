package ui;

import java.awt.GridLayout;

import data.DataProvider;
import data.command.T4KCommands;

@SuppressWarnings("serial")
public class ProfileListPanel extends CommonListPanel {

	public ProfileListPanel( DataProvider provider ) {
		super( provider );
		this.setLayout( new GridLayout( 12, 1 ) );
		createButton( getText( "P1" ), T4KCommands.PROF1 );
		createButton( getText( "P2" ), T4KCommands.PROF2 );
		createButton( getText( "P3" ), T4KCommands.PROF3 );
		createButton( getText( "P4" ), T4KCommands.PROF4 );
		createButton( getText( "P5" ), T4KCommands.PROF5 );
		createButton( getText( "P6" ), T4KCommands.PROF6 );
		createButton( getText( "P7" ), T4KCommands.PROF7 );
		createButton( getText( "P8" ), T4KCommands.PROF8 );
		createButton( getText( "P9" ), T4KCommands.PROF9 );
		createButton( getText( "P10" ), T4KCommands.PROF10 );
		createButton( getText( "P11" ), T4KCommands.PROF11 );
		createButton( getText( "P12" ), T4KCommands.PROF12 );
	}
	
	private String getText( String text ) {
		return text + ": " + (String)provider.getProps().getProps().getOrDefault( text, "Unknown" ); 
	}
}