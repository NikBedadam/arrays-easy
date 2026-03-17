import java.util.Arrays;

public class secondLargest {
    public static void main(String args[]){
        int[] arr = {1,4,3,1,9,49,7,9};
        System.out.println(scndLargest(arr));
    }
    public static int scndLargest(int[] arr){
        Arrays.sort(arr);
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i] != arr[arr.length-1]){
                return arr[i];
            } 
        }
        return -1;
    }
}
