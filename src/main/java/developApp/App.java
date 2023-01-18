package developApp;

import java.util.ResourceBundle;

public class App 
{
	public int login(String us,String pwd)
	{
		ResourceBundle rb =  ResourceBundle.getBundle("config");
       String username = rb.getString("username");
       String password = rb.getString("password");
       if(us.equals(username)&& pwd.equals(password) )
       {
    	   return 1;
       }
       else 
       {
	    return 0;
	   }
	}
}
