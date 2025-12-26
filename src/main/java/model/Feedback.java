package model;

public class Feedback {

    private String studentName;
    private String rollNo;
    private String subject;
    private String feedback;
    private int rating;

    public Feedback(String studentName, String rollNo, String subject, String feedback, int rating) {
        this.studentName = studentName;
        this.rollNo = rollNo;
        this.subject = subject;
        this.feedback = feedback;
        this.rating = rating;
    }

    public String getStudentName() { return studentName; }
    public String getRollNo() { return rollNo; }
    public String getSubject() { return subject; }
    public String getFeedback() { return feedback; }
    public int getRating() { return rating; }
}
 