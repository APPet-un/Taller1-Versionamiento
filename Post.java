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
	
	public void comment(){
		//TODO
		//if the comment has a file, add it to files
	}
	
	public void rate(){
		//TODO
	}
	
	public void share(){
		//TODO
		//Share the new post
	}
	
    private String topic;
    private Date dateCreated;
    private Date lastUpdate;
    private boolean isAllowed;
    private ArrayList<File> files;
    
}