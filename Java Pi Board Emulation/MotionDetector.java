/* this code mimics the motion detectors. the detectors are simply active
 * or inactive, so boolean works
 * true = active, false = inactive
 * two objects, upstairs and downstairs. only active or inactive
 */

package main;

public class MotionDetector {
	private boolean detector;
	
	public void setDetector(boolean detector) {
		this.detector = detector;
	}
	
	public boolean getDetector() {
		return detector;
	}

}
