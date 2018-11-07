/*This code mimics door locks
 * each door will be declared in the main code and allows for different
 * amounts of doors. make an object for each door
 * simply a boolean value. True = locked, false = unlocked
 */

package main;

public class Locks {
	private boolean door;
	
	public void setStatus(boolean door) {
		this.door = door;
	}
	
	public boolean getStatus() {
		return door;
	}

}
