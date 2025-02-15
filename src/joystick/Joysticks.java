package joystick;

import java.util.HashMap;
import java.util.Map;

import data.DataProvider;
import data.command.RT4KCommands;
import joystick.event.HoldDelayJoystickEventListener;
import joystick.event.JoystickEvent;
import joystick.event.JoystickEventAdapter;

public class Joysticks {
	
	private Map<Integer, String> commands = new HashMap<>();
	
	private JoystickManager jt;
	
	public Joysticks( DataProvider provider ) {
		commands.put( 0, RT4KCommands.OK );
		commands.put( 6, RT4KCommands.BACK );
		commands.put( 7, RT4KCommands.MENU );
		commands.put( 16, RT4KCommands.UP );
		commands.put( 19, RT4KCommands.LEFT );
		commands.put( 17, RT4KCommands.RIGHT );
		commands.put( 18, RT4KCommands.DOWN );
		
		jt = new JoystickManager();
		jt.setPollRate( 100 );
		HoldDelayJoystickEventListener listener = new HoldDelayJoystickEventListener( 
				new JoystickEventAdapter() {
					@Override
					public void buttonHeld( JoystickEvent e ) {
						if ( commands.containsKey( e.getButton() ) ) {
							provider.commandRecieved( commands.get( e.getButton() ) );
						}
					}
				}
		) {
				
			@Override
			public void axisMoved( JoystickEvent e ) {}			

			@Override
			public void buttonPressed( JoystickEvent e ) {
				if ( commands.containsKey( e.getButton() ) ) {
					provider.commandRecieved( commands.get( e.getButton() ) );
				}
			}
		};
		listener.setDelayThreshold( 12 );
		jt.addListener( listener );
		jt.startPolling();
	}
	
	public void stopPolling() {
		jt.stopPolling();
	}

}
