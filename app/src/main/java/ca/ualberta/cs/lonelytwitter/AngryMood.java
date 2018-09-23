package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class AngryMood extends CurrentMood {
    public AngryMood(){
        super();
    }
    public AngryMood(Date date){
        super(date);
    }

    @Override
    public String WhichMood(){
        return "Angry";
    }
}
