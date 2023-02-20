package Selenium_all_Programs.Selenium_all_Programs;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class NewTest {
  @Test(dataProvider = "getData")
  public void setData(String username, String password) {
	  System.out.println("username is " +username);
	  System.out.println("password is"+password);
  }

  @DataProvider
  public Object[][] getData() {
	  
	  Object[][] data=new Object[3][2];
	  
	  data[0][0]="user1";
	  data[0][1]="vdvccz";
	  
	  data[1][0]="user2";
	  data[1][1]="yaga7";
	  
	  data[2][0]="user3";
	  data[2][1]="akjbfbc";
	  
	return data;
 
  }
}
