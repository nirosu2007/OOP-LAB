import java.util.Scanner;
class Student {
    private String name;
    private int[] marks;
    public void setName(String name) { this.name = name; }
    public void setMarks(int[] marks) { this.marks = marks; }
    public double calculateAverage() {
        double sum = 0;
        for(int mark : marks) sum += mark;
        return sum / marks.length;
    }
    public String getName() { return name; }
}
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        Student stu = new Student();
        System.out.print("Enter student name: ");
        stu.setName(obj.nextLine());
        System.out.print("Enter number of subjects: ");
        int n = obj.nextInt();
        int[] marks = new int[n];
        System.out.println("Enter marks:");
        for(int i=0;i<n;i++) marks[i] = obj.nextInt();
        stu.setMarks(marks);
        System.out.println(stu.getName() + "'s average: " + stu.calculateAverage());
    }
}