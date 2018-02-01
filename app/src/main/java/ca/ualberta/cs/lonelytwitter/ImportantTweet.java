/**
 * January 31, 2018
 * Copyright 2018, Team X. CMPUT 301. University of Alberta - All Rights Reserved. You may use, distribute, or modify this code under the terms and coditions fo the Code of Student Behaviour at the University of Alberta.
 */

package ca.ualberta.cs.lonelytwitter;

/**
 * Created by sajediba on 1/17/18.
 */

import java.util.Date;

/**
 * Represents an Tweet of type Important
 * @author hains
 * @version 1.4, Lab 4
 * @see Tweet
 */
public class ImportantTweet extends Tweet{

    /** constructs an ImportantTweet object
     *  @param message tweet message
     */
    ImportantTweet(String message){
        super(message);
    }

    /** constructs an ImportantTweet object
     *  @param message tweet message
     *  @param date tweet date
     */
    ImportantTweet(String message, Date date){
       super(message,date);
    }


    /** determines the ImportantTweet object returns True
     *
     * @return returns True
     */
    @Override
    public boolean isImportant(){
        return true;
    }
}
