import java.util.Date;

/**
 * Created by Stephanie on 16/09/2015.
 */
public class Post{

	public Post(){}
	
	public Post(String topic, Date dateCreated, Date lastUpdate, boolean isAllowed, ArrayList<files> files){
		this.topic = topic;
		this.dateCreated = dateCreated;
		this.lastUpdate = lastUpdate;
		this.isAllowed = isAllowed;
		this.files = files;
	}

    private String topic;
    private Date dateCreated;
    private Date lastUpdate;
    private boolean isAllowed;
    private ArrayList<File> files;
    
}