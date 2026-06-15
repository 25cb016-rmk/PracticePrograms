import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int R = sc.nextInt();
        int C = sc.nextInt();

        int[][] grid = new int[R][C];

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        long[] prev = new long[C];

        for (int j = 0; j < C; j++) {
            prev[j] = grid[0][j];
        }

        for (int i = 1; i < R; i++) {

            long fmax = Long.MIN_VALUE;
            long smax = Long.MIN_VALUE;

            for (int j = 0; j < C; j++) {

                if (prev[j] > fmax) {
                    smax = fmax;
                    fmax = prev[j];
                } else if (prev[j] > smax) {
                    smax = prev[j];
                }
            }

            long[] curr = new long[C];

            for (int j = 0; j < C; j++) {
                curr[j] = grid[i][j]
                        + (prev[j] == fmax ? smax : fmax);
            }

            prev = curr;
        }

        long ans = Long.MIN_VALUE;

        for (int j = 0; j < C; j++) {
            ans = Math.max(ans, prev[j]);
        }

        System.out.println(ans);
    }
}
