/*
01/07/2025-Java_LAB-H.W :-
Q.WAP to find the max. avg of the marks for the students.
 we have total six students ,
std-1 = 9 subj
std-2 = 5
std-3 = 4
std-4 = 3
std-5 = 7
std-6 = 3
 find max avg of marks over all students and display with num.
 */
import java.util.*;

public class MaxAvgMarks {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // No. of Students :
        System.out.print("Enter number of students: ");
        int numStudents = sc.nextInt();

        int[][] marks = new int[numStudents][];  // Jagged array

        // initialize array :
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter number of subjects for student " + (i + 1) + ": ");
            int subjects = sc.nextInt();
            marks[i] = new int[subjects];
        }

        // Input marks :
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter marks for student " + (i + 1) + ": ");
            for (int j = 0; j < marks[i].length; j++) {
                int mark;
                while (true) {
                    System.out.print("  Subject " + (j + 1) + ": ");
                    mark = sc.nextInt();
                    if (mark >= 0 && mark <= 100) {
                        break;  // valid
                    } else {
                        System.out.println("     Invalid mark. Please enter between 0 and 100.");
                    }
                }
                marks[i][j] = mark;
            }
        }

        // Calculate average for each student and find max
        double maxAvg = -1;
        int maxStudent = -1;

        for (int i = 0; i < numStudents; i++) {
            int sum = 0;
            for (int j = 0; j < marks[i].length; j++) {
                sum += marks[i][j];
            }
            double avg = (double) sum / marks[i].length;

            if (avg > maxAvg) {
                maxAvg = avg;
                maxStudent = i + 1;  // 1-based index
            }
        }

        System.out.println("\n~Student with highest average: Student " + maxStudent + " with average = " + maxAvg);
    }
}
