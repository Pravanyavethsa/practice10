package ass;

public class SmallestElement {
    public static void main(String[] args) {
        int[] arr={23,10,57,29,4};
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min)
                min=arr[i];
        }
        System.out.println("smallest element:"+min);
    }
}
