package csce247singletonDesignPattern;

import java.util.ArrayList;

/**
 * HospitalSystem creates a patient and a hospitalSystem. It also has a
 * getInstance, addPatient, getRecord, addAllergy, and a getAllPatientsData
 * method
 * 
 * @author aniruthsivakumar
 */

public class HospitalSystem {

	private static Patient patients;

	private static HospitalSystem hospitalSystem;

	/**
	 * Constructor for HospitalSystem
	 */
	private HospitalSystem() {
	}

	/**
	 * getInstance method that gets a new Instance of HopsitalSystem
	 * @return a new hospitalSystem
	 */
	public static HospitalSystem getInstance() {

		if (hospitalSystem == null) {
			hospitalSystem = new HospitalSystem();
		}

		return hospitalSystem;
	}

	/**
	 * addPatient method passes in all attributes necessary to make a patient and adds one to the list after creating it
	 * 
	 * @param firstName
	 * @param lastName
	 * @param id
	 * @return the id is returned
	 */
	public int addPatient(String firstName, String lastName, int id) {
		patients = new Patient(id, firstName, lastName);
		return id;

	}

	/**
	 * getRecord method takes in id
	 * @param id
	 * @return returns patient id (at least it is supposed to I just am unable to figure this out. 
	 */
	public Patient getRecord(int id) {

		return patients;

	}

	/**
	 * addAllergy method passes in id and allergy and adds it to a patient
	 * @param id
	 * @param allergy
	 */
	public void addAllergy(int id, String allergy) {
	
	}

	/**
	 * getAllPatient method uses the toString method
	 * @return the summary of patient(s)
	 */
	public String getAllPatientsData() {
		return patients.toString();
	}
}
