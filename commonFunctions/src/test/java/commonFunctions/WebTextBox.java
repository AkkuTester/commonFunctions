package commonFunctions;

import org.openqa.selenium.WebElement;

public class WebTextBox {
	
	/*
	 * purpose to find whether the element is present in the dom or not
	 */
	public static boolean isPresent(WebElement element) {
		
		boolean isPre = false;
		if(element.isDisplayed()) {
			isPre = true;
		}
		return isPre;
	}
	
	/*
	 *  checks whether element is clickable or not
	 */
	
	public static boolean isClickable(WebElement element) {
		
		boolean isClick = false;	
		if(isPresent(element)) {
			
			if(element.isEnabled()) {
				isClick = true;
			}
		}
		return isClick;
	}
	

}

