package lesson_3.hw3.level_4;

import java.util.Date;

public class DoctorTimetable {

    private String doctorFirstName;
    private String doctorLastName;
    private String doctorSpeciality;
    private Date appointmentDate;
    private DoctorAppointment appointment1;
    private DoctorAppointment appointment2;

    public DoctorTimetable(String doctorFirstName,
                           String doctorLastName,
                           String doctorSpeciality,
                           Date appointmentDate,
                           DoctorAppointment appointment1,
                           DoctorAppointment appointment2) {
        this.doctorFirstName = doctorFirstName;
        this.doctorLastName = doctorLastName;
        this.doctorSpeciality = doctorSpeciality;
        this.appointmentDate = appointmentDate;
        this.appointment1 = appointment1;
        this.appointment2 = appointment2;
    }

    public String getDoctorFirstName() {
        return doctorFirstName;
    }

    public void setDoctorFirstName(String doctorFirstName) {
        this.doctorFirstName = doctorFirstName;
    }

    public String getDoctorLastName() {
        return doctorLastName;
    }

    public void setDoctorLastName(String doctorLastName) {
        this.doctorLastName = doctorLastName;
    }

    public String getDoctorSpeciality() {
        return doctorSpeciality;
    }

    public void setDoctorSpeciality(String doctorSpeciality) {
        this.doctorSpeciality = doctorSpeciality;
    }

    public Date getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(Date appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public DoctorAppointment getAppointment1() {
        return appointment1;
    }

    public void setAppointment1(DoctorAppointment appointment1) {
        this.appointment1 = appointment1;
    }

    public DoctorAppointment getAppointment2() {
        return appointment2;
    }

    public void setAppointment2(DoctorAppointment appointment2) {
        this.appointment2 = appointment2;
    }
}
