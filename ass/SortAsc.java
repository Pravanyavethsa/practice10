package ass;

public class SortAsc {
    public static void main(String[] args) {
        int[] arr = {1,3,5,2,4};
        int temp = 0;
        System.out.println("original order");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i]>arr[j]){
                    temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            }
        }
    }
System.out.println("elments of array sorted in ascending order");
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i] + " ");
    }
    }
}
