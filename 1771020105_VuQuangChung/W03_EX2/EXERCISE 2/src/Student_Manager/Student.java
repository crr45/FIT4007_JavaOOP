package Student_Manager;

public class Student {
    private int studentCode;
    private String fullName;
    private float practicePoint, practiceSite;

    public Student() {
        this.studentCode = 0;
        this.practicePoint = 0.0F;
        this.practiceSite = 0.0F;
        this.fullName = "";
    }


    public Student(int studentCode, String fullName, float practicePoint, float practiceSite) {
        this.studentCode = studentCode;
        this.fullName = fullName;
        this.practicePoint = practicePoint;
        this.practiceSite = practiceSite;
    }

    public void setStudentCode(int studentCode) {
        this.studentCode = studentCode;
    }

    public int getStudentCode() {
        return studentCode;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setPracticePoint(float practicePoint) {
        this.practicePoint = practicePoint;
    }

    public float getPracticePoint() {
        return practicePoint;
    }

    public void setPracticeSite(float practiceSite) {
        this.practiceSite = practiceSite;
    }

    public float getPracticeSite() {
        return practiceSite;
    }

    float getAverageScore() {
        return (practicePoint + practiceSite) / 2;
    }

    @Override
    public String toString() {
        return String.format("%-10d %-30s %5.2f %5.2f %5.2f", studentCode, fullName, practicePoint, practiceSite, getAverageScore());
    }
}
