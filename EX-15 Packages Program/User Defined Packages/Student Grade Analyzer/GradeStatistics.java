package edu.grades.analysis;

public class GradeStatistics {
    private int[] grades;
    private int highest;
    private int lowest;
    private double average;

    public GradeStatistics(int[] grades) {
        this.grades = grades;
        calculateStatistics();
    }

    private void calculateStatistics() {
        if (grades.length == 0) return;
        
        highest = grades[0];
        lowest = grades[0];
        double sum = 0;
        
        for (int grade : grades) {
            if (grade > highest) highest = grade;
            if (grade < lowest) lowest = grade;
            sum += grade;
        }
        
        average = sum / grades.length;
    }

    public void displayResults() {
        System.out.println("\nGrade Analysis Results:");
        System.out.println("Highest Grade: " + highest);
        System.out.println("Lowest Grade: " + lowest);
        System.out.printf("Average Grade: %.2f\n", average);
        System.out.println("Grade Distribution:");
        
        int[] frequency = new int[11]; // 0-100 in 10-point ranges
        
        for (int grade : grades) {
            int index = grade / 10;
            if (index > 10) index = 10;
            frequency[index]++;
        }
        
        for (int i = 0; i < frequency.length; i++) {
            int lower = i * 10;
            int upper = (i == 10) ? 100 : lower + 9;
            System.out.printf("%3d-%3d: %s\n", lower, upper, "*".repeat(frequency[i]));
        }
    }
}