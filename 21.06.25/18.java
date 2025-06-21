public class GradeCalculator {
    public static void main(String[] args) {
        int[] marks = {78, 85, 90, 88, 92};
        int total = 0;
        for (int mark : marks) total += mark;
        double avg = total / (double) marks.length;

        System.out.println("Average: " + avg);
        if (avg >= 90) System.out.println("Grade: A");
        else if (avg >= 80) System.out.println("Grade: B");
        else System.out.println("Grade: C");
    }
}
