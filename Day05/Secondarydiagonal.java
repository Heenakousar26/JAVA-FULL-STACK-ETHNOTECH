package Day05;

public class Secondarydiagonal {
    public static void main(String[] args) {
        diagonal();
        sum();
    }

    public static void diagonal() {
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i + j == (a.length - 1)) {
                    sum += a[i][j];
                }
            }
        }
        System.out.println(sum);
    }

    public static void sum() {
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                sum += a[i][j];

            }
        }
        System.out.println(sum);
    }
}