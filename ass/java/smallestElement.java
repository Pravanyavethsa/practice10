package ass.java;

public class smallestElement {
    public static void main(String[] args) {
        int[] arr = {23, 10, 5, 29, 4};
        int min = arr[0];
        for (int i = 0; i < arr.length; i++)
            if (arr[i] < min)
                min = arr[i];
        System.out.println("smallest element in an array:"+min);
    }
}

