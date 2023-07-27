import java.util.Scanner;

public class Sample {
    
    public static int calculateDistance(String s1, String s2) {
        int[][] p = new int[s1.length() + 1][s2.length() + 1];

        for (int i = 0; i <= s1.length(); i++) {
            for (int j = 0; j <= s2.length(); j++) {
                if (i == 0) {
                    p[i][j] = j;
                } else if (j == 0) {
                    p[i][j] = i;
                } else {
                    int substitution = (s1.charAt(i - 1) == s2.charAt(j - 1)) ? 0 : 1;
                    p[i][j] = Math.min(Math.min(p[i - 1][j] + 1, p[i][j - 1] + 1), p[i - 1][j - 1] + substitution);
                }
            }
        }

        return p[s1.length()][s2.length()];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        int distance = calculateDistance(str1, str2);
        System.out.println("Levenshtein distance: " + distance);

        scanner.close();
    }
}
