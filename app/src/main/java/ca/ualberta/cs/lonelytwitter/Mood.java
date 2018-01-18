package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by hains on 1/17/18.
 */

public abstract class Mood {

    Mood(){}
    private String message;
    private Date date;

    public Date getDate(){
        return date;
    }

    public Mood(String message, Date date) {
        this.message = message;
        this.date = date;
    }

    public Mood(Date date) {
        this.date = date;
    }


    public void setDate(Date date){
        this.date = date;
    }

    public abstract boolean isHappy();



}
