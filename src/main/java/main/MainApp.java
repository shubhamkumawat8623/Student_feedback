package main;

import dao.FeedbackDAO;
import model.Feedback;
import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        FeedbackDAO dao = new FeedbackDAO();

        System.out.println("---- STUDENT FEEDBACK SYSTEM ----");

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        String roll = sc.nextLine();

        System.out.print("Enter Subject: ");
        String subject = sc.nextLine();

        System.out.print("Enter Feedback: ");
        String feedback = sc.nextLine();

        System.out.print("Enter Rating (1-5): ");
        int rating = sc.nextInt();

        Feedback fb = new Feedback(name, roll, subject, feedback, rating);
        dao.addFeedback(fb);

        System.out.println("Feedback Submitted Successfully!");
    }
}
