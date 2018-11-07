/* this class mimics the thermostats of the house
 * two string objects: mode and fan
 * two int objects: currentTemp and controlTemp
 * mode has three options: heat, cool, and off
 * fan has two options:	   auto and off
 * currentTemp is the actual temp
 * controlTemp is the desired temp
 * the code sets and returns these two objects
 * make two separate objects for upstairs and downstairs
 * temp is an int because fahrenheit is used and is accurate enough
 */

package main;

public class Thermostat {
	private String mode, fan;
	private int currentTemp, controlTemp;
	
	public void setMode(String mode) {
		this.mode = mode;
	}
	
	public void setFan(String fan) {
		this.fan = fan;
	}
	
	public void setCurrentTemp(int temp) {
		this.currentTemp = temp;
	}
	
	public void setControlTemp(int temp) {
		this.controlTemp = temp;
	}
		
	public String getMode() {
		return mode;
	}
	
	public String getFan() {
		return fan;		
	}
	
	public int getCurrentTemp() {
		return currentTemp;
	}
	
	public int getControlTemp() {
		return controlTemp;
	}
}
