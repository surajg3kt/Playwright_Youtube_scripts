package testNG_Youtube;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Page;

import BaseClass.BaseClass;
import PomClass.PomClass;

public class SettingsOption extends BaseClass
{
	 private BrowserContext browserContext;
	    private Page page;
	    private PomClass Pomclass;
	    
	    @BeforeMethod
	    public void setup()
	    {
	    	this.browserContext=super.getContext();
	    	this.page=super.getPage();
	    	this.Pomclass=new PomClass(page);
	    }

	  
	    @Test
	    public void test() 
	    {
	        Pomclass.Hamburgur();
	   	 System.out.println("options displayed");
	   	 
	        Pomclass.Settings();
	        
	    }
}
