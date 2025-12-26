package dao;

import db.DBConnection;
import model.Feedback;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class FeedbackDAO {

    public void addFeedback(Feedback fb) {
        try {
            Connection con = DBConnection.getConnection();
            String query = "INSERT INTO feedback(student_name, roll_no, subject, feedback, rating) VALUES (?, ?, ?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, fb.getStudentName());
            ps.setString(2, fb.getRollNo());
            ps.setString(3, fb.getSubject());
            ps.setString(4, fb.getFeedback());
            ps.setInt(5, fb.getRating());

            ps.executeUpdate();
            System.out.println("✅ Feedback inserted successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
