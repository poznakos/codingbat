public class IcyHot {
    public boolean icyHot(int temp1, int temp2) {
        if(temp1<0 && temp2>100){
            return true;
        }
        if(temp1>100 && temp2<0){
            return true;
        }
        return false;

    }
}
