public class ArrayFront9 {
    public boolean arrayFront9(int[] nums) {
        Boolean result = false;

        int maxindex = 0;
        if(nums.length >= 4){
            maxindex = 4;
        } else {
            maxindex = nums.length;
        }
        for(int i=0; i < maxindex; i++){
            int number = nums[i];
            if(number == 9) {
                result = true;
            }
        }
        return result;
    }
}
