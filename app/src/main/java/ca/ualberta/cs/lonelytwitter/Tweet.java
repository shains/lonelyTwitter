/*

 * January 31, 2018
 * Copyright 2018, Team X. CMPUT 301. University of Alberta - All Rights Reserved. You may use, distribute, or modify this code under the terms and coditions fo the Code of Student Behaviour at the University of Alberta.
 */

package ca.ualberta.cs.lonelytwitter;

/**
 * Created by sajediba on 1/17/18.
 */

import java.util.Date;

/**
 * Represents a tweet.
 *
 * @author shains
 * @version 1.5
 * @see NormalTweet
 * @see ImportantTweet
 */

public abstract class Tweet implements Tweetable{

    private String message;
    private Date date;




    Tweet(){

    }

    /**
     * Constructs a tweet object that takes only a message as the parameter
     * @param message tweet message
     */

    public Tweet(String message){
        this.message = message;
    }

    /**
     * Constructs a tweet object
     * @param message tweet message
     * @param date tweet date
     */

    public Tweet(String message, Date date){
        this.message = message;
        this.date = date;
    }

    /**
     * Returns the date
     * @return date
     */
    public Date getDate(){
        return date;

    }
    /**
     * Returns the message
     * @return message
     */
    public String getMessage(){

        return message;
    }

    /**
     * Sets tweet message
     * @param message
     * @throws TweetTooLongException thrown if tweet exceeds 160 characters
     */

    public void setMessage(String message) throws TweetTooLongException{
        if(message.length() > 160){
            // throw an error
            throw new TweetTooLongException();
        }

        this.message = message;
    }
    /**
     * Allows the user to enter a date
     * @param date the entered date
     */
    public void setDate(Date date){
        this.date = date;
    }

    /**
     * Determines if the object is of type important or not
     * @return date the entered date
     */
    public boolean isImportant(){
        return true;
    };

    /**
     * converts object address to a string
     * @return message the entered message
     */
    @Override
    public String toString(){
        return message;
    }
}
