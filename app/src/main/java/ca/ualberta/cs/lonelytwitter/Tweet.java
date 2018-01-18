package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by hains on 1/17/18.
 */

public abstract class Tweet implements Tweetable {


    Tweet(){}
    private String message; //won't have access in LonelyTwitterActivity
    private Date date;
    private ArrayList<Mood> currentTweetMood;

    public Tweet(String message){
        this.message = message; //have a class called tweet, and it has a message, 'this' refers to this instance of the object
    }

    public Tweet(String message, Date date){
        this.message = message;
        this.date = date;
    }

    public Date getDate(){
        return date;
    }

    public String getMessage(){
        return message;
    }

    public void setMessage (String message) throws TweetTooLongException{
        if (message.length() > 160){

            throw new TweetTooLongException();
        }
        this.message = message;
    }

    public void setDate(Date date){
        this.date = date;
    }

    public abstract boolean isImportant();


}
