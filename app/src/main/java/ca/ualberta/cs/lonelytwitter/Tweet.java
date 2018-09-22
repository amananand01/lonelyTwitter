package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

public abstract class Tweet {
    protected String message;
    protected Date date;
    protected ArrayList<CurrentMood> Moods;

    public Tweet(){
        this.Moods=new ArrayList<CurrentMood>();
    }

    public Tweet(String message,Date date,ArrayList<CurrentMood> Moods){
        this.date=date;
        this.message=message;
        this.Moods=Moods;
    }

    public void setMessage(String message) throws TooLongTweetException{

        if(message.length()>140){
            throw new TooLongTweetException();
        }
        this.message=message;
    }

    public void setDate(Date date){
        this.date=date;
    }

    public String getMessage(){
        return this.message;
    }

    public Date getDate(){
        return this.date;
    }

    public abstract Boolean isImportant();

    public abstract static class CurrentMood {

    }
}
