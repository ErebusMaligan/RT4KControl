package data;

import data.command.CommandListener;
import data.props.UserProps;
import data.serial.SerialConn;
import joystick.Joysticks;

public class DataProvider implements CommandListener {
	
	private SerialConn conn = new SerialConn();
	
	private UserProps props = new UserProps();
	
	private Joysticks joy;
	
	public DataProvider() {
		try {
			 joy = new Joysticks( this );
		} catch ( Error e ) {
			e.printStackTrace();
		}
	}
	
	public SerialConn getSerialConn() {
		return conn;
	}
	
	public UserProps getProps() {
		return props;
	}
	
	public void stopJPoll() {
		joy.stopPolling();
	}

	@Override
	public void commandRecieved( String command ) {
		getSerialConn().sendCommand( command );
	}
}