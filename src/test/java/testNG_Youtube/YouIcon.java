package testNG_Youtube;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.assertions.PlaywrightAssertions;

import BaseClass.BaseClass;
import PomClass.PomClass;

public class YouIcon extends BaseClass
{
  private Page page;
  //private BrowserContext browsercontext;
  private PomClass pomclass;
  
  @BeforeMethod
  public void setup() 
  {
	  //this.browsercontext=super.getContext();
	  this.page=super.getPage();
	  this.pomclass=new PomClass(page);
  }
  
  @Test
  public void test()
  {
	 pomclass.YouIcon(); 
	 System.out.println(page.url());
	 PlaywrightAssertions.assertThat(page).hasURL("https://www.youtube.com/feed/you");
  }
}
