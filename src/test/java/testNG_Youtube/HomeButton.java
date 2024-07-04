package testNG_Youtube;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.assertions.PlaywrightAssertions;

import BaseClass.BaseClass;
import PomClass.PomClass;

public class HomeButton extends BaseClass
{
  private Page page;
  private PomClass pomclass;
  
  @BeforeMethod
  public void setup()
  {
	  this.page=super.getPage();
	  this.pomclass=new PomClass(page);
  }
  
  @Test
  public void test(){
	  {
		 pomclass.YouIcon();
		 pomclass.Homebutton();
		 System.out.println(page.url());
		 PlaywrightAssertions.assertThat(page).hasURL("https://www.youtube.com/");
	  }
  }
}
