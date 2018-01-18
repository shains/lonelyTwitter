package ca.ualberta.cs.lonelytwitter;

/**
 * Created by hains on 1/17/18.
 */
import java.util.Date;

public class NormalTweet extends Tweet {
    NormalTweet(String message){
        super(message);
    }

    NormalTweet(String message, Date date){
        super(message,date);
    }

    public boolean isImportant(){
        return false;
    }
}
