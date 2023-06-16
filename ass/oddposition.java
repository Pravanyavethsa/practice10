package ass;

public class oddposition {
    public static void main(String[] args) {
        int[] arr={32,43,54,65,76};
        System.out.println("elements in odd position");
        for(int i=0;i<arr.length;i=i+2)
            System.out.println(arr[i]);
    }
}
