package org.baseclassrun;

import java.io.IOException;
import org.helper.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BaseClassHelperRun extends BaseClass {
	public static void main(String[] args) throws IOException, InterruptedException {

          chromeBrowser();
          urlLaunch("http://www.amazon.in");
          toMaximize();
	      WebElement ele = d.findElement(By.xpath("(//div[@data-a-card-type='basic'])[16]"));
	      toScrollDown(ele,0);
	      unconditionalWaits(3);
	      WebElement ell = d.findElement(By.xpath("(//div[@data-a-card-type='basic'])[2]"));
	      toScrollUp(ell, 0);
	}

}
