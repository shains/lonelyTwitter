package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by hains on 1/17/18.
 */

public class Happy extends Mood {

    Happy(Date date){
        super(date);
    }

    Happy(String message){
        super(message);
    }


    @Override
    public boolean isHappy(){
        return true;
    }
}
