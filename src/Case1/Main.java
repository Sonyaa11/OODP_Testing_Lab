package Case1;


/**
 * Main class to demonstrate the Hospital Management System.
 */
public class Main {
	public static void main(String[] args) {
        Patient patient = new Patient();
        patient.personID = 1;
        patient.name = "Soniya";
        patient.age = 19;
        patient.gender = "Female";
        patient.address = "Kathmandu";
        patient.contactDetails = "1234567890";

        Doctor doctor = new Doctor();
        doctor.personID = 1;
        doctor.name = "Dr. Jessica";
        doctor.age = 27;
        doctor.gender = "Female";
        doctor.address = "Lalitpur";
        doctor.contactDetails = "0012345678";

        Appointment appointment = new Appointment();
        appointment.appointmentID = 1;
        appointment.appointmentDate = "2025-01-10";
        appointment.appointmentTime = "06:30 PM";

        Treatment treatment = new Treatment();
        treatment.treatmentID = 1;
        treatment.type = "Therapy";
        treatment.description = "Take a full body therapy.";

        System.out.println("=* Patient Details *=");
        patient.viewPersonalDetails();

        System.out.println("\n=* Doctor Details *=");
        doctor.viewPersonalDetails();

        System.out.println("\n=* Booking Appointment *=");
        patient.bookAppointment(appointment);

        System.out.println("\n=* Viewing Appointment Details *=");
        appointment.viewAppointmentDetails();

        System.out.println("\n=* Rescheduling Appointment *=");
        appointment.rescheduleAppointment("2025-01-13", "2:00 PM");
        appointment.viewAppointmentDetails();

        System.out.println("\n=* Doctor Prescribing Treatment *=");
        doctor.prescribeTreatment(treatment);

        System.out.println("\n=* Updating and Viewing Treatment Details *=");
        treatment.updateDescription("Take one thal of rice.");
        treatment.viewTreatmentDetails();

        System.out.println("\n=* Canceling Appointment *=");
        appointment.cancelAppointment();
    }
}
