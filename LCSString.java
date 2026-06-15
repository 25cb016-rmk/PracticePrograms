import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String x1 = sc.next();
        String x2 = sc.next();

        int rows = x1.length();
        int cols = x2.length();

        int grid[][] = new int[rows + 1][cols + 1];

        int answer = 0;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {

                if (x1.charAt(i - 1) == x2.charAt(j - 1)) {
                    grid[i][j] = grid[i - 1][j - 1] + 1;
                    answer = Math.max(answer, grid[i][j]);
                } else {
                    grid[i][j] = 0;
                }
            }
        }

        System.out.println(answer);
    }
}
