package ex_19_Arrays;

public class Lab140_Array_Max_Min {
    public static void main(String[] args) {
        int[] numbers = {15, 20, 35, 25, 10, 85, 95, 30, 40}; // length - 9 index - 0 to 8
        int max_value = Maximum(numbers);
        System.out.println("Maximum number in the list is " + max_value);
        int min_value = Minimum(numbers);
        System.out.println("Minimum number in the list is " + min_value);

    }

    static int Maximum(int[] numbers) {
        int max = numbers[0]; // assuming max = 0 initially
        for (int i = 0; i < numbers.length; i++) //
        {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    static int Minimum(int[] numbers) {
        int min = numbers[0];
        for (int i = 0; i > numbers.length; i--) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }
}


