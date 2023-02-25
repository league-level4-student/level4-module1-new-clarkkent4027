package _06_Hospital;

import java.util.ArrayList;

public abstract class Doctor extends Patient {
	Patient patient = new Patient();

	public abstract void doMedicine();

	public abstract void assignPatient(Patient patient) throws DoctorFullException;

	public abstract ArrayList getPatients();

	ArrayList<Patient> assignedPatients = new ArrayList<Patient>();

	public boolean makesHouseCalls() {
		return false;
	}

	public boolean performsSurgery() {
		return false;
	}
}
	 class GeneralPractitioner extends Doctor {

		@Override
		public void doMedicine() {
			// TODO Auto-generated method stub
			for (int i = 0; i < assignedPatients.size(); i++) {
				assignedPatients.get(i).checkPulse();
			}
		}

		@Override
		public ArrayList getPatients() {
			// TODO Auto-generated method stub
			return assignedPatients;
		}

		public boolean makesHouseCalls() {
			return true;

		}

		@Override
		public void assignPatient(Patient patient) throws DoctorFullException{
			// TODO Auto-generated method stub
			if (assignedPatients.size() < 3) {
				assignedPatients.add(patient);
				System.out.println(assignedPatients.size());
			} else {
				System.out.println("Exception.");
				throw new DoctorFullException();

			}

		}
	}

		 class Surgeon extends Doctor {

			@Override
			public void doMedicine() {
				// TODO Auto-generated method stub
				patient.checkPulse();
			}

			@Override
			public ArrayList getPatients() {
				// TODO Auto-generated method stub
				return assignedPatients;
			}

			public boolean performsSurgery() {
				return true;
			}

			@Override
			public void assignPatient(Patient patient) throws DoctorFullException {
				// TODO Auto-generated method stub
				if (assignedPatients.size() < 3) {
					assignedPatients.add(patient);
					System.out.println(assignedPatients.size());
				} else {
					System.out.println("Exception.");
					throw new DoctorFullException();

				}
			}
		}
	

