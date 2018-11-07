/* this code mimics door and window sensors. simple bool value
 * true = closed, false = open
 * two array lists should be made, upstairs and downstairs
 */

package main;

public class DoorWindowSensor {
	private boolean sensor;
	
	public void setSensor(boolean sensor) {
		this.sensor = sensor;
	}
	
	public boolean getSensor() {
		return sensor;
	}

}
