package ass;

public class SecondLargestNum {
    public static void main(String[] args) {
        int[] arr = {23, 39, 49, 57, 24, 44};
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("second largest number:" + arr[arr.length- 2]);
    }
}
