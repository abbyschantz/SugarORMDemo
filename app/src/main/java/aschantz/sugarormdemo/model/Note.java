package aschantz.sugarormdemo.model;

import com.orm.SugarRecord;

/**
 * Created by aschantz on 11/3/16.
 */
public class Note extends SugarRecord {

    //if you add a new field here, increase the database version
    //right now it would be two, just title and description, but if we add details, we change it to 3
    //change in AndroidManifest.xml <meta-data android:name="VERSION" android:value="2" />
    private String title;
    private String description;

    //empty public constructor
    public Note() {

    }

    /**
     * Constructor, command n
     */
    public Note(String title, String description) {
        this.title = title;
        this.description = description;
    }


    /**
     * Getters and Settles (command n)
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
