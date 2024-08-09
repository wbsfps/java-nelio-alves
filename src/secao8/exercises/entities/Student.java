package secao8.exercises.entities;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private List<Double> notes = new ArrayList<>();

    public Student(List<Double> notes) {
        this.notes = notes;
    }

    public List<Double> showNotes() {
        return notes;
    }

    public String isApproved(List<Double> notes) {
        double sum = 0;
        for (Double note : notes) {
            sum += note;
        }
        String verification = (sum >= 60) ? String.format("FINAL GRADE = %.2f \n PASS", sum) : String.format("Failed \n Missing %.2f", 60-sum);;
        return verification;
    }
}
