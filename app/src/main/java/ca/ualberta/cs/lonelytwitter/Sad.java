package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by hains on 1/17/18.
 */

public class Sad extends Mood {


    Sad(Date date){
        super(date);
    }


    public boolean isHappy(){
        return false;
    }
}
