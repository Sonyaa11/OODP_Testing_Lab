package Case1;
/**
 * Represents a patient in the hospital.
 */
public class Patient extends Person {
	public int patientId;

/**
 * Books an appointment for the patient.
 * @param appointment The appointment to be booked.
 */public void bookAppointment(Appointment appointment) {
     System.out.println("Appointment booked for patient ID: " + patientId + " on " +
             appointment.appointmentDate + " at " + appointment.appointmentTime);
 }
}
