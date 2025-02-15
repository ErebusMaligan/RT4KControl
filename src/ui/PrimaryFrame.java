package ui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.WindowConstants;

import data.DataProvider;

@SuppressWarnings("serial")
public class PrimaryFrame extends JFrame {
	
	public PrimaryFrame( DataProvider provider ) {
		this.setSize( new Dimension( 400, 800 ) );
		this.setDefaultCloseOperation( WindowConstants.DISPOSE_ON_CLOSE );
		this.setTitle( "RT4K Control" );
		this.addWindowListener( new WindowAdapter() {
			@Override
			public void windowClosed( WindowEvent e ) {
				provider.stopJPoll();
				provider.getSerialConn().shutdown();
			}
		} );
		this.setLayout( new BorderLayout() );
		this.add( new SerialPortSelectionPanel( provider.getSerialConn() ), BorderLayout.NORTH );
		this.add( new MenuControlPanel( provider ), BorderLayout.SOUTH );
		JTabbedPane tabs = new JTabbedPane();
		tabs.add( "Profiles", new ProfileListPanel( provider ) );
		tabs.add( "Resolutions", new ResolutionListPanel( provider ) );
		this.add( new JScrollPane( tabs ), BorderLayout.CENTER );
	}
}