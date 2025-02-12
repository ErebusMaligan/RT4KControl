package data.serial;

import com.fazecast.jSerialComm.SerialPort;

import data.command.T4KCommands;

public class SerialConn {
	
	private SerialPort port;
	
	public void setPort( SerialPort port ) {
		System.out.println( "Setting port: " + port  + port.getPortLocation() );
		shutdown();
		this.port = port;
		System.out.println( "Opening port: " + port  + port.getPortLocation() );
		System.out.println( port.getSystemPortName() );
		System.out.println( port.getDescriptivePortName() );
		System.out.println( port.getSystemPortPath() );
		System.out.println( port.getPortLocation() );
		this.port.setBaudRate( 115200 );
		this.port.setNumDataBits( 8 );
		this.port.setParity( SerialPort.NO_PARITY );
		this.port.setNumStopBits( SerialPort.ONE_STOP_BIT );
		this.port.openPort();
	}
	
	public SerialPort getPort() {
		return port;
	}
	
	public void shutdown() {
		if ( port != null ) {
		System.out.println( "Closing port: " + port  + port.getPortLocation() );
			port.closePort();
		}
	}
	
	public void sendCommand( String command ) {
		if ( port.isOpen() ) {
			String com = T4KCommands.REMOTE + " " + command + "\n";
			byte[] b = com.getBytes();
			int count = port.writeBytes( b, b.length );
			System.out.println( "(" + count + "): " + com );
		}
	}
}