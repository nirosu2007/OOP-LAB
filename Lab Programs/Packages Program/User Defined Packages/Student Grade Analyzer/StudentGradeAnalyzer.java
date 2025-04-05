package edu.grades.analysis;

import java.util.Scanner;

public class StudentGradeAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number of students: ");
        int numStudents = scanner.nextInt();
        
        int[] grades = new int[numStudents];
        
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter grade for student " + (i+1) + ": ");
            grades[i] = scanner.nextInt();
        }
        
        GradeStatistics stats = new GradeStatistics(grades);
        stats.displayResults();
        
        scanner.close();
    }
}

