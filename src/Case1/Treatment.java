package Case1;
/**
 * Represents a treatment in the hospital.
 */
public class Treatment {
	public int treatmentID;
	public String type;
	public String description;
	/**
     * Updates the description of the treatment.
     *
     * @param description The new description for the treatment.
     */
	public void updateDescription( String description ) {
		this.description = description;
        System.out.println("Treatment description updated to: " + description);
	}
	/**
     * Displays treatment details.
     */
	public void  viewTreatmentDetails() {
		System.out.println("Treatment ID: " + treatmentID + ", Type: " + type + ", Description: " + description);
	}
}
