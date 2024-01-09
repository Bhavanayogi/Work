package utils;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ReusableMethods {
	
	//get drop-down options as list of string for Comparison
	
	
	public List<String> getDropDownOptionsAsList(WebElement element)
	{
		
		Select opt = new Select(element);
		
		List<WebElement> dropdownvalues =opt.getOptions();
		List<String> actualContents = new ArrayList<String>();
		
		for (WebElement ref : dropdownvalues) {
			actualContents.add(ref.getText());
		}
		return actualContents;
		
	}
	
	
	
	

}
