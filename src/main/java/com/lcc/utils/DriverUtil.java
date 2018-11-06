package com.lcc.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverUtil {

	/**
	 * 打开一个浏览器页面设置为最大，且返回一个驱动
	 * @param path	指定浏览器驱动位置
	 * @param url 指定访问的Url
	 * @return driver
	 * @throws InterruptedException
	 */
	
	public static WebDriver runBrowser(String path,String url) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", path);
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(url);
	
		return driver;
		
	}
}
