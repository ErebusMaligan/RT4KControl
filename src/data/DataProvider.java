package data;

import data.command.CommandListener;
import data.props.UserProps;
import data.serial.SerialConn;

public class DataProvider implements CommandListener {
	
	private SerialConn conn = new SerialConn();
	
	private UserProps props = new UserProps();
	
	public SerialConn getSerialConn() {
		return conn;
	}
	
	public UserProps getProps() {
		return props;
	}

	@Override
	public void commandRecieved( String command ) {
		getSerialConn().sendCommand( command );
	}
}