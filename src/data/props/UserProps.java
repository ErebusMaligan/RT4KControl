package data.props;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class UserProps {

	private Properties props = new Properties();
	
	public UserProps() {
		try ( FileInputStream fis = new FileInputStream( "user.properties" ) ) {
			props.load( fis );
		} catch ( IOException e ) {
			e.printStackTrace();
		}
	}
	
	public Properties getProps() {
		return props;
	}
}