public class removeduplicates {
    public static int duplicates(int[] nums){
        int n = nums.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(nums[i] != nums[j]){
                    nums[i] = nums[j];
                }
            }
            return i+1;
        }
    }
}
