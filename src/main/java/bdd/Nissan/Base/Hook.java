package bdd.Nissan.Base;



import static bdd.Nissan.Utils.IConstant.*;

import org.openqa.selenium.devtools.v108.browser.Browser;

import bdd.Nissan.Utils.ReadProperties;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook {
	

	BaseClass baseClass;
	ReadProperties config = new ReadProperties();
	
	@Before
	public void initDriver() {
		baseClass = new BaseClass();
		baseClass.setUpDriver(config.getProperty(BROWSER));
	
	}
	
	//@After
	//public void exitingDriver() {
		//baseClass.tearUp();
		
	//}
	
	

}
