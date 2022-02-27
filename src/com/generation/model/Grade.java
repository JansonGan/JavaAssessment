package com.generation.model;

public class Grade {
    private float grading;

    public Grade(float grading) { this.grading = grading; }

    public float getGrading() { return grading; }
    public void setGrading(float grading) { this.grading = grading; }

    @Override
    public String toString() {
        return String.format("Grade: %f", this.grading);
    }
}
