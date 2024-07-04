package testNG_Youtube;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.assertions.PlaywrightAssertions;

import BaseClass.BaseClass;
import PomClass.PomClass;

public class Subscriptions extends BaseClass
{
  private BrowserContext browsercontext;
  private Page page;
  private PomClass pomclass;
  
  @BeforeMethod
  public void setup() 
  {
	  this.page=super.getPage();
	  this.browsercontext=super.getContext();
	  this.pomclass=new PomClass(page);
  }
  
  @Test
  public void test()
  {
	  pomclass.subscriptionIcon();
	  System.out.println(page.url());
	  PlaywrightAssertions.assertThat(page).hasURL("https://www.youtube.com/feed/subscriptions");
  }
}
