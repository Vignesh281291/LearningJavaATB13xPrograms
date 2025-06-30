package ex_19_Arrays;

public class Lab143_2DArrays {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        // 1(0,0)   2(0,1)   3(0,2)
        // 4(1,0)   5(1,1)   6(1,2)
        // 7(2,0)   8(2,1)   9(2,2)
        //System.out.println(array[1][1]);
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array.length; j++)
            {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}