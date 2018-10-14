package pages;

import bases.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CalcPage extends PageBase {

	@AndroidFindBy(id = "com.android.calculator2:id/digit_5")
	public MobileElement btnNumber5;

	@AndroidFindBy(id = "com.android.calculator2:id/digit_4")
	public MobileElement btnNumber4;

	@AndroidFindBy(id = "com.android.calculator2:id/op_add")
	public MobileElement btnSum;

	@AndroidFindBy(id = "com.android.calculator2:id/eq")
	public MobileElement btnEqual;
	
	@AndroidFindBy(id = "com.android.calculator2:id/result")
	public MobileElement result;

	public void clickNumber(String n) {

		if (n == "5") {
			btnNumber5.click();
			} 
		
		else if (n == "4") {
			btnNumber4.click();

			}
	}

	public void clickSum() {
		btnSum.click();
	}
	
	public void clickEquals() {
		btnEqual.click();
	}

}
