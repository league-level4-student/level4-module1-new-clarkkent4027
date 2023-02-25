package _06_Hospital;

public class Patient {
	public boolean pulseTaken = false;

	public void checkPulse() {
		pulseTaken = true;
		feelsCaredFor();
	}

	public boolean feelsCaredFor() {
		if (pulseTaken == true) {
			return true;
		}
		return false;
	}
}
