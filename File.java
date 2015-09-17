/**
 * Author(s) Sebastian
 */
public class File{

	public File(){}
	
	public File(String fileType, Byte[] content, double size){
		this.fileTye = fileType;
		this.content = content;
		this.size = size;
	}
	
	private String fileType;
	private Byte[] content;
	private double size;
}