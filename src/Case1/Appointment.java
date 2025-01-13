package Case1;
/**
 * Represents an appointment in the hospital.
 */
public class Appointment {
	public int appointmentID;
	public String appointmentDate;
	public String appointmentTime;
	 /**
     * Reschedules the appointment to a new date and time.
     * @param appointmentDate The new date for the appointment.
     * @param appointmentTime The new time for the appointment.
     */
	public void rescheduleAppointment(String appointmentDate,String appointmentTime ) {
		this.appointmentTime=  appointmentTime;
		this.appointmentDate=  appointmentDate;
		 System.out.println("Appointment rescheduled to: " + appointmentDate + " at " + appointmentTime);
	}
	/**
     * Cancels the appointment.
     */
	public void  cancelAppointment() {
		System.out.println("Appointment ID " + appointmentID + " has been canceled.");
	}
	 /**
     * Displays appointment details.
     */
	public void  viewAppointmentDetails() {
		System.out.println("Appointment ID: " + appointmentID + ", Date: " + appointmentDate + ", Time: " + appointmentTime);
	}
}
-