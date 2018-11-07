/* this is the code mimicking the security system of the house
 * there are three options: disarmed, armed stay, armed away
 * this class sets and returns the status of the system
 * only one object
 */

package main;

public class SecuriySys {
	String status;


	public void setStatus(String status){
		this.status = status;
	}
	
	public String getStatus(){
		return status;
	}
}
