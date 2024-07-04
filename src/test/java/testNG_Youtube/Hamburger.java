package testNG_Youtube;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Page;

import BaseClass.BaseClass;
import PomClass.PomClass;

public class Hamburger extends BaseClass
{
	
    private BrowserContext browserContext;
    private Page page;
    private PomClass Pomclass;
    
    @BeforeMethod
    public void Ham()
    {
    	this.browserContext=super.getContext();
    	this.page=super.getPage();
    	this.Pomclass=new PomClass(page);
    }

  

    @Test
    public void testPlaywright() 
    {
        Pomclass.Hamburgur();
   	    System.out.println("options displayed");
    }
}
