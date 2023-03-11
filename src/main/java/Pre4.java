public class Pre4 {
    public int[] pre4(int[] nums) {
       int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4) {
               index = i;
               break;
            }
        }

        int[] result = new int[index];

        for (int i = 0; i < result.length; i++) {
            if (nums[i] != 4) {
                result[i] = nums[i];
            }
        }
        return result;
    }
}
