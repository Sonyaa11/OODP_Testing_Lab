package Case1;
/**
 * Represents a doctor in the hospital.
 */
public class Doctor extends Person{
	public int doctorId;
	public String department;
	/**
	 * Displays patient details.
	 *
	 * @param patient The patient whose details are to be displayed. 
	 */
	public void seePatientDetails(Patient patient) {
		patient.viewPersonalDetails();
	}
	/**
     * Prescribes a treatment to a patient.
     *
     * @param treatment The treatment to be prescribed.
     */
	public void  prescribeTreatment(Treatment treatment) {
		System.out.println("Prescribing treatment: " + treatment.type + " - " + treatment.description);
	}
}
