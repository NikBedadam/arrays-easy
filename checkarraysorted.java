public class checkarraysorted {
    public static boolean check(int[] arr){
        int violations = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[(i+1)%arr.length]){
                violations++;
                if(violations > 1) return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        int[] arr = {3,5,7,9,11,1};
        System.out.println(check(arr));
    }
}
