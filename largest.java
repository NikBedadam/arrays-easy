public class largest {
    public static void main(String args[]){
        int[] arr = {1,4,3,1,9,49,7,9};
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}