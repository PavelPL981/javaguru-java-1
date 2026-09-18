package lesson_3.hw3.level_4;

public class DoctorAppointment {

    private String patientFirstName;
    private String patientLastName;
    private String diagnosis;
    private int visitPrice;

    public DoctorAppointment(String patientFirstName,
                             String patientLastName,
                             String diagnosis,
                             int visitPrice) {
        this.patientFirstName = patientFirstName;
        this.patientLastName = patientLastName;
        this.diagnosis = diagnosis;
        this.visitPrice = visitPrice;
    }

    public String getPatientFirstName() {
        return patientFirstName;
    }

    public void setPatientFirstName(String patientFirstName) {
        this.patientFirstName = patientFirstName;
    }

    public String getPatientLastName() {
        return patientLastName;
    }

    public void setPatientLastName(String patientLastName) {
        this.patientLastName = patientLastName;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public int getVisitPrice() {
        return visitPrice;
    }

    public void setVisitPrice(int visitPrice) {
        this.visitPrice = visitPrice;
    }
}
