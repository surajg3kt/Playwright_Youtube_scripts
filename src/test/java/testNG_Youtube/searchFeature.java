package testNG_Youtube;

import java.util.Collections;

import org.testng.annotations.*;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.assertions.PlaywrightAssertions;

import BaseClass.BaseClass;
import PomClass.PomClass;

public class searchFeature extends BaseClass
{
	
    //private Browser browser;
    private BrowserContext browserContext;
    private Page page;
    
    private PomClass PomClass;

    @BeforeMethod
    public void setUp() {
        this.page = super.getPage();
        this.browserContext= super.getContext();
         this.PomClass=new PomClass(page);
    }

    @Test(description="Search textfield")
    public void testPlaywright() {
        
       PomClass.searchTextfield("chaleya");
       PomClass.searchIcon();
		System.out.println(page.title());
        System.out.println(page.url());
        PlaywrightAssertions.assertThat(page).hasURL("https://www.youtube.com/results?search_query=chaleya");
    }

    
}
