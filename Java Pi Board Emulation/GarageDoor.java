/* this is the code mimicking the garage doors of the house
 * there are two options: open or closed
 * true = closed, false = open 
 * this class sets and returns the status of the door
 * either make multiple objects for more than one door or a list
 */

package main;

public class GarageDoor {

	private boolean status;
	
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public boolean returnStatus() {
		return status;
	}
}
