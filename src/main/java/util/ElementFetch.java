package util;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BaseTest;

public class ElementFetch {

	public WebElement getWebElement(String iType, String iValue) {
		switch (iType) {

		case "XPATH":
			return BaseTest.driver.findElement(By.xpath(iValue));

		case "CSS":
			return BaseTest.driver.findElement(By.cssSelector(iValue));

		case "ID":
			return BaseTest.driver.findElement(By.id(iValue));

		case "CLASS":
			return BaseTest.driver.findElement(By.className(iValue));

		case "LINKTEXT":
			return BaseTest.driver.findElement(By.linkText(iValue));

		case "PARTIALLINKTEXT":
			return BaseTest.driver.findElement(By.partialLinkText(iValue));

		default:
			return null;

		}

	}

	public List<WebElement> getWebElements(String iType, String iValue) {
		switch (iType) {

		case "XPATH":
			return BaseTest.driver.findElements(By.xpath(iValue));

		case "CSS":
			return BaseTest.driver.findElements(By.cssSelector(iValue));

		case "ID":
			return BaseTest.driver.findElements(By.id(iValue));

		case "CLASS":
			return BaseTest.driver.findElements(By.className(iValue));

		case "LINKTEXT":
			return BaseTest.driver.findElements(By.linkText(iValue));

		case "PARTIALLINKTEXT":
			return BaseTest.driver.findElements(By.partialLinkText(iValue));

		default:
			return null;

		}
	}

}
