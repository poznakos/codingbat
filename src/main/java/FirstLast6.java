public class FirstLast6 {
    public boolean firstLast6(int[] nums) {
        if(nums.length == 0){
            return false;
        }
        int first = nums[0];
        int last = nums[nums.length -1];
        if (first == 6 || last == 6) {
            return true;
        }
        return false;
    }
}
