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

	public ArrayList getDoctors() {
		return Doctors;
	}

	public ArrayList getPatients() {
		return unassignedPatients;
	}

	public void assignPatientsToDoctors() throws DoctorFullException {
		// TODO Auto-generated method stub

		for (int i = 0; i < Doctors.size(); i++) {
			while (Doctors.get(i).assignedPatients.size() < 3 && unassignedPatients.size()>0) {
				System.out.println(Doctors.get(i).assignedPatients.size());
				Doctors.get(i).assignPatient(unassignedPatients.remove(0));

			}
			if (Doctors.get(i).assignedPatients.size() > 3) {
				throw new DoctorFullException();

			} else if (unassignedPatients.size() == 0) {

				break;

			}

		}
	}
}
