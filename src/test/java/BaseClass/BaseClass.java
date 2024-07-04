package BaseClass;

import java.nio.file.Paths;
import java.util.Collections;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class BaseClass 
{

	Playwright playwright = Playwright.create();

	String chrome = "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe";
    private Browser browser;
    private BrowserContext browserContext;
    private Page page;
    
	 @BeforeClass
	    public void openbr() 
	    {

            browser = playwright.chromium().launch(new
					BrowserType.LaunchOptions().setHeadless(false).
					setArgs(Collections.singletonList("--start-maximized")).
					setExecutablePath(Paths.get(chrome)));
	         browserContext = browser.newContext(new Browser.
					NewContextOptions().setViewportSize(null));
	        page = browserContext.newPage();
	        page.navigate("https://www.youtube.com/");
	    }
	 
	 @AfterClass
	    public void tearDown() 
	    {
		    page.close();
		    browserContext.close();
	        browser.close();
	        playwright.close();
	    }
	 
	 protected Page getPage() 
	 {
		 return page;
	 }
	 protected BrowserContext getContext()
	 { 
		 return browserContext;
	 }
}
