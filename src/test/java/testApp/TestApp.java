package testApp;

import org.testng.Assert;
import org.testng.annotations.Test;

import developApp.App;

public class TestApp
{
	@Test
	public void testLogin1() 
	{
		App a=new App();
		Assert.assertEquals(0,a.login("admin", "admin123"));
	}
	@Test
	public void testLogin2()  
	{
		App a=new App();
		Assert.assertEquals(1,a.login("admin", "admin@123"));
	}

	

}
