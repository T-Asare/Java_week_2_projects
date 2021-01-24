public class FlourPacker {
    public static boolean canPack(int bigCount  , int smallCount, int goal){
    int goalDiff = goal - bigCount*5;//because the bigCount is what determines the state of the truth, we first multiply by 5 and subtract from goal.
    if (bigCount < 0 || smallCount < 0 || goal < 0 ||goalDiff<0) { // if any of the key requirements is negative, then the state is false
            return false;
        }
    if (goalDiff<=smallCount){ // if the difference in goal and bigCount is less than or equal to smallCount, then the method resolves to true
        return true;
    }
    else {
        return false;
    }
    }
    
}
