package com.orng.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver;
	public void browserLaunch() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RaMan\\eclipse-workspace\\new\\Selenium\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	public static WebElement findElementByname(String name) {
		return driver.findElement(By.name(name));	
	}
	public static WebElement findElementById(String id) {
		return driver.findElement(By.id(id));	
	}
	public static WebElement findElementByxpath(String xpath) {
		return driver.findElement(By.xpath(xpath));	
	}
	public static WebElement findElementByclass(String cls_Nam) {
		return driver.findElement(By.className(cls_Nam));	
	}
	public static void sendData(WebElement element, String data) {
		element.sendKeys(data);
	}

	public static void click(WebElement element) {
		element.click();
	}
	public static void getData(WebElement element) {
		String pri = element.getText().toString();
		System.out.println(pri);
	}
	public static void impWait() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	public static void jsGetData(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Object print = js.executeScript("return arguments[0].getAttribute('value')", element);
		System.out.println(print);
	}
	public static void getAtt(WebElement element) {
		String pri = element.getAttribute("value");
		System.out.println(pri);
	}
	public static void selectValue(WebElement element, String data) {
		Select box = new Select(element);
		box.selectByValue(data);
	}
	public static void select(WebElement element, String data) {
		Select box = new Select(element);
		box.selectByVisibleText(data);
	}
	public static void clear(WebElement element) {
		element.clear();
	}
	public static void mvToElement(WebElement element) {
		Actions ac = new Actions(driver);
		ac.moveToElement(element);
	}
	
	
	
}
