public class MinValue {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 9, 4};
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Minimum value: " + min); // Output: 1
    }
}