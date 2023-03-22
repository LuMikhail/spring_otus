package homework4.domain;

import org.springframework.stereotype.Component;

@Component
public class Student {
    private String firstName;
    private String lastName;
    private int finalScore;

    public Student() {
    }

    public Student(String firstName, String lastName, int finalScore) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.finalScore = finalScore;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getFinalScore() {
        return finalScore;
    }

    public void setFinalScore(int finalScore) {
        this.finalScore = finalScore;
    }

    @Override
    public String toString() {
        return String.format("Student(firstName=%s ,lastName=%s ,finalScore=%s)",
                this.firstName,
                this.lastName,
                this.finalScore);
    }
}
