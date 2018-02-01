package ca.ualberta.cs.lonelytwitter;

/**
 * Created by sajediba on 1/17/18.
 */

public interface Tweetable {


    public String getMessage();

    /**
     * Sets the tweet message
     * @param message tweet message
     * @throws TweetTooLongException thrown if tweet exceeds 160 characters
     */
    public void setMessage(String message) throws TweetTooLongException;
}
