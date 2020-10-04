package csce247singletonDesignPattern;

import java.util.ArrayList;

/**
 * Patient contains a Patient constructor, addAllergy method, and a toString
 * method.
 * 
 * @author aniruthsivakumar
 */

public class Patient {
	private int id;
	private String firstName;
	private String lastName;
	private ArrayList<String> allergies;

	/**
	 * This constructor just creates a patient.
	 * 
	 * @param id
	 * @param firstName
	 * @param lastName
	 */

	public Patient(int id, String firstName, String lastName) {

		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;

	}

	/**
	 * This method adds an allergy to the patient
	 * 
	 * @param allergy
	 */
	public void addAllergy(String allergy) {

		allergies.add(allergy);
	}

	/**
	 * This method returns the patient data in the correct format
	 * 
	 */
	public String toString() {

		return "Displaying Patient:" + "\nPatient " + id + 1 + " :" + firstName + " " + lastName + "\n   Allergies:"
				+ allergies;

	}

}
