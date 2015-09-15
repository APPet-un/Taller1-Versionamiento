import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class User
{
	public User(){
		
		
	}
	
	public User(String name, String lastName,int age, String username, String password){
		this.name = name;
		this.lastname = lastName;
		this.age = age;
		this.username = username;
		this.password = password;
	}
	
	public String getName(){
                return name;
        }
    	public void setName(String name){
                this.name = name;
        }
	public String getLastName(){
                return lastname;
        }
    	public void setLastName(String lastname){
                this.lastname = lastname;
        }
    	public int getAge(){
                return age;
        }
    	public void setAge(int age){
                this.age = age;
        }
    	public String getUserName(){
                return username;
        }
    	public void setUserName(String username){
                this.username = username;
        }
    	public String getPassword(){
                return password;
        }
    	public void setPassword(String password){
                this.password = password;
        }
   
        
	private String name;
	private String lastName;
	private int age;
	private String username;
	private String password
}
