public class SameFirstLast {
    public boolean sameFirstLast(int[] nums) {
        if(nums.length == 0){
            return false;
        }
        if(nums.length == 1) {
            return true;
        }
        if(nums[0] == nums[nums.length-1]){
            return true;
        }
        return false;
    }
}