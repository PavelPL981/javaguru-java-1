package lesson_3.hw3.level_4;

import java.util.Date;

public class DoctorTimetableApp {

    static void main() {
        DoctorAppointment appointment1 = new DoctorAppointment(
                "Vasja", "Pupkin", "cold", 10
        );
        DoctorAppointment appointment2 = new DoctorAppointment(
                "Petja", "Petrov", "heat", 100
        );

        DoctorTimetable timetable = new DoctorTimetable(
                "Kristina",
                "Kozlova",
                "pediatrician",
                new Date(),
                appointment1, appointment2
        );

        System.out.println("Patient first name = " + appointment1.getPatientFirstName());
        System.out.println("Patient last name = " + appointment1.getPatientLastName());
        System.out.println("Diagnosis = " + appointment1.getDiagnosis());
        System.out.println("Visit price = " + appointment1.getVisitPrice());

        System.out.println("Doctor first name = " + timetable.getDoctorFirstName());
        System.out.println("Doctor last name = " + timetable.getDoctorLastName());
        System.out.println("Doctor speciality = " + timetable.getDoctorSpeciality());
        System.out.println("Appointment date = " + timetable.getAppointmentDate());

        System.out.println("Appointment 1 diagnose = " + timetable.getAppointment1().getDiagnosis());
    }
}
