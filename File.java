/**
 * Author(s) Sebastian
 */
<<<<<<< HEAD
public class File{

	public File(){}
	
	public File(String fileType, Byte[] content, double size){
		this.fileTye = fileType;
		this.content = content;
		this.size = size;
	}
	public void download(){
		//TODO
	}
	public void share(){
		//TODO
	}
	private String fileType;
	private Byte[] content;
	private double size;
=======
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
	
	public void prueba()
	{
<<<<<<< HEAD
		//Ahora esta completa tututu diferente mas mas
=======
		
>>>>>>> c240b01832f9267c81190a0147dc46c6671bc418
	}
>>>>>>> BranchSebas
}