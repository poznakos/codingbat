public class Has12 {


    public boolean has12(int[] nums) {
         boolean isTwoInArray = false;
        boolean isOneInArray = false;
        int indexOfTwo = 0;
        boolean result = false;
        int indexOfOne = 0;


        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1 ) {
                indexOfOne = i;
                isOneInArray = true;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2 ) {
                indexOfTwo = i;
                isTwoInArray = true;
            }
        }
        if(!isOneInArray || !isTwoInArray){
            return false;
        }
        if(indexOfTwo > indexOfOne)
            return true;

        return false;
    }
}
