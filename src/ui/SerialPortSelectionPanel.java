package ui;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import com.fazecast.jSerialComm.SerialPort;

import data.serial.SerialConn;

@SuppressWarnings("serial")
public class SerialPortSelectionPanel extends JPanel {
	public SerialPortSelectionPanel( SerialConn conn ) {
		this.setLayout( new FlowLayout( FlowLayout.CENTER, 20, 5 ) );
		JComboBox<SerialPort> ports = new JComboBox<>( SerialPort.getCommPorts() );
		JButton connect = UIUtils.getButton( "Connect", new Dimension( 80, 20 ) );
		connect.addActionListener( e -> conn.setPort( ports.getItemAt( ports.getSelectedIndex() ) ) );
		this.add( new JLabel( "Serial Port: ", SwingConstants.RIGHT ) );
		this.add( ports );
		this.add( connect );
	}
}