package ex_19_Arrays;

public class Lab152_TransposeMatrix {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}};
        int rows = a.length;
        int cols = a[0].length;
        System.out.println(rows);
        System.out.println(cols);
        int[][] transpose = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = a[i][j];
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
        System.out.println("Transpose is:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transpose[i][j]);
            }
            System.out.println();
        }
    }
}
