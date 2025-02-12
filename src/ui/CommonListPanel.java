package ui;

import javax.swing.JButton;
import javax.swing.JPanel;

import data.DataProvider;

@SuppressWarnings("serial")
public abstract class CommonListPanel extends JPanel {

	protected DataProvider provider;
	
	public CommonListPanel( DataProvider provider ) {
		this.provider = provider;
	}
	
	protected void createButton( String text, String command ) {
		JButton b = UIUtils.getButton( text, command, provider, UIUtils.getListButtonDimension() );
		b.setBorder( UIUtils.getButtonBorder() );
		add( b );
	}
}