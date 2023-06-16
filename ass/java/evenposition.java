package ass.java;

public class evenposition {
    public static void main(String[] args) {
        int[] arr={32,43,54,65,76};
        System.out.println("elements present in even position:");
        for(int i=1;i<arr.length;i=i+2)
            System.out.println(arr[i]);
    }
}
