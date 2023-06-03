public class Array123 {
    public boolean array123(int[] nums) {
        Boolean result = false;
        for (int i=0; i<nums.length-2; i++){
            int first = nums[i];
            int secend = nums[i+1];
            int third = nums[i+2];
            if(first == 1 && secend == 2 && third == 3){
                result = true;
            }
        }
        return result;
    }
}
