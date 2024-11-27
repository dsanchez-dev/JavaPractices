package arrays;

public class MinMax {
    public static void findMinMax(int[] arr) {
        int min = arr[0], max = arr[0];

        for (int num : arr) {
            if(num >=0){
            if (num > max) max = num;
            if (num < min) min = num;
            }
        }

        System.out.println("Mínimo: " + min + ", Máximo: " + max);
    }

    public static void main(String[] args) {
        int[] nums = {7, 2, 9, -1,4, 1};
        findMinMax(nums); // Mínimo: 1, Máximo: 9
    }
}
