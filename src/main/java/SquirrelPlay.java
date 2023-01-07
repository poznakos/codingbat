public class SquirrelPlay {
    public boolean squirrelPlay(int temp, boolean isSummer) {
        if ( temp >= 60 && temp <= 90 ) {
            return true;
        }
        if(temp <= 60 && isSummer){
            return false;
        }
        if(temp <= 100 && isSummer){
            return true;
        }
        return false;
    }
}
