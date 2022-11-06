public class Double23 {
    public boolean double23(int[] nums) {
        if(nums.length == 2){
            int first = nums[0];
            int last = nums[1];
            if((first == 2 || first == 3) && first == last){
                return true;
            }
        }
        return false;
    }
}
