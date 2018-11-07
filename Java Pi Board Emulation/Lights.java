/* this code mimics the lights. An array list should be made in the main
 * code. two lists, upstairs and downstairs
 * the dimmer level is a double and could be a int, but should be from 1 - 10 regardless
 */

package main;

public class Lights {
	private double dimmerLevel;
	
	public void setDimmerLevel(double level) {
		this.dimmerLevel = level;
	}
	
	public double getDimmerLevel() {
		return dimmerLevel;
	}	

}
