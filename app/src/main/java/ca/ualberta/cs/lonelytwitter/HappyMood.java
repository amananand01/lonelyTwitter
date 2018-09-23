package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class HappyMood extends CurrentMood {
    public HappyMood(){
        super();
    }
    public HappyMood(Date date){
        super(date);
    }

    @Override
    public String WhichMood(){
        return "Happy";
    }
}
