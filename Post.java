import java.util.Date;

/**
 * Created by Stephanie on 16/09/2015.
 */
public class Post{

<<<<<<< HEAD
    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public boolean isAllowed() {
        return isAllowed;
    }

    public void setIsAllowed(boolean isAllowed) {
        this.isAllowed = isAllowed;
    }

    public ArrayList<File> getFiles() {
        return files;
    }

    public void setFiles(ArrayList<File> files) {
        this.files = files;
    }
=======
	public Post(){}
	
	public Post(String topic, Date dateCreated, Date lastUpdate, boolean isAllowed, ArrayList<files> files){
		this.topic = topic;
		this.dateCreated = dateCreated;
		this.lastUpdate = lastUpdate;
		this.isAllowed = isAllowed;
		this.files = files;
	}
>>>>>>> 713582fe08fc1f5e2b556356c5fe2e3a37a9136c

    private String topic;
    private Date dateCreated;
    private Date lastUpdate;
    private boolean isAllowed;
    private ArrayList<File> files;
    
}