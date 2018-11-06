package com.lcc.controller;

import org.openqa.selenium.WebDriver;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.lcc.utils.DriverUtil;

@Component
public class UiCaseController {
	private static String path = "C:\\Users\\Administrator\\AppData\\Local\\Google\\Chrome\\Application\\chromedriver.exe";
	
	//@Scheduled(cron = "0/10 * * * * ? ") // 间隔10秒执行
    public void taskCycle() {
        System.out.println("使用SpringMVC框架配置定时任务");
        try {
			WebDriver driver = DriverUtil.runBrowser(path, "https://www.baidu.com");
			driver.close();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
