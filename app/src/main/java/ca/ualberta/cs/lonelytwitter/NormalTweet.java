package ca.ualberta.cs.lonelytwitter;

/**
 * Created by sajediba on 1/17/18.
 */

import java.util.Date;

/**
 * Represents an Tweet of type Normal
 * @author hains
 * @version 1.4, Lab 4
 * @see Tweet
 */
public class NormalTweet extends Tweet {

    /**  Constructs a NormalTweet object
     *  @param message tweet message
     */
    NormalTweet(String message){
        super(message);

    }
    /**  Constructs a NormalTweet object
     *  @param date tweet date
     *  @param message tweet message
     */
    NormalTweet(String message, Date date){
        super(message,date);
    }

    /**
     * returns that the NormalTweet object is not important (false)
     * @return returns false
     */
    @Override
    public boolean isImportant(){

        return false;
    }
}
