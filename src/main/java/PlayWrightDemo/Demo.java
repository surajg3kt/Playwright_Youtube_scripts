package PlayWrightDemo;

import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Demo 
{
	  public static void main(String[] args) 
	  {
	    try (Playwright playwright = Playwright.create()) 
	    {
	      Browser browser = playwright.webkit().launch(new BrowserType.LaunchOptions().setHeadless(false));
	      Page page = browser.newPage();
	      page.navigate("https://playwright.dev/");
	     // page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("example.png")));
	      System.out.println("PlayWright displayed successfully");
	    }
	  }
}