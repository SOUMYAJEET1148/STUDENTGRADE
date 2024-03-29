import java.util.Scanner;

public class studentgrade {
    public static void main(String[] args) {
        Scanner ref = new Scanner(System.in);

        System.out.println("Enter The Number Of Grades");
        int grades = ref.nextInt();
        int[] arr = new int[grades];

        int grade = 1;
        for (int i = 0; i < grades; i++) {
            System.out.println("Enter The Grade Marks: " + grade);
            arr[i] = ref.nextInt();
            grade++;
        }

        int total = 0;
        for (int i = 0; i < grades; i++) {
            total = arr[i] + total;
        }

        double avg = (double) total / grades;
        System.out.println("Your Average Grade Is = " + avg);
    }

}