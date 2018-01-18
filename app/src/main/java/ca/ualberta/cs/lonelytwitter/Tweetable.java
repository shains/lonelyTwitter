package ca.ualberta.cs.lonelytwitter;

/**
 * Created by hains on 1/17/18.
 */

public interface Tweetable {
    public String getMessage();
    public void setMessage(String message) throws TweetTooLongException; //any class that impliments this interface should have this method for message etc
}
