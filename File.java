/**
 * Author(s) Sebastian
 */
public class File
{
	//Constructores
	public File()
	{
	}
	
	public File (String fileType, Byte[] content, double size)
	{
		this.fileType= fileType;
		this.content= content;
		this.size= size;
	}
	
	//Variables
	private String fileType;
	Byte[] content;
	double size;
	
	
}