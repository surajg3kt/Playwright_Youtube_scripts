package testNG_Youtube;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.assertions.LocatorAssertions.ContainsTextOptions;
import com.microsoft.playwright.assertions.PlaywrightAssertions;

import BaseClass.BaseClass;
import PomClass.PomClass;

public class Shorts extends BaseClass
{
  private BrowserContext browsercontext;
  private Page page;
  private PomClass pomclass;
  
  @BeforeMethod
  public void setup()
  {
	  this.browsercontext=super.getContext();
	  this.page=super.getPage();
	  this.pomclass=new PomClass(page);
  }
  
  @Test
  public void test() throws InterruptedException
  {
	 pomclass.ShortsIcon();
	 Thread.sleep(3000);
	 System.out.println(page.title());
	 System.out.println(page.url());
	 if(page.url().contains("shorts"))
	 {
		 System.out.println("shorts page displayed");
	 }
  }
 
  
}
