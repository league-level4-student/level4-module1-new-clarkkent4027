package _06_Hospital;

import java.util.ArrayList;

public class Hospital {
	ArrayList<Doctor> Doctors = new ArrayList<Doctor>();
	ArrayList<Patient> unassignedPatients = new ArrayList<Patient>();

	public void addDoctor(Doctor doctor) {
		Doctors.add(doctor);
	}

	public void addPatient(Patient patient) {
		unassignedPatients.add(patient);
	}

	public ArrayList getDoctor() {
		return Doctors;
	}

	public ArrayList getPatient() {
		return unassignedPatients;
	}

	public void assignPatientsToDoctors() throws DoctorFullException {
		// TODO Auto-generated method stub
		if (unassignedPatients.size() > Doctors.size() * 3) {
			throw new DoctorFullException();
		}
		for (int i = 0; i < Doctors.size(); i++) {
			for (int j = 0; j < 3; j++) {

			}
		}

	}
}
