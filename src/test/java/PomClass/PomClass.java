package PomClass;

import com.microsoft.playwright.Page;

public class PomClass 
{
	private Page page;
	
  public PomClass(Page page)
  {
	  this.page=page;
  }
  
  public void searchTextfield(String Input) 
  {
	  page.locator("//input[@id='search']").fill(Input);
  }
  
  public void searchIcon()
  {
	  page.hover("#search-icon-legacy");
	  page.click("#search-icon-legacy");
  }
  
  public void Hamburgur()
  {
	  page.click("//div[@id='start']/yt-icon-button[2]");
  }
  
  public void ShortsIcon()
  {
	  page.click("//a[@title='Shorts']");
  }
  
  public void subscriptionIcon()
  {
	  page.click("[title='Subscriptions']");
  }
  
  public void YouIcon()
  {
	  page.click("[title='You']");
  }
  
  public void Homebutton()
  {
	  page.click("//ytd-topbar-logo-renderer[@id='logo']");
  }
  
  public void Settings()
  {
	  page.hover("//a[@title='Settings']");
	  page.click("//a[@title='Settings']");
  }
}
