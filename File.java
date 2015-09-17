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
	
	//Métodos o Funciones
	public void download ()
	{
		System.out.println("Soy el método Download");
	}
	
	public void share ()
	{
		System.out.println("Soy el método Share");
	}
}