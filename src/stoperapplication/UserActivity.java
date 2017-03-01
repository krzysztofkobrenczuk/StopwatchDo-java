package stoperapplication;

import java.io.Serializable;

public class UserActivity implements Serializable{
    
    private String description;
    private String timeOfActivity;
    private String dateTime;
     
    UserActivity(String dateTime, String timeOfActivity, String description){
        this.dateTime = dateTime;
        this.timeOfActivity = timeOfActivity;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTimeOfActivity() {
        return timeOfActivity;
    }

    public void setTimeOfActivity(String timeOfActivity) {
        this.timeOfActivity = timeOfActivity;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }    
}
