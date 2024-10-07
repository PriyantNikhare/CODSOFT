import java.util.Scanner;

public class STUDENT_GRADE_CALCULATOR {
    public STUDENT_GRADE_CALCULATOR() {
    }

    public static void calculateResults(int[] var0, int var1) {
        int var2 = 0;
        int[] var3 = var0;
        int var4 = var0.length;

        for (int var5 = 0; var5 < var4; ++var5) {
            int var6 = var3[var5];
            var2 += var6;
        }

        double var7 = (double) var2 / (double) var1;
        String var8;
        if (var7 >= 90.0) {
            var8 = "A+";
        } else if (var7 >= 80.0) {
            var8 = "A";
        } else if (var7 >= 70.0) {
            var8 = "B";
        } else if (var7 >= 60.0) {
            var8 = "C";
        } else if (var7 >= 50.0) {
            var8 = "D";
        } else {
            var8 = "F";
        }

        System.out.println("\n--- Results ---");
        System.out.println("Total Marks: " + var2);
        System.out.println("Average Percentage: " + var7 + "%");
        System.out.println("Grade: " + var8);
    }

    public static void main(String[] var0) {
        Scanner var1 = new Scanner(System.in);
        System.out.print("Enter the number of subjects: ");
        int var2 = var1.nextInt();
        int[] var3 = new int[var2];

        for (int var4 = 0; var4 < var2; ++var4) {
            System.out.print("Enter marks obtained in Subject " + (var4 + 1) + ": ");
            var3[var4] = var1.nextInt();
        }

        calculateResults(var3, var2);
    }
}